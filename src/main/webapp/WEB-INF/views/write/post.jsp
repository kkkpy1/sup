<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:import url="../common/header.jsp" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>내 글 목록</title>
<link
	href="//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-xs-8 col-xs-offset-2">
				<h4 style="font-weight: bold; text-align: center;">
					내가 쓴 글<i class="fa fa-fw fa-heart text-danger"></i>
				</h4>
			</div>
		</div>
		<hr>
		<!-- Begin of rows -->
		
		<div class="row carousel-row">
			<div class="col-xs-8 col-xs-offset-2 slide-row">
				<div id="carousel-1" class="carousel slide slide-carousel"
					data-ride="carousel">
					<fieldset>
						<div
							style="width: 200px; height: 150px; border: 1px; float: left; margin-right: 10px;">
							<img src="http://placehold.it/150x120" id="image" width=150 /> <input
								type="file" name="image" accept="image/*"
								style="visibility: hidden;">
						</div>
						<div
							style="width: 200px; height: 150px; border: 1px; float: left;">
							<textarea rows="5" cols="50" name="detail"></textarea>
						</div>
						<
						<div class="slide-footer">
							<span class="pull-right buttons">
								<button class="btn btn-sm btn-default"  id="update">
									<i class="fa fa-fw fa-eye"></i> 수정하기
								</button>
								<button class="btn btn-sm btn-primary" id="delete">
									<i class="fa fa-fw fa-shopping-cart"></i> 삭제하기
								</button>
							</span>
						</div>
					</fieldset>

					<fieldset>
						<div
							style="width: 200px; height: 150px; border: 1px; float: left; margin-right: 10px;">
							<img src="http://placehold.it/150x120" id="image" width=150 /> <input
								type="file" name="image" accept="image/*"
								style="visibility: hidden;">
						</div>
						<div
							style="width: 200px; height: 150px; border: 1px; float: left;">
							<textarea rows="5" cols="50" name="detail"></textarea>
						</div>
						<div class="slide-footer">
							<span class="pull-right buttons">
								<button class="btn btn-sm btn-default"  id="update">
									<i class="fa fa-fw fa-eye"></i> 수정하기
								</button>
								<button class="btn btn-sm btn-primary" id="delete">
									<i class="fa fa-fw fa-shopping-cart"></i> 삭제하기
								</button>
							</span>
						</div>
					</fieldset>

					<fieldset>
						<div
							style="width: 200px; height: 150px; border: 1px; float: left; margin-right: 10px;">
							<img src="http://placehold.it/150x120" id="image" width=150 /> <input
								type="file" name="image" accept="image/*"
								style="visibility: hidden;">
						</div>
						<div
							style="width: 200px; height: 150px; border: 1px; float: left;">
							<textarea rows="5" cols="50" name="detail"></textarea>
						</div>

						<div class="slide-footer">
							<span class="pull-right buttons">
								<button class="btn btn-sm btn-default" id="update">
									<i class="fa fa-fw fa-eye"></i> 수정하기
								</button>
								<button class="btn btn-sm btn-primary" id="delete">
									<i class="fa fa-fw fa-shopping-cart"></i> 삭제하기
								</button>
							</span>
						</div>
					</fieldset>
					<script>
						$('#delete').on('click', function() {
							if (confirm("정말 삭제하시겠습니까 ? ")) {
								alert("삭제되었습니다.");
								location.href = "post";
							} else {
								history.go(0);
							}
						});
						
						$('#update').on('click', function() {
							if (confirm("수정하시겠습니까 ? ")) {
								location.href = "write";
							} else {
								history.go(0);
							}
						});
					</script>
					<c:import url="../common/footer.jsp" />