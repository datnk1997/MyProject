<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Free Bootstrap Admin Template : Binary Admin</title>
<!-- BOOTSTRAP STYLES-->
<link href="/Assignment-java4/assets/css/bootstrap.css" rel="stylesheet" />
<!-- FONTAWESOME STYLES-->
<link href="/Assignment-java4/assets/css/font-awesome.css"
	rel="stylesheet" />
<!-- MORRIS CHART STYLES-->

<!-- CUSTOM STYLES-->
<link href="/Assignment-java4/assets/css/custom.css" rel="stylesheet" />
<!-- GOOGLE FONTS-->
<link href='http://fonts.googleapis.com/css?family=Open+Sans'
	rel='stylesheet' type='text/css' />
<!-- TABLE STYLES-->
<link
	href="/Assignment-java4/assets/js/dataTables/dataTables.bootstrap.css"
	rel="stylesheet" />
</head>
<body>
	<div id="wrapper">
		<nav class="navbar navbar-default navbar-cls-top " role="navigation"
			style="margin-bottom: 0">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target=".sidebar-collapse">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="index.html"> Admin</a>
		</div>
		<div
			style="color: white; padding: 15px 50px 5px 50px; float: right; font-size: 16px;">
			<a href="#" class="btn btn-danger square-btn-adjust">Home</a>
		</div>
		</nav>
		<!-- /. NAV TOP  -->
		<nav class="navbar-default navbar-side" role="navigation">
		<div class="sidebar-collapse">
			<ul class="nav" id="main-menu">
				<li class="text-center"><img
					src="/Assignment-java4/assets/img/find_user.png"
					class="user-image img-responsive" /></li>
				<li><a class="active-menu" href="table.html"><i
						class="fa fa-table fa-3x"></i> Table Examples</a></li>
				<li><a href="form.html"><i class="fa fa-edit fa-3x"></i>
						Forms </a></li>



			</ul>
		</div>

		</nav>
		<!-- /. NAV SIDE  -->
		<div id="page-wrapper">
			<div id="page-inner">
				<div class="row">
					<div class="col-md-12">
						<h2>Add Custommer</h2>


					</div>
				</div>
				<!-- /. ROW  -->
				<hr />
				<div class="row">
					<div class="col-md-12">
						<!-- Form Elements -->
						<div class="panel panel-default">
							<div class="panel-heading"></div>
							<div class="panel-body">
								<div class="row">
									<div class="col-md-6">

										<form role="form">
											<div class="form-group">
												<label>Hãng sản xuất</label> <select class="form-control">
													<option>Chọn</option>
													<option>Iphone</option>
													<option>Sam Sung</option>
													<option>Sony</option>
													<option>Oppo</option>
												</select>
											</div>
											<div class="form-group">
												<label>Tên Điện Thoại</label> <input class="form-control" />
											</div>
											<div class="form-group">
												<label>Giá Tiền</label> <input class="form-control" />
											</div>
											<div class="form-group">
												<label>Note</label>
												<textarea class="form-control" rows="3"></textarea>
											</div>
											<div class="form-group">
												<label>Ảnh</label> <input type="file" />
											</div>
											<div class="form-group">
												<label>Độ Rộng Màn Hình</label> <input class="form-control" />
											</div>
											<div class="form-group">
												<label>Tên CPU</label> <input class="form-control" />
											</div>
											<div class="form-group">
												<label>Hệ Điều Hành</label> <input class="form-control" />
											</div>
											<div class="form-group">
												<label>Ram</label> <input class="form-control" />
											</div>
											<div class="form-group">
												<label>Ram</label> <input class="form-control" />
											</div>
											<div class="form-group">
												<label>Bộ Nhớ Trong</label> <input class="form-control" />
											</div>
											
											<button type="reset" class="btn btn-primary">Chọn Lại</button>
											<button type="submit" class="btn btn-default" style="background: red;">Thêm Sản Phẩm </button>
											
											
											<!-- <div class="form-group">
												<label>Checkboxes</label>
												<div class="checkbox">
													<label> <input type="checkbox" value="" />Checkbox
														Example One
													</label>
												</div>
												<div class="checkbox">
													<label> <input type="checkbox" value="" />Checkbox
														Example Two
													</label>
												</div>
												<div class="checkbox">
													<label> <input type="checkbox" value="" />Checkbox
														Example Three
													</label>
												</div>
											</div>
											<div class="form-group">
												<label>Inline Checkboxes Examples</label> <label
													class="checkbox-inline"> <input type="checkbox" />
													One
												</label> <label class="checkbox-inline"> <input
													type="checkbox" /> Two
												</label> <label class="checkbox-inline"> <input
													type="checkbox" /> Three
												</label>
											</div>
											<div class="form-group">
												<label>Radio Button Examples</label>
												<div class="radio">
													<label> <input type="radio" name="optionsRadios"
														id="optionsRadios1" value="option1" checked />Radio
														Example One
													</label>
												</div>
												<div class="radio">
													<label> <input type="radio" name="optionsRadios"
														id="optionsRadios2" value="option2" />Radio Example Two
													</label>
												</div>
												<div class="radio">
													<label> <input type="radio" name="optionsRadios"
														id="optionsRadios3" value="option3" />Radio Example Three
													</label>
												</div>
											</div>

											<div class="form-group">
												<label>Select Example</label> <select class="form-control">
													<option>One Vale</option>
													<option>Two Vale</option>
													<option>Three Vale</option>
													<option>Four Vale</option>
												</select>
											</div>
											<div class="form-group">
												<label>Multiple Select Example</label> <select multiple
													class="form-control">
													<option>One Vale</option>
													<option>Two Vale</option>
													<option>Three Vale</option>
													<option>Four Vale</option>
												</select>
											</div> -->
											

										</form>
										<br />
										
				<!-- /. ROW  -->
			</div>
			<!-- /. PAGE INNER  -->
		</div>
		<!-- /. PAGE WRAPPER  -->
	</div>
	<!-- /. WRAPPER  -->
	<!-- SCRIPTS -AT THE BOTOM TO REDUCE THE LOAD TIME-->
	<!-- JQUERY SCRIPTS -->
	<script src="/Assignment-java4/assets/js/jquery-1.10.2.js"></script>
	<!-- BOOTSTRAP SCRIPTS -->
	<script src="/Assignment-java4/assets/js/bootstrap.min.js"></script>
	<!-- METISMENU SCRIPTS -->
	<script src="/Assignment-java4/assets/js/jquery.metisMenu.js"></script>
	<!-- CUSTOM SCRIPTS -->
	<script src="/Assignment-java4/assets/js/custom.js"></script>


</body>
</html>

