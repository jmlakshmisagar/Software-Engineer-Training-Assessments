<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.Date"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String username = request.getParameter("username");
	String password = request.getParameter("password");
	%>
	<%
	if (username.equals("jmlakshmisagar")  && password.equals("123")) {
			session.setAttribute("username", username);
			response.sendRedirect("image.jsp");
		}
	%>
	<h3>
		User name :<%=username%>

	</h3>
	<h3>
		Password :<%=password%>
	</h3>
	

</body>
</html>