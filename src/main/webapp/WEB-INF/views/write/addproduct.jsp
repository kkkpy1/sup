<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<!DOCTYPE html>
	<html>
	<head>
	<meta charset="UTF-8">
	<title>상품추가</title>
	<style>
		fieldset{
			margin : 15px 10px;
			max-width:450px;
		}
	</style>
	</head>
	<body>
	<form>
			<fieldset style="margin-left: auto; margin-right: auto;">
				<label>상품검색</label>
				<input type="text" name="" value="" />
				<input type="submit" value="검색" />
			</fieldset>
			
			<fieldset style="margin-left: auto; margin-right: auto;">
			<table>
				<tr>
					<td rowspan="2">
						<img src="http://placehold.it/150x120" id="image" width=150 />
						<input type="file" name="image" accept="image/*" style="visibility: hidden;">
					</td>
					<td><input type="text" name="" size=20></td>
					<td rowspan="2"><i class="fa fa-plus-square"></i></td>
				</tr>
				<tr>
					<td><input type="text" name="" size=20></td>
				</tr>
				
			</table>
			</fieldset>
			<button type="submit">선택하기</button>
	</form>
	</body>
	</html>