<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Form</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<div class="container mt-5">
		<h2 class="mb-4">Employee Form</h2>
		<form action="views/submitEmployee.jsp" method="get">
			<div class="mb-3">
				<label for="empName" class="form-label">Name</label> <input
					type="text" class="form-control" id="empName" name="name"
					placeholder="Enter name" required>
			</div>
			<div class="mb-3">
				<label for="empDesignation" class="form-label">Designation</label> <input
					type="text" class="form-control" id="empDesignation"
					name="designation" placeholder="Enter designation" required>
			</div>
			<div class="mb-3">
				<label for="empSalary" class="form-label">Salary</label> <input
					type="number" class="form-control" id="empSalary" name="salary"
					placeholder="Enter salary" required>
			</div>
			<button type="submit" class="btn btn-primary">Submit</button>
		</form>

		<%
		application.setAttribute("cname", "Mphasis");
		application.setAttribute("address", "Banglore");
		%>
	</div>

	<!-- Bootstrap 5 JS (Optional for components) -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
