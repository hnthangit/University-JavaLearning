<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td><a href="ht.jsp?k=1"> Thoi su</a> <a href="ht.jsp?k=2"> The thao</a> <a href="ht.jsp?k=3"> Kinh doanh</a></td>
		</tr>
		<%
			String ts = request.getParameter("k");
			if (ts == null)
				out.print("chay lan dau ko co tham so k");
			else if (ts.equals("1"))
				out.print("hien thi trang thoi su");
			else if (ts.equals("2"))
				out.print("hien thi trang the thao");
			else
				out.print("hien thi trang kinh doanh");
		%>




	</table>
</body>
</html>