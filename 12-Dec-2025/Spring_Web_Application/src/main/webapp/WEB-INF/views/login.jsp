<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Form</title>

<script>
	function setFormAction() {
		const admin = document.getElementById('admin');
		const user = document.getElementById('user');
		const manager = document.getElementById('manager');
		const form = document.getElementById('loginForm');

		if (admin.checked)
			form.action = "home/admin";
		else if (user.checked)
			form.action = "home/user";
		else if (manager.checked)
			form.action = "home/manager";
	}
</script>

</head>

<body>
	<h1>Login Form</h1>

	<form id="loginForm" method="post" onsubmit="setFormAction()">

		<label>Name:</label> <input type="text" name="uname" required><br>
		<br> <label>Password:</label> <input type="password"
			name="password" required><br>
		<br> <label><input type="radio" name="role" value="admin"
			id="admin"> Admin</label> <label><input type="radio"
			name="role" value="user" id="user"> User</label> <label><input
			type="radio" name="role" value="manager" id="manager">
			Manager</label> <br>
		<br>
		<button>
			<a href="userform">add</a>
		</button>
		<input type="submit" value="Submit"> <a href="/add"></a>
	</form>

</body>
</html>
