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
<c:forEach items = "${trainees}" var ="trainee" >
 Your trainee is ${trainee.firstName} and id is ${trainee.id}

</c:forEach>
<h1>tesrt</h1>
</body>
</html>