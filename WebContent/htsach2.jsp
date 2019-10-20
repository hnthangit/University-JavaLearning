
<%@page import="java.util.ArrayList"%>
<%@page import="bean.SachBean"%>
<%@page import="bo.SachBo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table align="center" width="800px">
		<%
			SachBo sachBo = new SachBo();
			ArrayList<SachBean> ds = sachBo.getListSach();
			int ss = ds.size();
			for (int i = 0; i < ss; i++) {
				SachBean sach = ds.get(i);
		%>
		<tr>
			<td>
				<img alt="" src="<%=sach.getAnh()%>"> <br>
				<%=sach.getTensach()%><br>
				<%=sach.getGia()%><br>
				<a href="mua.jsp?masach=<%=sach.getMasach()%>&tensach=<%=sach.getTensach()%>&tacgia=<%=sach.getTacgiac()%>&gia=<%=sach.getGia()%>"><img src="datmua.png"></a><hr>
			</td>
			<%
				i++;
					if (i < ss) {
						sach = ds.get(i);
			%>
			<td>
				<img alt="" src="<%=sach.getAnh()%>"> <br>
				<%=sach.getTensach()%><br>
				<%=sach.getGia()%><br>
				<a href="mua.jsp?masach=<%=sach.getMasach()%>&tensach=<%=sach.getTensach()%>&tacgia=<%=sach.getTacgiac()%>&gia=<%=sach.getGia()%>"><img src="datmua.png"></a><hr>
			</td>
			<%
				}
			%>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>