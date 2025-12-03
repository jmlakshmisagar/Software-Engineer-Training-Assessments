<%@ include file="db.jsp"%>
<sql:update dataSource="${db}" var="result">
    DELETE FROM customer WHERE customerid=${param.id}
</sql:update>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete Customer</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<div class="container mt-5">
		<div class="alert alert-danger">Customer deleted successfully!
			Rows affected: ${result}</div>
		<a href="listCustomer.jsp" class="btn btn-primary">Back to List</a>
	</div>
</body>
</html>
