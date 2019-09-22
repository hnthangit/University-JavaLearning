<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link rel="stylesheet" href="bootstrap.min.css">

</head>
<body>

	<table border='1' align='center' width="1000px">
		<tr>
			<td colspan="3"><nav class="navbar navbar-expand-lg navbar-light bg-light"> <a class="navbar-brand" href="#">Navbar</a>
				<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse" id="navbarNav">
					<ul class="navbar-nav">
						<li class="nav-item active"><a class="nav-link" href="#">Home <span class="sr-only">(current)</span>
						</a></li>
						<li class="nav-item"><a class="nav-link" href="#">Features</a></li>
						<li class="nav-item"><a class="nav-link" href="#">Pricing</a></li>
						<li class="nav-item"><a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">Disabled</a></li>
					</ul>
				</div>
				</nav></td>
		</tr>
		<tr>
			<td valign='top' width='200'><a href="test2.jsp">Home</a> <a href="http://www.google.com.vn">google</a> <a href="Blockchain - fix.docx">Download</a></td>
			<td valign='top' width='600'>
				<%
					for (int i = 1; i < 10; i++) {
				%> <marquee direction="up">

					<img alt="" src="tet.jpg" width="400">

				</marquee> <%%> thang123 <%
 	}
 %>
			</td>
			<td valign='top' width='200'>tim kiem</td>
		</tr>
		<tr colspan="3">
			<td>menu tren</td>
		</tr>
	</table>
	<form>
		<input> <select>
		</select>
		<textarea rows="" cols=""></textarea>
	</form>
</body>
</html>