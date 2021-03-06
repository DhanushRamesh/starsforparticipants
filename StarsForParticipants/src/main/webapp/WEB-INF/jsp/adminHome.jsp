<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
  body{
margin: 0px;
padding: 0px;
background: #86beece7;
font-family: 'Lato', sans-serif;
background: url("/Users/nivetha/Downloads/Bg.jpg");
}
h2{
   text-align: center;
}

nav{
float: none;
clear: both;
width: 30%;
margin: 10% auto;
background: #eee;
}

nav ul {
list-style: none;
margin: 0px;
padding: 0px;
}

nav li{
float: none;
width: 100%;
}

nav li a{
display: block;
width: 100%;
padding: 20px;
border-left: 5px solid;
position: relative;
z-index: 2;
text-decoration: none;
color: #444;
box-sizing: border-box;
-moz-box-sizing: border-box;
-webkit-box-sizing: border-box;
}

nav li a:hover{ border-bottom: 0px; color: #fff;}
nav li:first-child a{ border-left: 10px solid #3498db; }
nav li:nth-child(2) a{ border-left: 10px solid #ffd071; }
nav li:nth-child(3) a{ border-left: 10px solid #f0776c; }
nav li:nth-child(4) a{ border-left: 10px solid #f07df0; }
nav li:last-child a{ border-left: 10px solid #1abc9c; }

nav li a:after {
content: "";
height: 100%;
left: 0;
top: 0;
width: 0px;
position: absolute;
transition: all 0.3s ease 0s;
-webkit-transition: all 0.3s ease 0s;
z-index: -1;
}

nav li a:hover:after{ width: 100%; }
nav li:first-child a:after{ background: #3498db; }
nav li:nth-child(2) a:after{ background: #ffd071; }
nav li:nth-child(3) a:after{ background: #f0776c; }
nav li:nth-child(4) a:after{ background: #f07df0; }
nav li:last-child a:after{ background: #1abc9c; }



@font-face {
font-family: 'Lato';
font-style: normal;
font-weight: 100;
src: local('Lato Hairline'), local('Lato-Hairline'), url(http://themes.googleusercontent.com/static/fonts/lato/v6/boeCNmOCCh-EWFLSfVffDg.woff) format('woff');
}
@font-face {
font-family: 'Lato';
font-style: normal;
font-weight: 300;
src: local('Lato Light'), local('Lato-Light'), url(http://themes.googleusercontent.com/static/fonts/lato/v6/KT3KS9Aol4WfR6Vas8kNcg.woff) format('woff');
}
@font-face {
font-family: 'Lato';
font-style: normal;
font-weight: 400;
src: local('Lato Regular'), local('Lato-Regular'), url(http://themes.googleusercontent.com/static/fonts/lato/v6/9k-RPmcnxYEPm8CNFsH2gg.woff) format('woff');
}
@font-face {
font-family: 'Lato';
font-style: normal;
font-weight: 700;
src: local('Lato Bold'), local('Lato-Bold'), url(http://themes.googleusercontent.com/static/fonts/lato/v6/wkfQbvfT_02e2IWO3yYueQ.woff) format('woff');
}
  </style>
</head>
<body style="background-image: url(https://images.unsplash.com/photo-1554415707-6e8cfc93fe23?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=750&q=80); background-repeat: no-repeat;  background-size: cover;">
<c:set var="context" value="${pageContext.request.contextPath}"></c:set>
<h2>Admin Home Page</h2>
<nav>
<ul>
      <li><a href="${context}/trainerDetails">Trainer Details</a></li>
      <li><a href="${context}/listRequests">List of Requests</a></li>
      <li><a href="/GenerateReport.html">Generate Report</a></li>
      <li><a href="${context}/showNominatedUsers">Nominated Trainers</a></li>
      <li><a href="${context}/logout">Log out</a></li>
   </ul>
</nav>
</body>
</html>