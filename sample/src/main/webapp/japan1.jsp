<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head><meta charset="UTF-8"><title>フォーム</title></head>
<body>
<form method="post" action="JapanServlet">
	あなたのなまえは？
	<input type="text" name="name" />
	<input type="submit" value="送信" />
</form>
</body>
</html>
