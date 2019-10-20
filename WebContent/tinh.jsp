<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String so1 = request.getParameter("txtso1");
		String so2 = request.getParameter("txtso2");
		String but1 = request.getParameter("but1");
		long a, b, kq = 0;
		if (so1 != null && so2 != null && but1 != null) {
	%>
	<%=so1 + "  " + so2 + "  " + but1 + "<br>"%>
	<%
		a = Long.parseLong(so1);
			b = Long.parseLong(so2);

			if (but1.equals("+"))
				kq = a + b;
			else if (but1.equals("-"))
				kq = a - b;
			else if (but1.equals("*"))
				kq = a * b;
			else if (b==0)
				out.print("<script>alert('bo tay');</script>");
			else
				kq = a / b;
	%>
	<%=so1 + "  " + but1 + "  " + so2 + " = " + kq%>
	<%
		}
	%>
	<br>
</body>
</html>