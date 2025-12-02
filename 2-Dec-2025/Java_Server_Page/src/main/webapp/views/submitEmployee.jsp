<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Details</title>
<!-- Bootstrap CSS for styling -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<div class="container mt-5">
		<div class="card shadow p-4">
			<div class="card-header bg-secondary text-white">
				<h2 class="mb-0">Employee Details</h2>
			</div>
			<div class="card-body">
				<h5 class="mb-3">
					Employee Name:
					<%=request.getParameter("name")%></h5>
				<h5 class="mb-3">
					Designation:
					<%=request.getParameter("designation")%></h5>
				<h5 class="mb-3">
					Salary: ₹<%=request.getParameter("salary")%></h5>
				<h5 class="mb-3">
					Company Name:
					<%=application.getAttribute("cname")%></h5>
				<h5 class="mb-3">
					Address:
					<%=application.getAttribute("address")%></h5>
			</div>
		</div>
	</div>
</body>
</html>
