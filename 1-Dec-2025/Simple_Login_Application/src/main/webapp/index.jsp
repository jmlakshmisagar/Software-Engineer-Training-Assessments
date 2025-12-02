
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<title>Login Page</title>
</head>
<body>
	<h2>Login Form</h2>
	<form action="Login" method="get">
		<label for="username">User name:</label> <input type="text"
			id="username" name="username" required><br>
		<br> <label for="password">Password:</label> <input
			type="password" id="password" name="password" required><br>
		<br>

		<button type="submit">Login</button>
	</form>
</body>
</html>
