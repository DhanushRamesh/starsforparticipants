<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="context" value="${pageContext.request.contextPath}"></c:set>
<table>
<thead>
<tr>
<th>Trainee Id</th>
<th>Subject</th>
<th>Location</th>
<th>Timing</th>
</tr>
</thead>
<tbody><tr>
<td>${courseRequest.id}</td>
<td>${courseRequest.subject}</td>
<td>${courseRequest.location}</td>
<td>${courseRequest.timing }</td>
<td>
<form action = "${context}/nominate">
<input type="hidden" value="${courseRequest.id}"/>
<input type="submit"  value="Nominate">
</form>
</td>
</tr>
</tbody>

</table>
</body>
</html>