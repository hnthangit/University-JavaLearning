<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<%
	long so1=0,so2=0,kq=0;
	if(request.getAttribute("kq")!=null){
		 so1 = (long)request.getAttribute("txtso1");
		 so2 =(long) request.getAttribute("txtso2");
		 kq = (long) request.getAttribute("kq");
	}
		
	%>
	<form method= 'post' action="MaytinhController">
	So 1: 
	<input type="number" name="txtso1" value = '<%if (request.getAttribute("txtso1")!=null) out.print(so1);%>'> <br>
	So 2:
	<input type="number" name="txtso2" value = '<%if (request.getAttribute("txtso2")!=null) out.print(so2);%>'> <br>
	Ket qua:
	<input type="number" name="txtkq" value = '<%if (request.getAttribute("kq")!=null) out.print(kq);%>'> <br>
	<input type="submit" name="but1" value = '+'> <br>
	<input type="submit" name="but1" value = '-'> <br>
	<input type="submit" name="but1" value = '*'> <br>
	<input type="submit" name="but1" value = '/'> <br>
	
	
	</form>
	
</body>
</html>