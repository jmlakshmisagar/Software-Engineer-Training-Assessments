<%@ include file="db.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Customer</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <h2>Add Customer</h2>
    <form method="post" action="insertCustomer.jsp">
        <div class="mb-3">
            <label class="form-label">Customer ID</label>
            <input type="number" name="customerid" class="form-control" required>
        </div>
        <div class="mb-3">
            <label class="form-label">Name</label>
            <input type="text" name="name" class="form-control" required>
        </div>
        <div class="mb-3">
            <label class="form-label">Address</label>
            <input type="text" name="address" class="form-control" required>
        </div>
        <div class="mb-3">
            <label class="form-label">Phone Number</label>
            <input type="text" name="phonenumber" class="form-control" required>
        </div>
        <div class="mb-3">
            <label class="form-label">Email</label>
            <input type="email" name="email" class="form-control" required>
        </div>
        <button type="submit" class="btn btn-primary">Add Customer</button>
        <a href="listCustomer.jsp" class="btn btn-secondary">Back to List</a>
    </form>
</div>
</body>
</html>
