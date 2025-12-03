<%@ include file="db.jsp" %>
<sql:query var="rs" dataSource="${db}">
    SELECT * FROM customer
</sql:query>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer List</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <h2>Customer List</h2>
    <a href="addCustomer.jsp" class="btn btn-success mb-3">Add New Customer</a>
    <table class="table table-bordered table-striped">
        <thead class="table-dark">
            <tr>
                <c:forEach var="col" items="${rs.columnNames}">
                    <th>${col}</th>
                </c:forEach>
                <th>Actions</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="row" items="${rs.rows}">
                <tr>
                    <c:forEach var="col" items="${rs.columnNames}">
                        <td>${row[col]}</td>
                    </c:forEach>
                    <td>
                        <a href="editCustomer.jsp?id=${row.customerid}" class="btn btn-warning btn-sm">Edit</a>
                        <a href="deleteCustomer.jsp?id=${row.customerid}" class="btn btn-danger btn-sm"
                           onclick="return confirm('Are you sure you want to delete this customer?');">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
