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
<form action="add" method="get">
  <div class="form-group">
    <label for="exampleInputEmail1">Tên HD</label>
    <input type="text" class="form-control" id="exampleInputEmail1" name="tenhd" placeholder="Tên HD">
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Mô tả</label>
    <input type="text" class="form-control" id="exampleInputPassword1" name="mota" placeholder="Mô tả">
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Ngày BĐ</label>
    <input type="text" class="form-control" id="exampleInputPassword1" name="ngaybd" placeholder="Ngày BĐ">
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Ngày KT</label>
    <input type="text" class="form-control" id="exampleInputPassword1" name="ngaykt" placeholder="Ngày KT">
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Tối thiểu</label>
    <input type="text" class="form-control" id="exampleInputPassword1" name="toithieu" placeholder="Tối thiểu">
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Tối đa</label>
    <input type="text" class="form-control" id="exampleInputPassword1" name="toida" placeholder="Tối đa">
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Thời hạn đk (hết 24h ngày được nhập)</label>
    <input type="text" class="form-control" id="exampleInputPassword1" name="thoihandk" placeholder="Thời hạn đk (hết 24h ngày được nhập)">
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Trạng thái</label>
    <input type="text" class="form-control" id="exampleInputPassword1" name="trangthai" placeholder="Trạng thái">
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Mã TV</label>
    <input type="text" class="form-control" id="exampleInputPassword1" name="matv" placeholder="Mã TV">
  </div>
  
  
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
</body>
</html>