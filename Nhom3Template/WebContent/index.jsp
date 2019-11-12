<%@page import="bean.GioHangBean"%>
<%@page import="bean.LoaiBean"%>
<%@page import="bean.SachBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width" />
<title>Index</title>

<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<title>Shop Homepage - Start Bootstrap Template</title>
<!-- Bootstrap Core CSS -->
<link href="Content/bootstrap.css" rel="stylesheet" />

<!-- Custom CSS -->
<link href="Content/shop-homepage.css" rel="stylesheet" />


<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
<body>
	<!-- Navigation -->
	<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
	<div class="container">
		<!-- Brand and toggle get grouped for better mobile display -->
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
				<span class="sr-only">Toggle navigation</span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="#">Nhà sách online</a>
		</div>
		<!-- Collect the nav links, forms, and other content for toggling -->
		<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav">
				<li>
					<a href="sach">TRANG CHỦ</a>
				</li>
				<li>
					<a href="/Nguoidung/Dangky">ĐĂNG K&#221;</a>
				</li>
				<li>
					<%
						if (session.getAttribute("un") == null) {
					%>

					<a href="/Nguoidung/Dangnhap">ĐĂNG NHẬP</a>
					<%
						} else {
					%>
					<a href="sach">Xin chào: <%= (String)session.getAttribute("un")%></a>
					<%
						}
					%>
				</li>
				<li>
					<a href="giohang" style="color: white; font-weight: bold; text-decoration: none;">
						<%
							//GioHangBo gh = null;
							//gh = (GioHangBo)session.getAttribute("giohang");
							ArrayList<GioHangBean> gh = null;
							gh= (ArrayList<GioHangBean>) session.getAttribute("giohang");
							if (gh == null) {
						%>
						<img src="images/giohang.gif" />Giỏ Hàng (0)
						<%
							} else {
						%>
						<img src="images/giohang.gif" />Giỏ Hàng (<%=gh.size() %>)
						<%
							}
						%>
					</a>

				</li>
			</ul>
		</div>
		<!-- /.navbar-collapse -->
	</div>
	<!-- /.container --> </nav>
	<!-- Page Content -->
	<div class="container">
		<div class="row">
			<div class="col-md-3">

				<p class="lead">CHỦ ĐỀ SÁCH</p>
				<div class="list-group">
					<%
						ArrayList<LoaiBean> listLoai = (ArrayList<LoaiBean>) request.getAttribute("dsloai");
						for (LoaiBean loai : listLoai) {
					%>
					<a href="loaisach?maloai=<%=loai.getMaloai() %>" class="list-group-item"><%=loai.getTenloai() %></a>
					<%
						}
					%>
				</div>


				<p class="lead">NHÀ XUẤT BẢN</p>
				<div class="list-group">
					<a href="/BookStore/SPTheoNXB/1" class="list-group-item"> Nh&#224; xuất bản Trẻ </a>
					<a href="/BookStore/SPTheoNXB/2" class="list-group-item"> NXB Thống k&#234; </a>
					<a href="/BookStore/SPTheoNXB/3" class="list-group-item"> Kim đồng </a>
					<a href="/BookStore/SPTheoNXB/4" class="list-group-item"> Đại học quốc gia </a>
					<a href="/BookStore/SPTheoNXB/5" class="list-group-item"> Văn h&#243;a nghệ thuật </a>
					<a href="/BookStore/SPTheoNXB/6" class="list-group-item"> Văn h&#243;a </a>
					<a href="/BookStore/SPTheoNXB/7" class="list-group-item"> Lao động - X&#227; hội </a>
					<a href="/BookStore/SPTheoNXB/8" class="list-group-item"> Khoa Học &amp; Kỹ Thuật </a>
				</div>




			</div>
			<div class="col-md-9">
				<div class="row carousel-holder">
					<div class="col-md-12">
						<div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
							<ol class="carousel-indicators">
								<li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
								<li data-target="#carousel-example-generic" data-slide-to="1"></li>
								<li data-target="#carousel-example-generic" data-slide-to="2"></li>
							</ol>
							<div class="carousel-inner">
								<div class="item active">
									<img class="slide-image" src="images/ancient-place.jpg" alt="">

								</div>
								<div class="item">
									<img class="slide-image" src="images/riverside-city.jpg" alt="">
								</div>
								<div class="item">
									<img class="slide-image" src="images/kayaks.jpg" alt="">
								</div>


							</div>
							<a class="left carousel-control" href="#carousel-example-generic" data-slide="prev">
								<span class="glyphicon glyphicon-chevron-left"></span>
							</a>
							<a class="right carousel-control" href="#carousel-example-generic" data-slide="next">
								<span class="glyphicon glyphicon-chevron-right"></span>
							</a>
						</div>
					</div>
				</div>


				<div>




					<h3 style="Text-align: Center; color: red">SÁCH MỚI</h3>
					<div class="row">
						<%
							ArrayList<SachBean> listSach = (ArrayList<SachBean>) request.getAttribute("dssach");
							for (SachBean sach : listSach) {
						%>
						<div class="col-sm-4 col-lg-4 col-md-4">
							<div class="thumbnail">
								<a href="/BookStore/Details/16">
									<img alt="<%=sach.getTensach() %>" src="<%=sach.getAnh() %>" height="275px" width="200" />
									<div>
										<br />
										<h4 style="text-align: center"><%=sach.getTensach() %></h4>
										<p></p>
									</div>
									<div class="ratings">
										<p class="pull-right">15 reviews</p>
										<p>
											<span class="glyphicon glyphicon-star"></span>
											<span class="glyphicon glyphicon-star"> </span>
											<span class="glyphicon glyphicon-star"></span>
											<span class="glyphicon glyphicon-star"></span>
											<span class="glyphicon glyphicon-star"></span>
										</p>
									</div>
								</a>
								<%
									if (session.getAttribute("un") == null) {
								%>
								<a href="login">
									<img src="images/datmua.png">
								</a>
								<%
									} else {
										request.setCharacterEncoding("UTF-8");
										response.setCharacterEncoding("UTF-8");
								%>
								<a href="xuligiohang?masach=<%=sach.getMasach()%>&tensach=<%=sach.getTensach()%>&tacgia=<%=sach.getTacgia()%>&gia=<%=sach.getGia()%>&anh=<%=sach.getAnh()%>">
									<img src="images/datmua.png">
								</a>
								<%} %>
							</div>
						</div>
						<%
							}
						%>
					</div>

					Trang 1/3;
					<div class="MenuTrang">

						<div class="pagination-container">
							<ul class="pagination">
								<li class="active">
									<a>1</a>
								</li>
								<li>
									<a href="/BookStore?page=2">2</a>
								</li>
								<li>
									<a href="/BookStore?page=3">3</a>
								</li>
								<li class="PagedList-skipToNext">
									<a href="/BookStore?page=2" rel="next">»</a>
								</li>
							</ul>
						</div>
					</div>
					<style>
.MenuTrang li {
	display: inline;
}
</style>
				</div>

			</div>
		</div>
	</div>
	<!-- /.container -->
	<div class="container">
		<hr>
		<!-- Footer -->
		<footer>
		<div class="row">
			<div class="col-lg-12">
				<p>Copyright &copy; MVC 5</p>
			</div>
		</div>
		</footer>
	</div>
	<!-- /.container -->
	<!-- jQuery -->
	<script src="/Scripts/jquery.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="/Scripts/bootstrap.min.js"></script>
</body>
</html>