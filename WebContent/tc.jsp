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
<!-- 	<form class="" action="https://ums-husc.hueuni.edu.vn/Student/Account/Login" method="post">
		<input name="__RequestVerificationToken" type="hidden" value="O4wutWJ_XwcDUep3l3bOYA2Adz_Vrm0o_6wgRCwgu5dwAPEFeTKOt-0UfTANsaFgAxMHiWgWFnD6d2bk5hMtieqW9LM1"> <input class="form-control"
			name="loginId" id="loginId" type="text"> <input class="form-control" name="password" id="password" type="password" value="Dang nhap"> <input class="btn btn-primary" type="submit"
			value="dang nhap"> <select></select>
	</form> -->
	<%
	String username = request.getParameter("username");
	String matkhau = request.getParameter("matkhau");
	String nhaplaimatkhau = request.getParameter("nhaplaimatkhau");
	String email = request.getParameter("email");
	String nhaplaiemail = request.getParameter("nhaplaiemail");
	String gioitinh = request.getParameter("gioitinh");
	String ngay = request.getParameter("ngay");
	String thang = request.getParameter("thang");
	String nam = request.getParameter("nam");
	if(username!=null && matkhau!=null && nhaplaimatkhau!=null && email!=null && nhaplaiemail!=null && gioitinh!=null && ngay!=null && thang!=null && nam!=null){
		if(matkhau.equals(nhaplaiemail) && email.equals(nhaplaiemail)){
			response.sendRedirect("tc.jsp?kt=dung");
		}
		else
			response.sendRedirect("tc.jsp?kt=sai");
	}
	%>
	<%
		String kt = request.getParameter("kt");
		if (kt != null && kt.equals("dung"))
			out.print("Dk thanh cong");
		else {
	%>
	<br>
	<br>
	<form class="form-group" method="post" action="tc.jsp">
		<table>
			<tr>
				<td><label>Nhap username</label></td>
				<td><input class="form-control" type="text" name="username" placeholder="Nhap username"></td>
				<td><label>Nhap hoten</label></td>
				<td><input class="form-control" type="text" name="hoten" placeholder="Nhap ho va ten"></td>

			</tr>
			<tr>
				<td><label>Nhap mat khau</label></td>
				<td><input class="form-control" type="password" name="matkhau" placeholder="Nhap password"></td>
				<td><label>Chon gioi tinh</label></td>
				<td><select class="form-control" name="gioitinh">
						<option disabled selected>Chon gioi tinh</option>
						<option>Nam</option>
						<option>Nu</option>

				</select></td>
			</tr>
			<tr>
				<td><label>Nhap lai mat khau</label></td>
				<td><input class="form-control" type="password" name="nhaplaimatkhau" placeholder="Nhap lai password"></td>
				<td><label>Ngay<label></td>
				<td><select class="form-control" name="ngay">
						<option disabled selected>Chon ngay</option>
						<option>Nam</option>
						<option>Nu</option>

				</select></td>
				<td><label>Thang<label></td>
				<td><select class="form-control" name="thang">
						<option disabled selected>Chon thang</option>
						<option>Nam</option>
						<option>Nu</option>

				</select></td>
				<td><label>Nam<label></td>
				<td><select class="form-control" name="nam">
						<option disabled selected>Chon nam</option>
						<option>Nam</option>
						<option>Nu</option>

				</select></td>
			</tr>
			<tr>
				<td><label>Nhap dia chi email</label></td>

				<td><input class="form-control" type="text" name="email" placeholder="Nhap password"></td>
				<td><label>Tinh/TP</label></td>
				<td><select class="form-control" name="tinh">
						<option disabled selected>Chon Tinh</option>
						<option>Nam</option>
						<option>Nu</option>

				</select></td>
			</tr>
			<tr>
				<td><label>Nhap lai email</label></td>
				<td><input class="form-control" name="nhaplaiemail" type="text" placeholder="Nhap lai email"></td>
				<td><label>Nhap ma xac nhan</label></td>
				<td><input type="text" name="maxacnhan" placeholder="Nhap ma xac nhan"></td>
			</tr>
			<tr>
				<td><input class="btn btn-primary" type="submit" value="Dang ky"></td>
				<td><input type="radio"> <span>Toi dong y</span></td>

			</tr>
			<tr>
				<td> <%
 	if (kt != null)
 			out.print("THong tin dang nhap sai");
 %></td>

			</tr>
		</table>
	</form>
	<%
		}
	%>
	

	



























</body>
</html>