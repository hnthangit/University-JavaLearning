<%@page import="bean.SachBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bo.LoaiBo"%>
<%@page import="bean.LoaiBean"%>
<%@page import="bo.SachBo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		LoaiBo loaiBo = new LoaiBo();
		ArrayList<SachBean> sach = new ArrayList<>();
		for (LoaiBean loaiSach : loaiBo.getListLoaiSach()) {
			sach = loaiSach.getSachBean();
	%>
	<a href="htsach.jsp?
	maloai=<%=loaiSach.getMaLoai()%>
	&tenloai=<%=loaiSach.getTenLoai()%>"><%=loaiSach.getMaLoai()%></a>
	<%
		}
	%>
	<%
		String ma = request.getParameter("maloai");
		String ten = request.getParameter("tenloai");

		if (ma != null && ten != null) {
	%>
	<table>
		<tr>
			<td>Ma loai</td>
			<td><%=ma%></td>
		</tr>
		<tr>
			<td>Ten loai</td>
			<td><%=ten%></td>
		</tr>
		<tr>
			<td>Ten loai</td>
			<td>
			<%
		for (SachBean sachItem : sach) {
			
	%>
	<%=sachItem.getTensach() %>
	<%
		}
	%>
			</td>
		</tr>
		
	</table>
	<%
		}
		
	%>
</body>
</html>