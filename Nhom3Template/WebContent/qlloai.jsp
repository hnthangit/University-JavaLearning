<%@page import="bean.LoaiBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link href="bootstrap.min.css" rel="stylesheet" />

<!-- Custom CSS -->
<link href="Content/shop-homepage.css" rel="stylesheet" />
</head>
<body>
<%
String maloaiduocchon = "", tenloaiduocchon="";
if(request.getAttribute("ktnhap")!=null)
	out.print("<script>alert('Trùng mã')</script>");
if(request.getAttribute("ktxoa")!=null)
	out.print("<script>alert('Loại có sách ko thể xóa')</script>");
if(request.getAttribute("chon")!=null){
	LoaiBean loaiduocchon = (LoaiBean) request.getAttribute("chon");
	maloaiduocchon = loaiduocchon.getMaloai();
	tenloaiduocchon = loaiduocchon.getTenloai();	
}
if(request.getAttribute("ktsua")!=null)
	out.print("<script>alert('ko ton tai mã de cap nhat')</script>");
	
%>
<form action="loaiadmin" method="post">
<label>Mã loại</label>
<input class="form-control" type="text" name="txtmaloai" value="<%=maloaiduocchon%>"><br>
<label>Ten loại</label>
<input class="form-control" type="text" name="txttenloai" value="<%=tenloaiduocchon%>"><br>
<input class="btn btn-outline-secondary" type="submit" name="butthem" value="Thêm">
<input class="btn btn-outline-primary" type="submit" name="butsua" value="Sửa">
<br>
</form>
	<table class="table table-border table-hover">
	<tr>
				<td>Mã loại</td>
				<td>Tên loại</td>
				<td>Chọn trường</td>
				<td>Xóa trường</td>
			</tr>
			<%
				ArrayList<LoaiBean> listLoai = (ArrayList<LoaiBean>) request.getAttribute("dsloai");
				for (LoaiBean loai : listLoai) {
			%>
			<tr>
				<td><%=loai.getMaloai()%></td>
				<td><%=loai.getTenloai()%></td>
				<td><a class="btn btn-outline-success" href="loaiadmin?mlchon=<%=loai.getMaloai()%>">Chọn</a></td>
				<td><a class="btn btn-outline-danger" href="loaiadmin?mlxoa=<%=loai.getMaloai()%>">Xóa</a></td>
			</tr>
			<%
				}
			%>
		
	</table>
</body>
</html>