<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
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
<form action="${context}/createCourseRequest">
<table>
<thead>
<tr>
<th>Subject</th>
<th>Location</th>
<th>Timing</th>
<th>Weekend Classes</th>
<th>Mode of Learning</th>

</tr>
</thead>
<tbody>
<tr>
<td>${course.subject}</td>
<td>${course.location}</td>
<td>${course.timing }</td>
<td>${course.weekend }</td>
<td>${course.modeOfLearning }</td>
</tr>
<tr>
<c:forEach items="${trainerList}" var="trainer">
	<td><input name="selectedTrainer" type="radio" value="${trainer.userId}"/>
	<td>${trainer.userId }</td>
</c:forEach>

</tr>
</table>
<input type="hidden" name="traineeId" value="${traineeId}"/>
<input type="submit" value="Send request"/>
</form>
</body>

</html>