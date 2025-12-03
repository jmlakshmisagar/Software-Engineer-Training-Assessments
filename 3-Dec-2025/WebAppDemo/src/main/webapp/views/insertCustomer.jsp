<%@ include file="db.jsp" %>
<sql:update dataSource="${db}" var="result">
    INSERT INTO customer (customerid, name, address, phonenumber, email)
    VALUES (${param.customerid}, '${param.name}', '${param.address}', '${param.phonenumber}', '${param.email}')
</sql:update>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert Customer</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <div class="alert alert-success">
        Customer added successfully! Rows affected: ${result}
    </div>
    <a href="listCustomer.jsp" class="btn btn-primary">Back to List</a>
    <a href="addCustomer.jsp" class="btn btn-secondary">Add Another</a>
</div>
</body>
</html>

