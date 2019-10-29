<%@page import="bean.GioHangBean"%>
<%@page import="bo.GioHangBo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
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
					GioHangBo gh = (GioHangBo) session.getAttribute("giohang");
					if (gh.ds.size() == 0) {
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
	<div class="my-2 float-right">
		<a href="ktgio.jsp?thaydoi=2" class="btn btn-warning">Xoa het gio hang</a>
	</div>
	<form action="ktgio.jsp" method="get">
	<table class="table">
		<tr>
			<th scope="col">Ma</th>
			<th scope="col">Ten</th>
			<th scope="col">Tac Gia</th>
			<th scope="col">Gia 1 cuon</th>
			<th scope="col">So Luong</th>
			<th scope="col">Thay Doi So Luong</th>
			<th scope="col">Thanh Tien</th>
			<th scope="col">Thao Tac</th>
		</tr>
		<%
			if (session.getAttribute("giohang") != null) {
				GioHangBo gh = (GioHangBo) session.getAttribute("giohang");
				if (gh.ds.size() == 0) {
					response.sendRedirect("t1.jsp");
				} else {
					for (GioHangBean g : gh.ds) {
		%>
		<tr>
			<td><%=g.getMasach()%></td>
			<td><%=g.getTensach()%></td>
			<td><%=g.getTacgia()%></td>
			<td><%=g.getGia()%></td>
			<td><%=g.getSoluong()%></td>
			<td>
				<div class="form-inline" >
				 <input class="form-control" type="hidden" name="masachthaydoi" value="<%=g.getMasach()%>"> 
					<input class="form-control" type="text" name="soluongthaydoi" value="">
					
					 <button class="btn btn-primary" type="submit" name="luu" value="<%=g.getMasach()%>">Luu</button>
				</div>
			</td>
			<td><%=g.getThanhtien()%></td>
			<td>
				<input name="checkboxxoa" class="" type="checkbox" value="<%=g.getMasach()%>">
				<a class="btn btn-warning" href="ktgio.jsp?masach=<%=g.getMasach()%>&thaydoi=0">Xoa</a>
			</td>
		</tr>
		<%
			}
					out.print("<h1 style='color: red'> Tong tien: " + gh.tong() + "</div>");
				}
			}
			//neu mua them sach thi phai tang so luong len
			//tao them 1 form de sua so luong
			//trang 1 : trang chu mat hang
			//trang 2 :gio hang
			//lick dat mua, neu chua dang nhap thi phai dang nhap thi moi dc dat mua
			//lam bai tap tao va hien thi gio hang
		%>
	</table>
	<button type="submit" name="thaydoi" value="1" class="btn btn-warning">Xoa cac muc da chon</button>
	<div>
	
	</div>
</form>
</body>
</html>