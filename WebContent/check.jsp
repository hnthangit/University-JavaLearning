<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<%
	String tendangnhap = request.getParameter("txtun");
	String matkhau = request.getParameter("txtpass");
	String vaitro = request.getParameter("vaitro");
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
%>
<body>

</body>
</html>