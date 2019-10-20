<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
if(request.getParameter("n")!=null){
	int n = Integer.parseInt(request.getParameter("n")); 
	//Kiem tra session da tao ra hay chua
	if(session.getAttribute("ss")==null)
		session.setAttribute("ss", 0);
	//b1:gan session vao bien
	int s = (int)session.getAttribute("ss");
	//b2: thay doi bien
	s=s+n;
	//b3: luu lai session
	session.setAttribute("ss", s);
}
	
%>
		<form method="post" action="nhap1so.jsp">
		<label>Nhap 1 so</label> 
		<input type="text" name="n" placeholder="Nhap 1 so">
		<input type="submit" placeholder="Tinh toan">
		<label>Ket qua</label>
		<input type="text" name="tong" value="<%=session.getAttribute("ss")%>"> 
		 
		
	</form>
		
	

</body>
</html>