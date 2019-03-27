<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
		<link href="/Assignment-java4/bootstrap/css/bootstrap.min.css" rel="stylesheet">      
		<link href="/Assignment-java4/bootstrap/css/bootstrap-responsive.min.css" rel="stylesheet">		
		<link href="/Assignment-java4/themes/css/bootstrappage.css" rel="stylesheet"/>
		
		<!-- global styles -->
		<link href="/Assignment-java4/themes/css/flexslider.css" rel="stylesheet"/>
		<link href="/Assignment-java4/themes/css/main.css" rel="stylesheet"/>

		<!-- scripts -->
		<script src="Assignment-java4/themes/js/jquery-1.7.2.min.js"></script>
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
					<a href="/Assignment-java4/" class="logo pull-left"><img src="/Assignment-java4/themes/images/logo.png" class="site_logo" alt=""></a>
					<nav id="menu" class="pull-right">
						<ul>
							<li><a href="/Assignment-java4/products?category=1">Iphone</a></li>
																						
							<li><a href="/Assignment-java4/products?category=2">Sam Sung</a></li>
									
							<li><a href="/Assignment-java4/products?category=3">Sony</a></li>	
													
							<li><a href="/Assignment-java4/products?category=4">Oppo</a></li>
							
						</ul>
					</nav>
				</div>
			</section>	
			<section class="header_text sub">
			<img class="pageBanner" src="/Assignment-java4/themes/images/Banner.png" alt="New products" >
				<h4><span>MobileZ</span></h4>
			</section>
			<section class="main-content">
				
				<div class="row">						
					<div class="span9">		
											
						<ul class="thumbnails listing-products">
						
							<c:forEach items="${ls}" var="list">
							    <li class="span3">
								<div class="product-box">												
									<a href="/Assignment-java4/product_detail?Pid=${list.getPid()}"><img alt="" src="${list.getPicture()}"></a><br/>
									<a href="/Assignment-java4/product_detail?Pid=${list.getPid()}" class="title">${list.getPname()}</a><br/>
									<a href="#" class="category">${list.getNote()}</a>
									<p class="/Assignment-java4/product_detail?Pid=${list.getPid()}">$ ${list.getPrice()}</p>
								</div>
							</li>   
							</c:forEach>
							
						</ul>								
						<hr>
					</div>
					
				</div>
			</section>
			
			
		</div>
		<script src="/Assignment-java4/themes/js/common.js"></script>	
</body>
</html>