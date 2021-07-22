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
<form>
<table>

<tr>
<th>Trainer id</th>
<th>Trainee id</th>
<th>Trainer Name</th>
<th>Trainee Name</th>
</tr>
<c:forEach items="${nominations}" var="nomination">
<tr>
<td>${nomination.trainerId }</td>
<td>${nomination.traineeId }</td>
<td>${nomination.trainername }</td>
<td>${nomination.traineename }</td>
<td><input type="submit" value="Confirm request"/></td>
</tr>

</c:forEach>
</table>
</form>
</body>
</html>