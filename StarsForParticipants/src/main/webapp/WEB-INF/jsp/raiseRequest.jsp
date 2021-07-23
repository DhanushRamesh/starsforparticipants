<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<style>
@import
	url('https://fonts.googleapis.com/css?family=Montserrat:400,700&display=swap')
	;

* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
	font-family: 'Montserrat', sans-serif;
}

body {
	background: #f0cd059a;
	padding: 0 10px;
}

.wrapper {
	max-width: 500px;
	width: 100%;
	background: #fff;
	margin: 50px auto;
	box-shadow: 2px 2px 4px rgba(0, 0, 0, 0.125);
	padding: 30px;
}

.wrapper .title {
	font-size: 24px;
	font-weight: 700;
	margin-bottom: 25px;
	color: #020608;
	text-transform: uppercase;
	text-align: center;
}

.wrapper .form {
	width: 100%;
}

.wrapper .form .inputfield {
	margin-bottom: 15px;
	display: flex;
	align-items: center;
}

.wrapper .form .inputfield label {
	width: 100px;
	color: #757575;
	margin-right: 10px;
	font-size: 14px;
}

.wrapper .form .inputfield .input, .wrapper .form .inputfield .textarea
	{
	width: 100%;
	outline: none;
	border: 1px solid #d5dbd9;
	font-size: 15px;
	padding: 8px 10px;
	border-radius: 3px;
	transition: all 0.3s ease;
}

.wrapper .form .inputfield .textarea {
	width: 100%;
	height: 125px;
	resize: none;
	ali
}

.wrapper .form .inputfield .input:focus, .wrapper .form .inputfield .textarea:focus,
	.wrapper .form .inputfield  select:focus {
	border: 1px solid #dbbe18;
}

.wrapper .form .inputfield p {
	font-size: 14px;
	color: #757575;
}

.wrapper .form .inputfield .check {
	width: 15px;
	height: 15px;
	position: relative;
	display: block;
	cursor: pointer;
}

.wrapper .form .inputfield .check input[type="checkbox"] {
	position: absolute;
	top: 0;
	left: 0;
	opacity: 0;
}

.wrapper .form .inputfield .check .checkmark {
	width: 15px;
	height: 15px;
	border: 1px solid #185ADB;
	display: block;
	position: relative;
}

.wrapper .form .inputfield .check .checkmark:before {
	content: "";
	position: absolute;
	top: 1px;
	left: 2px;
	width: 5px;
	height: 2px;
	border: 2px solid;
	border-color: transparent transparent #fff #fff;
	transform: rotate(-45deg);
	display: none;
}

.wrapper .form .inputfield .check input[type="checkbox"]:checked ~.checkmark
	{
	background: #185ADB;
}

.wrapper .form .inputfield .check input[type="checkbox"]:checked ~.checkmark:before
	{
	display: block;
}

.wrapper .form .inputfield .btn {
	width: 100%;
	padding: 8px 10px;
	font-size: 15px;
	border: 0px;
	background: #185ADB;
	color: #fff;
	cursor: pointer;
	border-radius: 3px;
	outline: none;
}

.wrapper .form .inputfield .btn:hover {
	background: #39A2DB;
}

.wrapper .form .inputfield:last-child {
	margin-bottom: 0;
}

@media ( max-width :420px) {
	.wrapper .form .inputfield {
		flex-direction: column;
		align-items: flex-start;
	}
	.wrapper .form .inputfield label {
		margin-bottom: 5px;
	}
	.wrapper .form .inputfield.terms {
		flex-direction: row;
	}
}
</style>
</head>

<body>
	<c:set var="context" value="${pageContext.request.contextPath}"></c:set>


	<form:form action="${context}/createRequest"
		modelAttribute="requestModal">
		<div class="wrapper">
			<div class="title">Raise Request</div>
			<div class="form">
				<div class="inputfield">
					<form:label path="subject">Subject</form:label>
					<form:select path="subject" >
					<option value="" label="Select The Subject"></option>
					
						<form:options items="${subjectList}" />
					</form:select>
				</div>
				<div class="inputfield">
					<form:label path="location">Location</form:label>
					<form:select path="location">
						<option value="Select" label="Select The City"></option>
						<form:options items="${locationList}" />
					</form:select>
				</div>
				<div class="inputfield">
					<form:label path="timing">Timing</form:label>
					FN
					<form:radiobutton path="timing" value="fn" />
					AN
					<form:radiobutton path="timing" value="an" />
				</div>
				<div class="inputfield">

					<form:label path="weekend">Weekend Classes</form:label>
					Yes
					<form:radiobutton path="weekend" value="yes" />
					No
					<form:radiobutton path="weekend" value="no" />
				</div>
				<div class="inputfield">

					<form:label path="modeOfLearning">Mode of Learning</form:label>
					Online
					<form:radiobutton path="modeOfLearning" value="online" />
					Offline
					<form:radiobutton path="modeOfLearning" value="offline" />
				</div>
				<div class="inputfield">
					<input type="submit" value="Send request" class="btn" />
				</div>
			</div>
		</div>

	</form:form>
<a href="${context}/traineeHome">Go back to Trainee Home Page</a>

</body>
</html>
