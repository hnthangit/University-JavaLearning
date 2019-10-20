
<%@page import="java.util.ArrayList"%>
<%@page import="bean.SachBean"%>
<%@page import="bo.SachBo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
	<%
		SachBo sachBo = new SachBo();
	ArrayList<SachBean> ds = sachBo.getListSach();
	int ss= ds.size();
	for(int i= 0; i<ss; i++){
		SachBean sach =ds.get(i);
		%>
		<tr>
		<td>
		<img alt="" src="<%=sach.getAnh() %>">
		<br>
		<%=sach.getTensach() %><br>
		<%=sach.getGia() %><hr>
		</td>
		</tr>
		for (SachBean sach : sachBo.getListSach()) {
	%>
	<a href="htsach.jsp?masach=<%=sach.getMasach()%>&tensach=<%=sach.getTensach()%>&tacgia=<%=sach.getTacgiac()%>&gia=<%=sach.getGia()%>&anh=<%=sach.getAnh()%>"><%=sach.getMasach()%></a>
	<%
		}
	%>
<!-- 	<%
		String ma = request.getParameter("masach");
		String ten = request.getParameter("tensach");
		String tacgia = request.getParameter("tacgia");
		String gia = request.getParameter("gia");
		String anh = request.getParameter("anh");

		if (ma != null && ten != null && tacgia != null && gia != null && anh != null) {
	%>
	<table>
		<tr>
			<td>Ma</td>
			<td><%=ma%></td>
		</tr>
		<tr>
			<td>Ten sach</td>
			<td><%=ten%></td>
		</tr>
		<tr>
			<td>Tac gia</td>
			<td><%=tacgia%></td>
		</tr>
		<tr>
			<td>Gia</td>
			<td><%=gia%></td>
		</tr>
		<tr>
			<td>Anh</td>
			<td><img src="<%=anh%>"></td>
		</tr>


	</table>
	<%
		}
	%> -->
	</table>
</body>
</html>