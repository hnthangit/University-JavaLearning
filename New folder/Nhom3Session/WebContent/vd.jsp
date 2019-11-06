<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Gia tri bien session:
	<%=session.getAttribute("un")%>
	Gia tri 1:
	<%=request.getAttribute("gt1")%>
	Gia tri 2:
	<%=request.getAttribute("gt2")%>
	Dsht:
	<%String[] ds = (String[])request.getAttribute("dsht");
for(String item: ds){
	out.print(item);
}
	%>
</body>
</html>