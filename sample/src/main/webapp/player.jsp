<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<html>
<head>
<title>選手一覧</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<h2>選手一覧</h2>
		<div class="text-end mb-3">
			<a class="btn btn-success mb-3" href="PlayerAddServlet">新規追加</a>
		</div>
		<p>登録件数：${fn:length(players)} 件</p>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>ID</th>
					<th>国ID</th>
					<th>背番号</th>
					<th>ポジション</th>
					<th>名前</th>
					<th>クラブ</th>
					<th>生年月日</th>
					<th>身長</th>
					<th>体重</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="p" items="${players}">
					<tr>
						<td>${p.id}</td>
						<td>${p.country_id}</td>
						<td>${p.uniform_num}</td>
						<td>${p.position}</td>
						<td>${p.name}</td>
						<td>${p.club}</td>
						<td>${p.birth}</td>
						<td>${p.height}</td>
						<td>${p.weight}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>
