<%@page import="bean.GioHangBean"%>
<%@page import="bo.GioHangBo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<%
			if (session.getAttribute("giohang") != null) {
				GioHangBo gh = (GioHangBo) session.getAttribute("giohang");
				for (GioHangBean g : gh.ds) {
		%>
		<tr>
			<td><%=g.getMasach()%></td>
			<td><%=g.getTensach()%></td>
			<td><%=g.getTacgia()%></td>
			<td><%=g.getGia()%></td>
			<td><%=g.getSoluong()%></td>
			<td>
				<form action="ktgio.jsp?thaydoi=1" method="get">
					<input type="hidden" name="masachthaydoi" value="<%=g.getMasach() %>"> 
					<input type="text" name="soluongthaydoi"> 
					<input type="submit" value="Luu">
				</form>
			</td>
			<td><%=g.getThanhtien()%></td>
			<td>
				<a href="ktgio.jsp?masach=<%=g.getMasach()%>&thaydoi=0">Xoa</a>
			</td>
		</tr>
		<%
			}
				out.print(gh.tong());
			}
			//neu mua them sach thi phai tang so luong len
			//tao them 1 form de sua so luong
			//trang 1 : trang chu mat hang
			//trang 2 :gio hang
			//lick dat mua, neu chua dang nhap thi phai dang nhap thi moi dc dat mua
			//lam bai tap tao va hien thi gio hang
		%>
	</table>

</body>
</html>