<%@ page contentType="text/html; charset=UTF-8"%>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js"></script>
<html>
<head>
<title>新規追加</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<h2>新規追加</h2>
		<form action="PlayerAddServlet" method="post">
			<div class="mb-3 row">
				<label class="col-sm-4">名前</label>
				<input type="text" name="name"  />
			</div>
			
			<div class="dropdown">
				<button class="btn btn-secondary dropdown-toggle" type="button"
					data-bs-toggle="dropdown" aria-expanded="false">ポジション</button>
				<ul class="dropdown-menu">
					<li><a class="dropdown-item" href="#">FW</a></li>
					<li><a class="dropdown-item" href="#">MF</a></li>
					<li><a class="dropdown-item" href="#">DF</a></li>
					<li><a class="dropdown-item" href="#">GK</a></li>
				</ul>
			</div>
			<button type="submit" class="btn btn-primary">確定</button>
		</form>
	</div>
</body>
</html>
