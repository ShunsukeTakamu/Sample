<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>一覧</title>
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body>
  <div class="container">
    <h2>選手一覧</h2>
    <a class="btn btn-success mb-3" href="PlayerAddServlet">新規追加</a>
    
    <table class="table table-striped">
      <thead>
        <tr><th>ポジション</th><th>名前</th></tr>
      </thead>
      <tbody>
        <c:forEach var="item" items="${players}">
          <tr>
            <td>${item.position}</td>
            <td>${item.name}</td>
          </tr>
        </c:forEach>
      </tbody>
    </table>
  </div>
</body>
</html>
	