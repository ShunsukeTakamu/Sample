<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Coreタグライブラリ</title>
</head>
<body>
	あなたの得点は<c:out value="${ point }" />です。<br />
	
	<c:if test="${ point > 60 }">
		<span style="color: red;">合格です！</span>
	</c:if>
	
</body>
</html>