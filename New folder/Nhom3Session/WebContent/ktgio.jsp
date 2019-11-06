<%@page import="bean.GioHangBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bo.GioHangBo"%>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<%
	request.setCharacterEncoding("utf-8");
	response.setCharacterEncoding("utf-8");
		if (request.getParameter("luu") != null) {
			int temp = 0;
			String[] t = request.getParameterValues("soluongthaydoi");
			String[] t2 = request.getParameterValues("masachthaydoi");
			for (int i = 0; i < t.length; i++) {
				if (!t[i].isEmpty())
					temp = i;
			}
			String masachthaydoi = t2[temp];
			String strsoluongthaydoi = t[temp];
			System.out.println(masachthaydoi);
			System.out.println(masachthaydoi);

			try {
				int soluongthaydoi = Integer.parseInt(strsoluongthaydoi);
				GioHangBo gh = null;
				gh = (GioHangBo) session.getAttribute("giohang");
				gh.thayDoiSoLuong(masachthaydoi, soluongthaydoi);
				response.sendRedirect("t2.jsp");
			} catch (Exception e) {
				response.sendRedirect("t2.jsp");
			}
		} else {
			if (request.getParameter("thaydoi").equals("0")) {
				GioHangBo gh = null;
				gh = (GioHangBo) session.getAttribute("giohang");
				gh.xoa(request.getParameter("masach"));
				response.sendRedirect("t2.jsp");
			} else if (request.getParameter("thaydoi").equals("2")) {
				GioHangBo gh = null;
				gh = (GioHangBo) session.getAttribute("giohang");
				gh.deleteAll();
				response.sendRedirect("t1.jsp");
			} else {
				int temp = 0;
				String[] t = request.getParameterValues("checkboxxoa");			
				GioHangBo gh = null;
				gh = (GioHangBo) session.getAttribute("giohang");
				gh.xoaMucDaChon(t);
				response.sendRedirect("t2.jsp");
			}
		}
	%>
</body>
</html>