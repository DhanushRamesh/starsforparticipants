<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
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
<th>Id</th>
<th>Subject</th>
<th>Location</th>
<th>Timing</th>
</tr>
</thead>
<tbody>
<c:forEach var= "course" items="${courseRequests}">
<tr>
<td><a href="${context}/viewRequest/${course.id}">${course.id}</a></td>
<td>${course.subject}</td>
<td>${course.location}</td>
<td>${course.timing}</td>
</tr>



</c:forEach>

</tbody>

</table>

</body>
</html>