<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
	<h1 style="color: green">Welcome ${user.name}</h1>

	<form action="../details/${user.role}" method="post">
		<input type="hidden" name="uname" value="${user.name}"> <input
			type="hidden" name="password" value="${user.password}"> <input
			type="submit" value="Get Details">
	</form>

</body>
</html>