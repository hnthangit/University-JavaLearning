<%@page import="bean.LoaiBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bean.SachBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="bootstrap.min.css" rel="stylesheet" />
</head>
<body>
<%
String masachduocchon = "", tensachduocchon = "", tacgiaduocchon = "", anhduocchon = "", giaduocchon = "", ngayduocchon = "", loaiduocchon = "";
if(request.getAttribute("chon")!=null){
	SachBean sachduocchon = (SachBean) request.getAttribute("chon");
	masachduocchon = sachduocchon.getMasach();
	tensachduocchon = sachduocchon.getTensach();
	tacgiaduocchon = sachduocchon.getTacgia();
	anhduocchon = sachduocchon.getAnh();
	giaduocchon = Long.toString(sachduocchon.getGia());
	ngayduocchon = sachduocchon.getNgaynhap().toString();
	loaiduocchon = sachduocchon.getMaloai();
}
%>
<form method="post" action="sachadmin" enctype="multipart/form-data">
<label>Mã sách</label>
<input class="form-control" type="text" name="txtmasach" value="<%=masachduocchon%>"><br>
<label>Ten sách</label>
<input class="form-control" type="text" name="txttensach" value="<%=tensachduocchon%>"><br>
<label>Tác giả</label>
<input class="form-control" type="text" name="txttacgia" value="<%=tacgiaduocchon%>"><br>
<label>Giá</label>
<input class="form-control" type="text" name="txtgia" value="<%=giaduocchon%>"><br>
<label>Ảnh</label>
<input type="file" name="anh"><br>
 <label>Ngày nhập</label>
<input class="form-control" type="text" name="txtngay" value="<%=ngayduocchon%>"><br> 

<label>Loại</label>
<select name="txtmaloai" class="form-control">
			<%
				ArrayList<LoaiBean> listLoai = (ArrayList<LoaiBean>) request.getAttribute("dsloai");
				for (LoaiBean loai : listLoai) {
			%>
			<option <%=loai.getMaloai().equals(loaiduocchon)? "selected" : "" %> value="<%=loai.getMaloai() %>"><%=loai.getTenloai()%></option>
			<%
				}
			%>
		</select>
<br>
<input class="btn btn-outline-secondary" type="submit" name="butthem" value="Thêm">
<input class="btn btn-outline-primary" type="submit" name="butsua" value="Sửa"> <br/>
</form>
	<table class="table table-hover">
		<thead>
			<tr>
				<th scope="col">Mã sách</th>
				<th scope="col">Tên</th>
				<th scope="col">Tác giả</th>
				<th scope="col">Giá</th>
				<th scope="col">Ảnh</th>
				<th scope="col">Ngay nhap</th>
				<th scope="col">Mã loai</th>
				<th scope="col">Thao tác</th>
			</tr>
		</thead>
		<tbody>
			<%
				ArrayList<SachBean> listSach = (ArrayList<SachBean>) request.getAttribute("dssach");
				for (SachBean sach : listSach) {
			%>
			<tr>
				<th scope="row">
					<%=sach.getMasach() %>
				</th>
				<td>
					<%=sach.getTensach() %>
				</td>
				<td>
					<%=sach.getTacgia() %>
				</td>
				<td>
					<%=sach.getGia() %>
				</td>
				<td><img style="width: 100%;" src="<%=sach.getAnh() %>"
					alt=""></td>
				<td>
					<%=sach.getNgaynhap() %>
				</td>
				<td>
					<%=sach.getMaloai() %>
				</td>
				<td><a href="sachadmin?mschon=<%=sach.getMasach()%>"
					class="btn btn-outline-success">Chọn</a> <a
					href="sachadmin?msxoa=<%=sach.getMasach()%>"
					class="btn btn-outline-danger">Xóa</a></td>
			</tr>
			<%
				}
			%>
		</tbody>
	</table>
</body>
</html>