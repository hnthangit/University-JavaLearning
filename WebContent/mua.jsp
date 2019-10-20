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
	<%
		String ma = request.getParameter("masach");
		String ten = request.getParameter("tensach");
		String tacgia = request.getParameter("tacgia");
		String g = request.getParameter("gia");
		
		if(g!=null){
			long gia = Long.parseLong(g);
			GioHangBo gh =null;
			
			//Kiem tra xem da tao ra session chua
			//Neu chua thi tao ra 1 session de luu sach
			if (session.getAttribute("giohang") == null) {
				gh = new GioHangBo();
				session.setAttribute("giohang", gh);
			
		}
			//b1: Lay session luu vao bien: gh
			gh = (GioHangBo)session.getAttribute("giohang");
			//b2: thay doi gh: goi ham them
			gh.Them(ma, ten, tacgia, 1, gia);
			//b3: luu bien vao session
			session.setAttribute("gh", gh);
			//Hien thi gio hang
			response.sendRedirect("htgio.jsp");
			
		}

		
	%>
</body>
</html>