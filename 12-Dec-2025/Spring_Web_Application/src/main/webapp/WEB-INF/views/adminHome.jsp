<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<body>
    <h1 style="color:green">Admin Panel – All Users</h1>

    <table border="1">
        <tr>
            <th>ID</th><th>Name</th><th>Role</th><th>Password</th>
        </tr>

        <c:forEach items="${users}" var="u">
            <tr>
                <td>${u.id}</td>
                <td>${u.name}</td>
                <td>${u.role}</td>
                <td>${u.password}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
