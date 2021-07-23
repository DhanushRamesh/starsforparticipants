<html lang="en" dir="ltr">

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>

  <meta charset="utf-8">



  <title></title>

</head>
<body>
<c:set var="context" value="${pageContext.request.contextPath}"></c:set>
  <ul class="menu cf">

    <li><a href="#">Home</a></li>

    <li>

      <a href="${context}/showlogin">Login</a>

      <ul class="submenu">

        <li><a href="${context}/showlogin">Trainer Login</a></li>

        <li><a href="${context}/showlogin">Trainee Login</a></li>

        <li><a href="${context}/showlogin">AdminLogin</a></li>

      </ul>

    </li>

    <li>

      <a href="${context}/register">Register</a>

      <ul class="submenu">

        <li><a href="${context}/register">Teach with us </a></li>

        <li><a href="${context}/register">Learn with us</a></li>

      </ul>

    </li>



    <li><a href="#">About Us</a></li>

  </ul>
  </body>
  </html>
