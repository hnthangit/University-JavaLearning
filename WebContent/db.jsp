<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	String ts = request.getParameter("k");
	if(ts.equals("1"))
		out.print("hien thi trang thoi su");
	else if (ts.equals("2"))
		out.print("hien thi trang the thao");
	else
		out.print("hien thi trang kinh doanh");
%>


</body>
</html>