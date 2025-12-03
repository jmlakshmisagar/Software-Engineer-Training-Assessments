<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet">

</head>
<body class="bg-light">

	<div
		class="container d-flex justify-content-center align-items-center vh-100">
		<div class="card shadow p-4" style="width: 350px;">

			<h3 class="text-center mb-4">Login</h3>

			<form action="views/home.jsp" method="get">
				<div class="mb-3">
					<label class="form-label">Username</label> <input type="text"
						name="username" class="form-control" required>
				</div>

				<div class="mb-3">
					<label class="form-label">Password</label> <input type="password"
						name="password" class="form-control" required>
				</div>

				<button type="submit" class="btn btn-primary w-100">Login</button>
			</form>

		</div>
	</div>

	<!-- Bootstrap JS -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
