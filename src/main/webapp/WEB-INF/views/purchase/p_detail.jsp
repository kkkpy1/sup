<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:import url="../common/header.jsp" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<script>
	$('#blogCarousel').carousel({
		interval : 5000
	});
</script>
</head>
<body>
	<div class="container">

		<div class="resume">
			<div class="row">
				<div
					class="col-xs-12 col-sm-12 col-md-offset-1 col-md-10 col-lg-offset-2 col-lg-8">
					<div class="panel panel-default">
						<div class="panel-heading resume-heading">
							<div class="row">
								<div class="col-lg-12">
									<div class="col-xs-12 col-sm-4">
										<figure>
											<img class="img-circle img-responsive" alt=""
												src="http://placehold.it/300x300">
										</figure>

										<div class="row">
											<div class="col-xs-12 social-btns">

												<div class="col-xs-3 col-md-1 col-lg-1 social-btn-holder">
													<a href="#" class="btn btn-social btn-block btn-google">
														<i class="fa fa-google"></i>
													</a>
												</div>

												<div class="col-xs-3 col-md-1 col-lg-1 social-btn-holder">
													<a href="#" class="btn btn-social btn-block btn-facebook">
														<i class="fa fa-facebook"></i>
													</a>
												</div>

												<div class="col-xs-3 col-md-1 col-lg-1 social-btn-holder">
													<a href="#" class="btn btn-social btn-block btn-twitter">
														<i class="fa fa-twitter"></i>
													</a>
												</div>

												<div class="col-xs-3 col-md-1 col-lg-1 social-btn-holder">
													<a href="#" class="btn btn-social btn-block btn-linkedin">
														<i class="fa fa-linkedin"></i>
													</a>
												</div>

												<div class="col-xs-3 col-md-1 col-lg-1 social-btn-holder">
													<a href="#" class="btn btn-social btn-block btn-github">
														<i class="fa fa-github"></i>
													</a>
												</div>

												<div class="col-xs-3 col-md-1 col-lg-1 social-btn-holder">
													<a href="#"
														class="btn btn-social btn-block btn-stackoverflow"> <i
														class="fa fa-stack-overflow"></i>
													</a>
												</div>
											</div>
										</div>
									</div>

									<div class="col-xs-12 col-sm-8">
										<ul class="list-group">
											<li class="list-group-item">상품명</li>
											<li class="list-group-item">상품가격</li>
										</ul>
										<button class="btn btn-sm btn-default" id="report">
											<i class="fa fa-fw fa-eye"></i> 신고하기
										</button>
										<button class="btn btn-sm btn-default" id="purchase">
											<i class="fa fa-fw fa-eye"></i> 나에게 선물하기
										</button>
										<button class="btn btn-sm btn-default" id="purchase1">
											<i class="fa fa-fw fa-eye"></i> 선물하기
										</button>
									</div>
								</div>
							</div>
						</div>
						<div>
							<ul class="nav nav-tabs">
								<li role="presentation" class="active"><a href="#">상품설명</a></li>
								<li role="presentation"><a href="#">상품 후기</a></li>
								<li role="presentation"><a href="#">Q&A</a></li>
							</ul>
						</div>
						<div>
							<h4>연관상품</h4>
							<div class="container">
								<div class="row blog">
									<div class="col-md-12">
										<div id="blogCarousel" class="carousel slide"
											data-ride="carousel">

											<ol class="carousel-indicators">
												<li data-target="#blogCarousel" data-slide-to="0"
													class="active"></li>
												<li data-target="#blogCarousel" data-slide-to="1"></li>
											</ol>

											<!-- Carousel items -->
											<div class="carousel-inner">

												<div class="carousel-item active">
													<div class="row">
														<div class="col-md-3">
															<a href="#"> <img src="http://placehold.it/150x120"
																alt="Image" style="max-width: 100%;">
															</a>
														</div>
														<div class="col-md-3">
															<a href="#"> <img src="http://placehold.it/150x120"
																alt="Image" style="max-width: 100%;">
															</a>
														</div>
														<div class="col-md-3">
															<a href="#"> <img src="http://placehold.it/150x120"
																alt="Image" style="max-width: 100%;">
															</a>
														</div>

													</div>
													<!--.row-->
												</div>
												<!--.item-->
												<!-- 
                            <div class="carousel-item">
                                <div class="row">
                                    <div class="col-md-3">
                                        <a href="#">
                                            <img src="http://placehold.it/150x120" alt="Image" style="max-width:100%;">
                                        </a>
                                    </div>
                                    <div class="col-md-3">
                                        <a href="#">
                                            <img src="http://placehold.it/150x120" alt="Image" style="max-width:100%;">
                                        </a>
                                    </div>
                                    <div class="col-md-3">
                                        <a href="#">
                                            <img src="http://placehold.it/150x120" alt="Image" style="max-width:100%;">
                                        </a>
                                    </div>
                                    <div class="col-md-3">
                                        <a href="#">
                                            <img src="http://placehold.it/150x120" alt="Image" style="max-width:100%;">
                                        </a>
                                    </div>
                                </div> -->
												<!--.row-->
											</div>
											<!--.item-->

										</div>
										<!--.carousel-inner-->
									</div>
									<!--.Carousel-->

								</div>
							</div>
						</div>
					</div>
					<script>
						$('#purchase').click(function() { //버튼을 클릭 했을시 popupOpen 함수 출력 
							console.log('click');
							popupOpen(); //Popup Open 함수
						});
						$('#purchase1').click(function() { //버튼을 클릭 했을시 popupOpen 함수 출력 
							console.log('click');
							popupOpen(); //Popup Open 함수
						});

						function popupOpen() {
							var url = "pay"; //팝업창 페이지 URL
							var winWidth = 700;
							var winHeight = 600;
							var popupOption = "width=" + winWidth + ", height="
									+ winHeight; //팝업창 옵션(optoin)
							window.open(url, "", popupOption);
						}
						$('#report').on('click', function(){
								location.href="report";
							});
					</script>
</body>
</html>
<c:import url="../common/footer.jsp" />