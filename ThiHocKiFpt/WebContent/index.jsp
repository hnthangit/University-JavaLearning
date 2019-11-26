<%@page import="bean.HoatDongBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="bootstrap.min.css" rel="stylesheet" />
</head>
<body>
	<table class="table">
		<thead>
			<tr>
				<th scope="col">Mã HĐ</th>
				<th scope="col">Tên HĐ</th>
				<th scope="col">Mô tả HĐ</th>
				<th scope="col">Ngày giờ BĐ</th>
				<th scope="col">Ngày giờ KT</th>
				<th scope="col">SL Tối thiểu</th>
				<th scope="col">SL Tối đa</th>
				<th scope="col">Thời hạn đk</th>
				<th scope="col">Trang thái</th>
				<th scope="col">Trưởng đoàn</th>
				<th scope="col">Xử lí</th>
			</tr>
		</thead>
		<tbody>
			<%
				ArrayList<HoatDongBean> listHoatDong = new ArrayList<>();
				listHoatDong = (ArrayList<HoatDongBean>) request.getAttribute("listHoatDong");
				for (HoatDongBean hoatDong : listHoatDong) {
			%>
			<tr>
				<th scope="row"><%=hoatDong.getMahd() %></th>
				<td><%=hoatDong.getTenhd() %></td>
				<td><%=hoatDong.getMotahd() %></td>
				<td><%=hoatDong.getNgaygiobd() %></td>
				<td><%=hoatDong.getNgaygiokt() %></td>
				<td><%=hoatDong.getSltoithieuyc() %></td>
				<td><%=hoatDong.getSltoidayc() %></td>
				<td><%=hoatDong.getThoihandk() %></td>
				<td><%=hoatDong.getTrangthai() %></td>
				<td><%=hoatDong.getMatv() %></td>
				<%
					if (hoatDong.getTrangthai().equals("Da ket thuc")) {
				%>
				<td><a class="btn btn-primary" href="edit?id=<%=hoatDong.getMahd()%>">Sửa</a></td>
				<%
					} else {
				%>
				<td>
					<a class="btn btn-primary" href="edit?id=<%=hoatDong.getMahd()%>">Sửa</a>
					<a class="btn btn-warning" href="delete?id=<%=hoatDong.getMahd()%>">Xóa</a>
				</td>
				<%} %>

			</tr>

			<%} %>
		</tbody>
	</table>
</body>
</html>