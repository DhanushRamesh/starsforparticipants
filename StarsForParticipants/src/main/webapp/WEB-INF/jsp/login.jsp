<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>
<c:set var="context" value="${pageContext.request.contextPath}"></c:set>
<h2>Login</h2><br>
  <div class="login">
  
<form:form method = "POST" action = "${context}/login" modelAttribute="loginModal">
            	<form:input path = "userid" placeholder="UserID" />
            	<br>
            	<br>
            	<form:input path = "password" placeholder="Password" type="password" />
            	<br>
            	<br>
            	  <input type = "submit" value = "Login" class="btn" />
            	  
            	  
            	 `
</form:form>
<p>${loginFailed}</p> 
</div>
</body>
</html>