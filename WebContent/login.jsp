<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="bootstrap.min.css">
<title>Insert title here</title>
</head>
<body>
<%
	String tendangnhap = request.getParameter("txtun");
	String matkhau = request.getParameter("txtpass");
	String vaitro = request.getParameter("vaitro");
	if(tendangnhap!=null && matkhau!=null &&vaitro!=null){
		out.print(tendangnhap + matkhau + vaitro);
		//gv: un:gv, pass=456
		//sv: un:abc, pass=123
		if (vaitro.equals("2")) {
			if (matkhau.equals("123") && tendangnhap.equals("abc"))
				response.sendRedirect("login.jsp?kt=dung");
			else
				response.sendRedirect("login.jsp?kt=sai");
		}
		if (vaitro.equals("1")) {
			if (matkhau.equals("456") && tendangnhap.equals("gv"))
				response.sendRedirect("login.jsp?kt=dung");
			else
				response.sendRedirect("login.jsp?kt=sai");
		}
	}
	
%>
	<%
		String kt = request.getParameter("kt");
		if (kt != null && kt.equals("dung"))
			out.print("xin chao: gv");
		else {
	%>
	<form class="form-group" method="post" action="login.jsp">
		<table>
			<tr>
				<td><label>Nhap username</label></td>
				<td><input class="form-control" type="text" placeholder="Nhap username" name="txtun"></td>

			</tr>
			<tr>
				<td><label>Nhap mat khau</label></td>
				<td><input class="form-control" type="password" placeholder="Nhap password" name="txtpass"></td>

			</tr>
			<tr>
				<td><label>Chon vai tro</label></td>
				<td><select class="form-control" name="vaitro">
						<option value="1">Giao vien</option>
						<option value="2">Hoc sinh</option>

				</select></td>
			</tr>
			<tr>
				<td><input class="btn btn-primary" name="but1" type="submit" value="login"> <%
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