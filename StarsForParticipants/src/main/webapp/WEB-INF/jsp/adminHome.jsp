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
<p>Admin Home Page</p>
<ul>
      <li><a href="/TrainerDetails.html">Trainer Details</a></li>
      <li><a href="/ListOfRequests.html">List of Requests</a></li>
      <li><a href="/GenerateReport.html">Generate Report</a></li>
      <li><a href="/GenerateReport.html">Nominated Trainers</a></li>
      <li><a href="/">Log out</a></li>
    </ul>

</body>
</html>