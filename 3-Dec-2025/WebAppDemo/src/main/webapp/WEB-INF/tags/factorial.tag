<%@ tag pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>


<%@ attribute name="num" required="true" type="int" %>

<c:set var="fact" value="1" />
<c:forEach var="i" begin="1" end="${num}">
    <c:set var="fact" value="${fact * i}" />
</c:forEach>

${fact}
