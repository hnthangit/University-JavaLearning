<%@page import="bo.GioHangBo"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bean.SachBean"%>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link rel="stylesheet" href="bootstrap.min.css">
</head>
<body>
	<%
		if (session.getAttribute("un") == null) {

			response.sendRedirect("login.jsp");
		}
	%>
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark"> <a class="navbar-brand" href="#">Navbar</a>
	<div class="navbar-nav">
		<a class="nav-item nav-link" href="t1.jsp">San pham</a>

		<%
			if (session.getAttribute("un") != null) {
				//out.print("Chao mung ban: "+ session.getAttribute("un")+ " den voi trang web");
				if (session.getAttribute("giohang") != null) {
					GioHangBo gh = (GioHangBo)session.getAttribute("ds");
					if (gh== null) {
		%>
		<a class="nav-item nav-link" href="t2.jsp">Gio hang: 0</a>
		<%
			} else {
		%>
		<a class="nav-item nav-link" href="t2.jsp">
			Gio hang(
			<%=gh.ds.size() + ": " + gh.tong()%>)
		</a>

		<%
			}
				}
		%>
		<a class="nav-link" href="login.jsp"><%=session.getAttribute("un")%></a>
		<%
			} else {
		%>
		<a class="nav-link" href="login.jsp">Dang nhap</a>
		<%
			}
		%>

		<a class="nav-item nav-link" href="dangxuat.jsp">Dang xuat</a>
	</div>
	</nav>
	<table class="table" align="center" width="800px">
		<tr>
			<th scope="col">Hinh anh</th>
			<th scope="col">Ten</th>
			<th scope="col">Gia</th>
			<th scope="col"></th>
		</tr>
		<%
		
			ArrayList<SachBean> ds = (ArrayList<SachBean>)request.getAttribute("dssach");
			int ss = ds.size();
			for (int i = 0; i < ss; i++) {
				SachBean sach = ds.get(i);
		%>

		<tr>
			<td>
				<img alt="" src="<%=sach.getAnh()%>">
			</td>
			<td>
				<%=sach.getTensach()%>
			</td>
			<td>
				<%=sach.getGia()%>
			</td>
			<td>
			<%request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("utf-8"); %>
				<a href="sanphamcontroller?masach=<%=sach.getMasach()%>&tensach=<%=sach.getTensach()%>&tacgia=<%=sach.getTacgia()%>&gia=<%=sach.getGia()%>">
					<img src="datmua.png">
				</a>
			</td>
		</tr>
		<%
			}
		%>
	</table>
<table width="1000" align="center">
<tr>

</tr>
</table>

</body>
</html>