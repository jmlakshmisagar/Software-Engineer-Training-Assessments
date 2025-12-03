<%@ include file="db.jsp" %>
<sql:query var="rs" dataSource="${db}">
    SELECT * FROM customer WHERE customerid=${param.id}
</sql:query>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Customer</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <h2>Edit Customer</h2>
    <form method="post" action="updateCustomer.jsp">
        <input type="hidden" name="customerid" value="${rs.rows[0].customerid}" />
        <div class="mb-3">
            <label class="form-label">Name</label>
            <input type="text" name="name" class="form-control" value="${rs.rows[0].name}" required>
        </div>
        <div class="mb-3">
            <label class="form-label">Address</label>
            <input type="text" name="address" class="form-control" value="${rs.rows[0].address}" required>
        </div>
        <div class="mb-3">
            <label class="form-label">Phone Number</label>
            <input type="text" name="phonenumber" class="form-control" value="${rs.rows[0].phonenumber}" required>
        </div>
        <div class="mb-3">
            <label class="form-label">Email</label>
            <input type="email" name="email" class="form-control" value="${rs.rows[0].email}" required>
        </div>
        <button type="submit" class="btn btn-primary">Update Customer</button>
        <a href="listCustomer.jsp" class="btn btn-secondary">Back to List</a>
    </form>
</div>
</body>
</html>
