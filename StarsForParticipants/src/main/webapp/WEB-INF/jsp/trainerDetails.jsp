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
<link rel="stylesheet" href="https://cdn.datatables.net/1.10.25/css/jquery.dataTables.min.css"/>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdn.datatables.net/1.10.25/js/jquery.dataTables.min.js"></script>

<script>

$(document).ready(function(){
	
	$("#trainerDetails").dataTable();
	
});

</script>
</head>
<body>
 <table id="trainerDetails"  border="2" width="70%" cellpadding="2">
 <thead>
 <tr>
 <th>Trainer Id</th>
 <th>First Name</th>
 <th>Last Name</th>
 <th>Location</th>
 <th>DOB</th>
 <th>Gender</th>
 <th>Availability</th>
 <th>Skill</th>
 </tr>
  </thead>
  <tbody>
  <c:forEach items = "${trainerDetails}" var = "trainer">
  <tr>
  	<td>${trainer.id }</td>
  	<td>${trainer.firstname }</td>
  	<td>${trainer.lastname }</td>
  	<td>${trainer.location}</td>
  	<td>${trainer.dob }</td>
  	<td>${trainer.gender }</td>
  	<td>${trainer.availability }</td>
  	<td>${trainer.skillset }</td>
  </tr>
  
  </c:forEach>
  
  </tbody>
 
 </table>
</body>
</html>