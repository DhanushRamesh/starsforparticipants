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
<style>
    @import url(https://fonts.googleapis.com/css?family=Open+Sans:400,700);

    body {
      background: #456;
      font-family: 'Open Sans', sans-serif;
    }
    h2{
      text-align: center;
    }

    .login {
      width: 400px;
      margin: 16px auto;
      font-size: 16px;
    }

    /* Reset top and bottom margins from certain elements */
    .login-header,
    .login p {
      margin-top: 0;
      margin-bottom: 0;
    }

    /* The triangle form is achieved by a CSS hack */
    .login-triangle {
      width: 0;
      margin-right: auto;
      margin-left: auto;
      border: 12px solid transparent;
      border-bottom-color: #28d;
    }

    .login-header {
      background: #28d;
      padding: 20px;
      font-size: 1.4em;
      font-weight: normal;
      text-align: center;
      text-transform: uppercase;
      color: #fff;
    }

    .login-container {
      background: #ebebeb;
      padding: 12px;
    }

    /* Every row inside .login-container is defined with p tags */
    .login p {
      padding: 12px;
    }

    .login input {
      box-sizing: border-box;
      display: block;
      width: 100%;
      border-width: 1px;
      border-style: solid;
      padding: 16px;
      outline: 0;
      font-family: inherit;
      font-size: 0.95em;
    }

    .login input[type="email"],
    .login input[type="password"] {
      background: #fff;
      border-color: #bbb;
      color: #555;
    }

    /* Text fields' focus effect */
    .login input[type="email"]:focus,
    .login input[type="password"]:focus {
      border-color: #888;
    }

    .login input[type="submit"] {
      background: #28d;
      border-color: transparent;
      color: #fff;
      cursor: pointer;
    }

    .login input[type="submit"]:hover {
      background: #17c;
    }

    /* Buttons' focus effect */
    .login input[type="submit"]:focus {
      border-color: #05a;
    }

  
  </style>
</head>
<body>
<c:set var="context" value="${pageContext.request.contextPath}"></c:set>
<h2>Welcome Admin!!!</h2><br>
  <div class="login">
<form:form method = "POST" action = "${context}/adminlogin" modelAttribute="adminModal">
            	<form:input path = "userid" placeholder="UserID" />
            	<br>
            	<br>
            	<form:input path = "password" placeholder="Password" type="password" />
            	<br>
            	<br>
            	  <input type = "submit" value = "Login" class="btn" />
            	  <p>${error}</p> 
            	  
            	 `
</form:form>
</div>
</body>
</html>