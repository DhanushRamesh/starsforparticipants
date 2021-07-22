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
<c:if test="${registrationStatus == true }">
<h1>User Registered Successfully. You can now <a href="${context}/showlogin">Login</a> here.</h1>
</c:if>

<c:if test="${registrationStatus == false }">
<h1>User Already Exists</h1>
<a href="${context}/register">Go back to Register</a>
</c:if>
</body>
</html>