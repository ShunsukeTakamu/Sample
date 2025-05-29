<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<title>新規追加</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<h2>新規追加</h2>
		<form action="PlayerAddServlet" method="post">

			<div class="mb-3">
				<label>国ID</label>
				<input type="text" name="country_id" class="form-control" required />
			</div>

			<div class="mb-3">
				<label>背番号(uniform_num)</label>
				<input type="text" name="uniform_num" class="form-control" required />
			</div>

			<div class="mb-3">
				<label>ポジション</label>
				<select name="position" class="form-select">
					<option value="FW">FW</option>
					<option value="MF">MF</option>
					<option value="DF">DF</option>
					<option value="GK">GK</option>
				</select>
			</div>

			<div class="mb-3">
				<label>名前</label>
				<input type="text" name="name" class="form-control" required />
			</div>

			<div class="mb-3">
				<label>クラブ名</label>
				<input type="text" name="club" class="form-control" required />
			</div>

			<div class="mb-3">
				<label>生年月日（birth）</label>
				<input type="date" name="birth" class="form-control" />
			</div>

			<div class="mb-3">
				<label>身長(cm)</label>
				<input type="text" name="height" class="form-control">
			</div>

			<div class="mb-3">
				<label>体重(kg)</label>
				<input type="text" name="weight" class="form-control">
			</div>

			<button type="submit" class="btn btn-primary">確定</button>
		</form>
	</div>
</body>
</html>
