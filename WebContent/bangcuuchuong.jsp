<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="bootstrap.min.css">
<title>Insert title here</title>
</head>
<body>
	<div style="display: flex; justify-content:center; align-items: center;">
		<%for(int i = 1 ; i < 10 ; i ++ ){ %>
		<div>
			<%for(int j = 1 ; j < 10 ; j ++ ){ %>
			<div style="border-bottom: 1px solid black; margin:5px 0 0 30px;">
				<span  style="margin: 3px"><%=i+" * "+j+" = "+(i * j)%></span>
			</div>
			<%} %>
		</div>
		<%} %>
	</div>
</body>
</html>