<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="user" value="${userInfo}" />
<link
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.3/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//netdna.bootstrapcdn.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<link rel="stylesheet" href="../../../static/css/header.css">
<script>
	$(document).ready(function(e) {
		$('.search-panel .dropdown-menu').find('a').click(function(e) {
			e.preventDefault();
			var param = $(this).attr("href").replace("#", "");
			var concept = $(this).text();
			$('.search-panel span#search_concept').text(concept);
			$('.input-group #search_param').val(param);
		});
	});
</script>
<!------ Include the above in your HEAD tag ---------->

<nav class="navbar navbar-default" role="navigation">
	<!-- Brand and toggle get grouped for better mobile display -->
	<a href="index" target=_blank><img
		src="../../../static/images/SUP_logo.png" width="100px" height="100px">
	</a>

	<div class="container" >
		<div class="row">
			<div class="col-xs-8 col-xs-offset-2">
				<div class="input-group">
					<div class="input-group-btn search-panel">
						<button type="button" class="btn btn-default dropdown-toggle"
							data-toggle="dropdown">
							<span id="search_concept">--선택--</span> <span class="caret"></span>
						</button>
						<ul class="dropdown-menu" role="menu">
							<li><a href="#all">통합검색</a></li>
							<li><a href="#its_equal">상품검색</a></li>
							<li><a href="#greather_than">친구검색</a></li>
						</ul>
					</div>
					<input type="hidden" name="search_param" value="all"
						id="search_param"> <input type="text" class="form-control"
						id="x" placeholder="검색어를 입력해주세요."> <span
						class="input-group-btn">
						<button class="btn btn-default" type="button">
							<span class="glyphicon glyphicon-search"></span>
						</button>
					</span>
				</div>
			</div>
		</div>
	</div>

</nav>

<nav class="navbar navbar-default" role="navigation">
	<!-- Brand and toggle get grouped for better mobile display -->



	<!-- Collect the nav links, forms, and other content for toggling -->
	<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-2">
		<ul class="nav navbar-nav">
			<%-- <c:if test="${empty user.userid}">
				<li><a href="login">로그인</a></li>
			</c:if>
			<c:if test="${not empty user.userid}">
				login 했다면
				<c:if test="${user.flag eq 1}"> --%>
			<li><a href="login">로그인</a></li>
			<li><a href="gift">선물함</a></li>
			<%-- </c:if>
			</c:if> --%>
			<li><a href="store">스토어</a></li>
			<li><a href="best">베스트</a></li>
			<li><a href="category">카테고리</a></li>
			<li><a href="write">글쓰기</a></li>
			<li><a href="mypage">마이페이지</a></li>
		</ul>
		</form>
	</div>
	</div>
	<!-- /.navbar-collapse -->
</nav>