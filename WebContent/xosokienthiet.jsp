<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="bootstrap.min.css">
<title>Insert title here</title>
</head>
<body>
	<%
		Random r = new Random();
		int giaiTam = r.nextInt(99);
		int giaiBay = r.nextInt(999);

		ArrayList<Integer> giaiSauNam = new ArrayList<>();
		for (int i = 0; i < 4; i++) {
			giaiSauNam.add(r.nextInt(9999));
		}

		ArrayList<Integer> giaiBonBaHaiMot = new ArrayList<>();
		for (int i = 0; i < 11; i++) {
			giaiBonBaHaiMot.add(r.nextInt(99999));
		}

		int giaiDacBiet = r.nextInt(999999);

		String str;
	%>
	<div class="container-fluid">
		<div class="d-flex justify-content-around align-items-center">
			<span class="w-25">Giai 8</span>
			<div class="w-25" style="color: red">
				<%=String.format("%02d", giaiTam)%>
			</div>
		</div>
		<div class="d-flex justify-content-around align-items-center">
			<span class="w-25">Giai 7</span>
			<div class="w-25">
				<%=String.format("%03d", giaiBay)%>
			</div>
		</div>
		<div class="d-flex justify-content-around align-items-center">
			<span class="w-25">Giai 6</span>
			<div class="w-25 d-flex justify-content-around align-items-center ">
				<%
					for (int i = 0; i < 3; i++) {
				%>
				<div>
					<%=String.format("%04d", giaiSauNam.get(i))%>
				</div>
				<%
					}
				%>
			</div>
		</div>
		<div class="d-flex justify-content-around align-items-center">
			<span class="w-25">Giai 5</span>
			<div class="w-25">
				<%=String.format("%04d", giaiSauNam.get(3))%>
			</div>

		</div>
		<div class="d-flex justify-content-around align-items-center">
			<span class="w-25">Giai 4</span>
			<div class="w-25 d-flex justify-content-around align-items-center ">
				<%
					for (int i = 0; i < 7; i++) {
				%>
				<div>
					<%=String.format("%05d", giaiBonBaHaiMot.get(i))%>
				</div>
				<%
					}
				%>
			</div>
		</div>
		<div class="d-flex justify-content-around align-items-center">
			<span class="w-25">Giai 3</span>
			<div class="w-25 d-flex justify-content-around align-items-center ">
				<div>
					<%=String.format("%05d", giaiBonBaHaiMot.get(7))%>
				</div>
				<div>
					<%=String.format("%05d", giaiBonBaHaiMot.get(8))%>
				</div>
			</div>
		</div>
		<div class="d-flex justify-content-around align-items-center">
			<span class="w-25">Giai nhi</span>
			<div class="w-25">
				<%=String.format("%05d", giaiBonBaHaiMot.get(9))%>
			</div>
		</div>
		<div class="d-flex justify-content-around align-items-center">
			<span class="w-25">Giai nhat</span>
			<div class="w-25">
				<%=String.format("%05d", giaiBonBaHaiMot.get(10))%>
			</div>
		</div>
		<div class="d-flex justify-content-around align-items-center">
			<span class="w-25">Giai dac biet</span>
			<div class="w-25" style="color: red">
				<%=String.format("%06d", giaiDacBiet)%>
			</div>
		</div>
	</div>
</body>
</html>