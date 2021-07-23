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
	
	$("#allRequest").dataTable();
	
});

</script>
<style>
  @import url(https://fonts.googleapis.com/css?family=Roboto:400,500,700,300,100);

  body {
    background-color: #3e94ec;
    font-family: "Roboto", helvetica, arial, sans-serif;
    font-size: 16px;
    font-weight: 400;
    text-rendering: optimizeLegibility;
  }

  div.table-title {
     display: block;
    margin: auto;
    max-width: 600px;
    padding:5px;
    width: 100%;
  }

  .table-title h3 {
     color: #fafafa;
     font-size: 30px;
     font-weight: 400;
     font-style:normal;
     font-family: "Roboto", helvetica, arial, sans-serif;
     text-shadow: -1px -1px 1px rgba(0, 0, 0, 0.1);
     text-transform:uppercase;
  }


  /*** Table Styles **/

  .table-fill {
    background: white;
    border-radius:3px;
    border-collapse: collapse;
    height: 320px;
    margin: auto;
    max-width: 600px;
    padding:5px;
    width: 100%;
    box-shadow: 0 5px 10px rgba(0, 0, 0, 0.1);
    animation: float 5s infinite;
  }

  th {
    color:#D5DDE5;;
    background:#1b1e24;
    border-bottom:4px solid #9ea7af;
    border-right: 1px solid #343a45;
    font-size:23px;
    font-weight: 100;
    padding:24px;
    text-align:left;
    text-shadow: 0 1px 1px rgba(0, 0, 0, 0.1);
    vertical-align:middle;
  }

  th:first-child {
    border-top-left-radius:3px;
  }

  th:last-child {
    border-top-right-radius:3px;
    border-right:none;
  }

  tr {
    border-top: 1px solid #C1C3D1;
    border-bottom-: 1px solid #C1C3D1;
    color:#666B85;
    font-size:16px;
    font-weight:normal;
    text-shadow: 0 1px 1px rgba(256, 256, 256, 0.1);
  }

  tr:hover td {
    background:#4E5066;
    color:#FFFFFF;
    border-top: 1px solid #22262e;
  }

  tr:first-child {
    border-top:none;
  }

  tr:last-child {
    border-bottom:none;
  }

  tr:nth-child(odd) td {
    background:#EBEBEB;
  }

  tr:nth-child(odd):hover td {
    background:#4E5066;
  }

  tr:last-child td:first-child {
    border-bottom-left-radius:3px;
  }

  tr:last-child td:last-child {
    border-bottom-right-radius:3px;
  }

  td {
    background:#FFFFFF;
    padding:20px;
    text-align:left;
    vertical-align:middle;
    font-weight:300;
    font-size:18px;
    text-shadow: -1px -1px 1px rgba(0, 0, 0, 0.1);
    border-right: 1px solid #C1C3D1;
  }

  td:last-child {
    border-right: 0px;
  }

  th.text-left {
    text-align: left;
  }

  th.text-center {
    text-align: center;
  }

  th.text-right {
    text-align: right;
  }

  td.text-left {
    text-align: left;
  }

  td.text-center {
    text-align: center;
  }

  td.text-right {
    text-align: right;
  }


</style>
</head>
<body>
<c:set var="context" value="${pageContext.request.contextPath}"></c:set>
<table id="allRequest"  border="2" width="70%" cellpadding="2">
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
<td class="text-left"><a href="${context}/viewRequest/${course.id}">${course.id}</a></td>
<td class="text-left">${course.subject}</td>
<td class="text-left">${course.location}</td>
<td class="text-left">${course.timing}</td>
</tr>



</c:forEach>

</tbody>

</table>
<br>
<br>
<br>
<a href="${context}/adminHome">Go back to Admin Home Page</a>
</body>
</html>