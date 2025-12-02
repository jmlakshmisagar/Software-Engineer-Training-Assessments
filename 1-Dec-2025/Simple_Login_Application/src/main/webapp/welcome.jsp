
<%@ page import="jakarta.servlet.RequestDispatcher"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<title>Welcome</title>
</head>
<body>
	<h2>Welcome</h2>

	<%
        String uname = (String) session.getAttribute("uname");
        String token = (String) session.getAttribute("token");

        if (token == null) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("error.jsp");
            dispatcher.forward(request, response);
            return;
        }
    %>

	<p>
		Hello,
		<%= uname %>!
		<%= token %>
	</p>
</body>
</html>
