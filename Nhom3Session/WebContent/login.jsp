<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="bootstrap.min.css">
<title>Insert title here</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <a class="navbar-brand" href="#">Navbar</a>
    <div class="navbar-nav">
      <a class="nav-item nav-link" href="t1.jsp">trang1</a>
      <a class="nav-item nav-link" href="t2.jsp">trang2</a>
      <a class="nav-item nav-link" href="login.jsp">Dang nhap</a>
      <a class="nav-item nav-link" href="#">Dang xuat</a>
    </div>
    </nav>
	<form class="form-group" method="post" action="kt.jsp">
		<table>
			<tr>
				<td><label>Nhap username</label></td>
				<td><input class="form-control" type="text" placeholder="Nhap username" name="txtun"></td>

			</tr>
			<tr>
				<td><label>Nhap mat khau</label></td>
				<td><input class="form-control" type="password" placeholder="Nhap password" name="txtpass"></td>

			</tr>
			<tr>
				<td><label>Chon vai tro</label></td>
				<td><select class="form-control" name="vaitro">
						<option value="1">Giao vien</option>
						<option value="2">Hoc sinh</option>

				</select></td>
			</tr>
			<tr>
				<td><input class="btn btn-primary" name="but1" type="submit" value="login"></td>

			</tr>
		</table>
	</form>
</body>
</html>