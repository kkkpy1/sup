<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>선물 / 결제</title>
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>
<body>
<div class="container">

	<h1>선물 / 결제</h1>
	<h3>배송정보</h3>
	<form class="form-horizontal">
		<div class="form-group">
			<label for="inputEmail3" class="col-sm-2 control-label">받는 사람</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="inputName3"
					placeholder="이름을 입력해주세요.">
			</div>
		</div>

		<div class="form-group">
			<label for="inputPassword3" class="col-sm-2 control-label">휴대전화</label>
			<div class="col-sm-10">
				<input type="password" class="form-control" id="inputPassword3"
					placeholder="Password">
			</div>
		</div>

		<div class="form-group">
			<label for="inputPassword3" class="col-sm-2 control-label">Password</label>
			<div class="col-sm-10">
				<input type="password" class="form-control" id="inputPassword3"
					placeholder="Password">
			</div>
		</div>
		<div class="slide-footer">
			<span class="pull-right buttons">
				<button class="btn btn-sm btn-default" id="cancel">
					<i class="fa fa-fw fa-eye"></i> 취소하기
				</button>
				<button class="btn btn-sm btn-primary" id="btn_ok">
					<i class="fa fa-fw fa-shopping-cart"></i> 완료
				</button>
			</span>
		</div>
	</form>
	<script>
						$('#cancel').on('click', function() {
							if (confirm("정말 취소하시겠습니까 ? ")) {
								alert("취소되었습니다.");
								close();
							} else {
								history.go(0);
							}
						});
						
						$('#btn_ok').on('click', function() {
							alert("정보 저장 완료")
								close();
							} else {
								history.go(0);
							}
						});
					</script>
</body>
</html>