<%@page import="bean.GioHangBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bo.GioHangBo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	if(request.getParameter("thaydoi").equals("1")){
		String str1 = request.getParameter("soluongthaydoi");
		String str2 = request.getParameter("masachthaydoi");
		int soluongthaydoi = Integer.parseInt(str1);
		GioHangBo gh =null;
		gh = (GioHangBo)session.getAttribute("giohang");
		gh.thayDoiSoLuong(str2, soluongthaydoi);
		response.sendRedirect("t2.jsp");
	} else {
		GioHangBo gh =null;
		gh = (GioHangBo)session.getAttribute("giohang");
		gh.xoa(request.getParameter("masach"));
		response.sendRedirect("t2.jsp");
	}
	
	

	
	
	
	
	%>
</body>
</html>