<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<nav class="navbar navbar-default navbar-static-top">
	<div class="container-fluid">
		<!-- Brand and toggle get grouped for better mobile display -->
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="admin_main"> SUP </a>
		</div>

		<!-- Collect the nav links, forms, and other content for toggling -->
		<div class="collapse navbar-collapse"
			id="bs-example-navbar-collapse-1">
			<form class="navbar-form navbar-left" method="GET" role="search">
				<div class="form-group">
					<input type="text" name="q" class="form-control"
						placeholder="Search">
				</div>
				<button type="submit" class="btn btn-default">
					<i class="glyphicon glyphicon-search"></i>
				</button>
			</form>
			<ul class="nav navbar-nav navbar-right">
				<li id="logout"><a href="" target="">logout</a></li>
			</ul>
		</div>
		<!-- /.navbar-collapse -->
	</div>
	<!-- /.container-fluid -->
</nav>
<div class="container-fluid main-container">
	<div class="col-md-2 sidebar">
		<ul class="nav nav-pills nav-stacked">
			<li><a href="admin_main">글 신고 요청 관리</a></li>
			<li><a href="product_report">상품 신고 관리</a></li>
			<li><a href="general_account">일반 계정 관리</a></li>
			<li><a href="seller_account">판매자 계정 관리</a></li>
		</ul>
	</div>