<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="bootstrap.min.css">
<title>Insert title here</title>
</head>
<body>
	<form class="" action="https://ums-husc.hueuni.edu.vn/Student/Account/Login" method="post">
		<input name="__RequestVerificationToken" type="hidden" value="O4wutWJ_XwcDUep3l3bOYA2Adz_Vrm0o_6wgRCwgu5dwAPEFeTKOt-0UfTANsaFgAxMHiWgWFnD6d2bk5hMtieqW9LM1"> <input class="form-control"
			name="loginId" id="loginId" type="text"> <input class="form-control" name="password" id="password" type="password" value="Dang nhap"> <input class="btn btn-primary" type="submit"
			value="dang nhap"> <select></select>
	</form>
	<br>
	<br>
	<form class="form-group">
		<table>
			<tr>
				<td><label>Nhap username</label></td>
				<td><input class="form-control" type="text" placeholder="Nhap username"></td>
				<td><label>Nhap hoten</label></td>
				<td><input class="form-control" type="text" placeholder="Nhap ho va ten"></td>

			</tr>
			<tr>
				<td><label>Nhap mat khau</label></td>
				<td><input class="form-control" type="password" placeholder="Nhap password"></td>
				<td><label>Chon gioi tinh</label></td>
				<td><select class="form-control"oo*+>
						<option disabled selected>Chon gioi tinh</option>
						<option>Nam</option>
						<option>Nu</option>

				</select></td>
			</tr>
			<tr>
				<td><label>Nhap lai mat khau</label></td>
				<td><input class="form-control" type="password" placeholder="Nhap lai password"></td>
				<td><label>Ngay<label></td>
				<td><select class="form-control">
						<option disabled selected>Chon ngay</option>
						<option>Nam</option>
						<option>Nu</option>

				</select></td>
				<td><label>Thang<label></td>
				<td><select class="form-control">
						<option disabled selected>Chon thang</option>
						<option>Nam</option>
						<option>Nu</option>

				</select></td>
				<td><label>Nam<label></td>
				<td><select class="form-control">
						<option disabled selected>Chon nam</option>
						<option>Nam</option>
						<option>Nu</option>

				</select></td>
			</tr>
			<tr>
				<td><label>Nhap dia chi email</label></td>

				<td><inpu class="form-control" t type="password" placeholder="Nhap password"></td>
				<td><label>Tinh/TP</label></td>
				<td><select class="form-control">
						<option disabled selected>Chon Tinh</option>
						<option>Nam</option>
						<option>Nu</option>

				</select></td>
			</tr>
			<tr>
				<td><label>Nhap lai email</label></td>
				<td><input class="form-control" type="password" placeholder="Nhap lai email"></td>
				<td><label>Nhap ma xac nhan</label></td>
				<td><input type="text" placeholder="Nhap ma xac nhan"></td>
			</tr>
			<tr>
				<td><input class="btn btn-primary" type="submit" value="Dang ky"></td>
				<td><input type="radio"> <span>Toi dong y</span></td>

			</tr>
		</table>
	</form>

	<%
		Calendar calendar = Calendar.getInstance();
	%>
	<%
		int ngay = calendar.get(Calendar.DAY_OF_MONTH);
	%>
	<%
		int nam = calendar.get(Calendar.YEAR);
	%>
	<%
		int thang = calendar.get(Calendar.MONTH) + 1;
	%>


	Hom nay, ngay
	<%=ngay%>
	thang
	<%=thang%>
	nam
	<%=nam%>
	<br> Chon ngay
	<select name="sngay">
		<%
			for (int i = 1; i <= 31; i++) {
		%>
		<%
			if (i == ngay) {
		%>
		<option selected>
			<%=i%>
		</option>
		<%
			} else {
		%>
		<option>
			<%=i%>
		</option>
		<%
			}
		%>
		<%
			}
		%>
	</select>
	<br> Chon thang
	<select name="sthang">
		<%
			for (int i = 1; i <= 12; i++) {
		%>
		<%
			if (i == thang) {
		%>
		<option selected>
			<%=i%>
		</option>
		<%
			} else {
		%>
		<option>
			<%=i%>
		</option>
		<%
			}
		%>
		<%
			}
		%>
	</select>
	<br> Chon nam
	<select name="snam">
		<%
			for (int i = nam - 10; i <= nam; i++) {
		%>
		<%
			if (i == nam) {
		%>
		<option selected>
			<%=i%>
		</option>
		<%
			} else {
		%>
		<option>
			<%=i%>
		</option>
		<%
			}
		%>
		<%
			}
		%>
	</select>



























</body>
</html>