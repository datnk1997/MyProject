<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<title>Bootstrap E-commerce Templates</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<!--[if ie]><meta content='IE=8' http-equiv='X-UA-Compatible'/><![endif]-->

<!-- bootstrap -->
<link href="/Assignment-java4/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<link
	href="/Assignment-java4/bootstrap/css/bootstrap-responsive.min.css"
	rel="stylesheet">
<link href="/Assignment-java4/themes/css/bootstrappage.css"
	rel="stylesheet" />

<!-- global styles -->
<link href="/Assignment-java4/themes/css/main.css" rel="stylesheet" />
<link href="/Assignment-java4/themes/css/jquery.fancybox.css"
	rel="stylesheet" />

<!-- scripts -->
<script src="/Assignment-java4/themes/js/jquery-1.7.2.min.js"></script>
<script src="/Assignment-java4/bootstrap/js/bootstrap.min.js"></script>
<script src="/Assignment-java4/themes/js/superfish.js"></script>
<script src="/Assignment-java4/themes/js/jquery.scrolltotop.js"></script>
<script src="/Assignment-java4/themes/js/jquery.fancybox.js"></script>
<!--[if lt IE 9]>			
			<script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
			<script src="js/respond.min.js"></script>
		<![endif]-->
</head>
<body>
	<div id="top-bar" class="container">
		<div class="row">
			<div class="span4">

				<form action="SearchController">
					<input type="text" Placeholder="Iphone X" name="Value">
					<div>
					<button  class="btn btn-inverse" type="submit" value="Search">Search</button>
					</div>
				</form>

			</div>
			<div class="span8">
				<div class="account pull-right">
					<ul class="user-menu">
						<li><a>${custommer}</a></li>
						<li><a href="view/register.jsp">Login</a></li>
					</ul>
				</div>
			</div>
		</div>
	</div>
	<div id="wrapper" class="container">
		<section class="navbar main-menu">
		<div class="navbar-inner main-menu">
			<a href="/Assignment-java4/" class="logo pull-left"><img
				src="/Assignment-java4/themes/images/logo.png" class="site_logo"
				alt=""></a>
			<nav id="menu" class="pull-right">
			<ul>
				<li><a href="/Assignment-java4/products?category=1">Iphone</a></li>

				<li><a href="/Assignment-java4/products?category=2">Sam
						Sung</a></li>

				<li><a href="/Assignment-java4/products?category=3">Sony</a></li>

				<li><a href="/Assignment-java4/products?category=4">Oppo</a></li>
			</ul>
			</nav>
		</div>
		</section>
		<section class="header_text sub"> <img class="Banner"
			src="/Assignment-java4/themes/images/Banner.png"
			alt="New products">
		<h4>
			<span>Product Detail</span>
		</h4>
		</section>
		<section class="main-content">
		<div class="row">
			<div class="span9">
				<div class="row">
					<c:forEach items="${ls}" var="list">
						<form action="CartController">
							<div class="span4">
								<a href="${list.getPicture() }" class="thumbnail"
									data-fancybox-group="group1" title="Description 1"><img
									alt="" src="${list.getPicture() }"></a>
							</div>

							<div class="span5">

								<address>
									<strong>Product Name:</strong> <span>${list.getPname()}</span><br>
									<strong>Note:</strong> <span>${list.getNote()}</span><br>
									<strong>Availability:</strong> <span>Out Of Stock</span><br>
								</address>
								<h4>
									<strong>Price: $ ${list.getPrice() }</strong>
								</h4>								
								
								<input type="hidden" value="${list.getPrice()}" name="price"> 
							</div>

							<div class="span5">
							<form class="form-inline">
									
									<p>&nbsp;</p>
									<label>Qty:</label>
									<input type="text" class="span1" value="1" name="Quantity">
									<input type="hidden" value="${list.getPid()}" name="Pid">
									<button class="btn btn-inverse" type="submit" value="addtocart" name="action">Add to
									cart</button>
								</form>
							</div>
				</div>

				<div class="row">
					<div class="span9">
						<ul class="nav nav-tabs" id="myTab">
							<li class=""><a href="#profile">THÔNG SỐ KỸ THUẬT</a></li>
						</ul>
						<div class="tab-content">
							<div class="tab-pane" id="profile">
								<table class="table table-striped shop_attributes">
									<tbody>

										<tr class="">
											<th>Màn hình:</th>

											<td>${list.getManhinh() }</td>

										</tr>
										<tr class="alt">
											<th>CPU:</th>

											<td>${list.getCPU()}</td>
										</tr>
										<tr class="alt">
											<th>Hệ điều hành:</th>

											<td>${list.getHedieuhanh() }</td>
										</tr>
										<tr class="alt">
											<th>RAM:</th>

											<td>${list.getRam() }</td>
										</tr>
										<tr class="alt">
											<th>Bộ nhớ trong:</th>
											<td>${list.getBonhotrong()}</td>
										</tr>

									</tbody>
								</table>
							</div>
						</div>
					</div>
					</form>
					</c:forEach>
					<div class="span9">
						<br>
						
					</div>
				</div>
			</div>
		</div>
		</section>
		<section id="footer-bar"> </section>
		
	</div>
	<script src="/Assignment-java4/themes/js/common.js"></script>
	<script>
		$(function() {
			$('#myTab a:first').tab('show');
			$('#myTab a').click(function(e) {
				e.preventDefault();
				$(this).tab('show');
			})
		})
		$(document).ready(function() {
			$('.thumbnail').fancybox({
				openEffect : 'none',
				closeEffect : 'none'
			});

			$('#myCarousel-2').carousel({
				interval : 2500
			});
		});
	</script>
</body>
</html>