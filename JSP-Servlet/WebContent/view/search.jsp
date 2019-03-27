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
<link href="/Assignment-java4/themes/css/flexslider.css"
	rel="stylesheet" />
<link href="/Assignment-java4/themes/css/main.css" rel="stylesheet" />

<!-- scripts -->
<script src="/Assignment-java4/themes/js/jquery-1.7.2.min.js"></script>
<script src="/Assignment-java4/bootstrap/js/bootstrap.min.js"></script>
<script src="/Assignment-java4/themes/js/superfish.js"></script>
<script src="/Assignment-java4/themes/js/jquery.scrolltotop.js"></script>
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

				<li><a href="/Assignment-java4/products?category=3">XiaoMi</a></li>

				<li><a href="/Assignment-java4/products?category=4">Oppo</a></li>
			</ul>
			</nav>
		</div>
		</section>
		<section class="homepage-slider" id="home-slider">
		<div class="flexslider">
			<ul class="slides">
				<li><img
					src="/Assignment-java4/themes/images/carousel/1.jpg" alt="" />
				</li>
				<li><img
					src="/Assignment-java4/themes/images/carousel/2.jpg" alt="" />
					<div class="intro">
						<h1>Mid season sale</h1>
						<p>
							<span>Up to 50% Off</span>
						</p>
						<p>
							<span>On selected items online and in stores</span>
						</p>
					</div></li>
			</ul>
		</div>
		</section>
		<section class="header_text"> </section>
		<section class="main-content">

		<div class="row">
			<div class="span9">

				<ul class="thumbnails listing-products">

					<c:forEach items="${list}" var="list">
						<li class="span3">
							<div class="product-box">
								<a href="/Assignment-java4/product_detail?Pid=${list.getPid()}"><img alt="" src="${list.getPicture()}"></a><br /> 
								<a href="/Assignment-java4/product_detail?Pid=${list.getPid()}"class="title">${list.getPname()}</a><br /> 
								<a href="#" class="category">${list.getNote()}</a>
								<p class="/Assignment-java4/product_detail?Pid=${list.getPid()}">$ ${list.getPrice()}</p>
							</div>
						</li>
					</c:forEach>

				</ul>
				<hr>
				<!-- <div class="pagination pagination-small pagination-centered">
					<ul>
						<li><a href="/Assignment-java4/FaceController?stt=1">1</a></li>
						<li><a href="/Assignment-java4/FaceController?stt=2">2</a></li>
						<li><a href="/Assignment-java4/FaceController?stt=3">3</a></li>
						<li><a href="/Assignment-java4/FaceController?stt=4">4</a></li>

					</ul>
				</div> -->

			</div>

		</div>

		<%-- <div class="row">
					<div class="span12">													
						<div class="row">
							<div class="span12">
								<h4 class="title">
									<span class="pull-left"><span class="text"><span class="line">Feature <strong>Products</strong></span></span></span>
									<span class="pull-right">
										<a class="left button" href="#myCarousel" data-slide="prev"></a><a class="right button" href="#myCarousel" data-slide="next"></a>
									</span>
								</h4>
								<div id="myCarousel" class="myCarousel carousel slide" >
									<div class="carousel-inner">
										<div class="active item">
											<ul class="thumbnails">
											<c:forEach items="${list1 }" var="ls"> 				
												<li class="span3">
													<div class="product-box">
														<span class="sale_tag"></span>
														<p><a href="/Assignment-java4/product_detail?Pid=${ls.getPid()}" class="title"/><img alt="" src="${ls.getPicture()}"></a></p>
														<a href="/Assignment-java4/product_detail?Pid=${ls.getPid()}" class="title">${ls.getPname()}</a><br/>
														<a href="/Assignment-java4/product_detail?Pid=${ls.getPid()}" class="category">${ls.getNote()}</a>
														<p class="/Assignment-java4/product_detail?Pid=${ls.getPid()}">${ls.getPrice() }</p>
													</div>
												</li>
												</c:forEach>
												
											</ul>
										</div>
										<div class="item">
											<ul class="thumbnails">
												<c:forEach items="${list2}" var="ls"> 				
												<li class="span3">
													<div class="product-box">
														<span class="sale_tag"></span>
														<p><a href="/Assignment-java4/product_detail?Pid=${ls.getPid()}" class="title"/><img alt="" src="${ls.getPicture()}"></a></p>
														<a href="/Assignment-java4/product_detail?Pid=${ls.getPid()}" class="title">${ls.getPname()}</a><br/>
														<a href="/Assignment-java4/product_detail?Pid=${ls.getPid()}" class="category">${ls.getNote()}</a>
														<p class="/Assignment-java4/product_detail?Pid=${ls.getPid()}">${ls.getPrice() }</p>
													</div>
												</li>
												</c:forEach>
																																											
											</ul>
										</div>
									</div>							
								</div>
							</div>						
						</div>
						<br/>
						<div class="row">
							<div class="span12">
								<h4 class="title">
									<span class="pull-left"><span class="text"><span class="line">Latest <strong>Products</strong></span></span></span>
									<span class="pull-right">
										<a class="left button" href="#myCarousel-2" data-slide="prev"></a><a class="right button" href="#myCarousel-2" data-slide="next"></a>
									</span>
								</h4>
								<div id="myCarousel-2" class="myCarousel carousel slide">
									<div class="carousel-inner">
										<div class="active item">
											<ul class="thumbnails">												
												<c:forEach items="${list3 }" var="ls"> 				
												<li class="span3">
													<div class="product-box">
														<span class="sale_tag"></span>
														<p><a href="/Assignment-java4/product_detail?Pid=${ls.getPid()}" class="title"/><img alt="" src="${ls.getPicture()}"></a></p>
														<a href="/Assignment-java4/product_detail?Pid=${ls.getPid()}" class="title">${ls.getPname()}</a><br/>
														<a href="/Assignment-java4/product_detail?Pid=${ls.getPid()}" class="category">${ls.getNote()}</a>
														<p class="/Assignment-java4/product_detail?Pid=${ls.getPid()}">${ls.getPrice() }</p>
													</div>
												</li>
												</c:forEach>
												
											</ul>
										</div>
										<div class="item">
											<ul class="thumbnails">
												<c:forEach items="${list4 }" var="ls"> 				
												<li class="span3">
													<div class="product-box">
														<span class="sale_tag"></span>
														<p><a href="/Assignment-java4/product_detail?Pid=${ls.getPid()}" class="title"/><img alt="" src="${ls.getPicture()}"></a></p>
														<a href="/Assignment-java4/product_detail?Pid=${ls.getPid()}" class="title">${ls.getPname()}</a><br/>
														<a href="/Assignment-java4/product_detail?Pid=${ls.getPid()}" class="category">${ls.getNote()}</a>
														<p class="/Assignment-java4/product_detail?Pid=${ls.getPid()}">${ls.getPrice() }</p>
													</div>
												</li>
												</c:forEach>
																																													
											</ul>
										</div>
									</div>							
								</div>
							</div>						
						</div>
						<div class="row feature_box">						
							<div class="span4">
								<div class="service">
									<div class="responsive">	
										<img src="/Assignment-java4/themes/images/feature_img_2.png" alt="" />
										<h4>MODERN <strong>DESIGN</strong></h4>
										<p>Lorem Ipsum is simply dummy text of the printing and printing industry unknown printer.</p>									
									</div>
								</div>
							</div>
							<div class="span4">	
								<div class="service">
									<div class="customize">			
										<img src="/Assignment-java4/themes/images/feature_img_1.png" alt="" />
										<h4>FREE <strong>SHIPPING</strong></h4>
										<p>Lorem Ipsum is simply dummy text of the printing and printing industry unknown printer.</p>
									</div>
								</div>
							</div>
							<div class="span4">
								<div class="service">
									<div class="support">	
										<img src="/Assignment-java4/themes/images/feature_img_3.png" alt="" />
										<h4>24/7 LIVE <strong>SUPPORT</strong></h4>
										<p>Lorem Ipsum is simply dummy text of the printing and printing industry unknown printer.</p>
									</div>
								</div>
							</div>	
						</div>		
					</div>				
				</div> --%> </section>

		<section id="footer-bar"> </section>
		<section id="copyright"> <span>Copyright 2013
			bootstrappage template All right reserved.</span> </section>
	</div>
	<script src="/Assignment-java4/themes/js/common.js"></script>
	<script src="/Assignment-java4/themes/js/jquery.flexslider-min.js"></script>
	<script type="text/javascript">
		$(function() {
			$(document).ready(function() {
				$('.flexslider').flexslider({
					animation : "fade",
					slideshowSpeed : 4000,
					animationSpeed : 600,
					controlNav : false,
					directionNav : true,
					controlsContainer : ".flex-container" // the container that holds the flexslider
				});
			});
		});
	</script>
</body>
</html>