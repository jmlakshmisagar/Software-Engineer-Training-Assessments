<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Form</title>
</head>
<body>

	<h1>User Details Form</h1>

	<form action="${pageContext.request.contextPath}/add" method="post">

		<label>Name:</label> <input type="text" name="name" required><br>
		<br> <label>Password:</label> <input type="password"
			name="password" required><br>
		<br> <label>Role:</label> <select name="role" required>
			<option value="">-- Select Role --</option>
			<option value="admin">Admin</option>
			<option value="user">User</option>
			<option value="manager">Manager</option>
		</select> <br>
		<br> <label>ID:</label> <input type="number" name="id" required><br>
		<br> <input type="submit" value="Submit">

	</form>

</body>
</html>
