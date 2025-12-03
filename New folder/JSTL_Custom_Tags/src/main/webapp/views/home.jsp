<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:set var="username" value="${param.username}" />
	<c:set var="password" value="${param.password}" />
	
	<c:choose>
		<c:when test="${username == 'jmlakshmisagar' && password == '123'}">
			<c:redirect url="success.jsp" />
		</c:when>
		<c:otherwise>
			<c:redirect url="error.jsp" />
		</c:otherwise>
	</c:choose>

</body>
</html>