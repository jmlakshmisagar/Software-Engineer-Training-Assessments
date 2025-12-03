<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body class="bg-light">

    <div class="container mt-5">
        <div class="card shadow-sm p-4">

            <h3 class="text-center mb-4">Calculation Result</h3>

            <c:set var="n1" value="${param.num1}" />
            <c:set var="n2" value="${param.num2}" />
            <c:set var="op" value="${param.op}" />

            <c:choose>

                <c:when test="${op == 'add'}">
                    <c:set var="result" value="${n1 + n2}" />
                </c:when>

                <c:when test="${op == 'sub'}">
                    <c:set var="result" value="${n1 - n2}" />
                </c:when>

                <c:when test="${op == 'mul'}">
                    <c:set var="result" value="${n1 * n2}" />
                </c:when>

                <c:when test="${op == 'div'}">
                    <c:choose>
                        <c:when test="${n2 == 0}">
                            <c:set var="result" value="Cannot divide by zero!" />
                        </c:when>
                        <c:otherwise>
                            <c:set var="result" value="${n1 / n2}" />
                        </c:otherwise>
                    </c:choose>
                </c:when>

                <c:otherwise>
                    <c:set var="result" value="Invalid Operation" />
                </c:otherwise>

            </c:choose>

            <div class="alert alert-info mt-3">
                <strong>Number 1:</strong> <c:out value="${n1}" /> <br>
                <strong>Number 2:</strong> <c:out value="${n2}" /> <br>
                <strong>Operation:</strong> <c:out value="${op}" /> <br><br>
                <h4>Result: <c:out value="${result}" /></h4>
            </div>

            <a href="calculator.jsp" class="btn btn-secondary w-100">Go Back</a>

        </div>
    </div>

</body>
</html>
