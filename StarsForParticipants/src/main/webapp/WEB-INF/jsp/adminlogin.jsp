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
<script>

$(document).ready(function(){
	$("#chkYes").click(function(){
		$(".skill-chk").attr("disabled",false);
	});
	
	$("#chkNo").click(function(){
		$(".skill-chk").attr("disabled",true);
	})
})
</script>
<title>Insert title here</title>
<style>
    @import url('https://fonts.googleapis.com/css?family=Montserrat:400,700&display=swap');

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
      width: 200px;
      color: #757575;
      margin-right: 10px;
      font-size: 14px;
    }

    .wrapper .form .inputfield .input,
    .wrapper .form .inputfield .textarea {
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
    }

    .wrapper .form .inputfield .input:focus,
    .wrapper .form .inputfield .textarea:focus,
    .wrapper .form .inputfield select:focus {
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

    .wrapper .form .inputfield .check input[type="checkbox"]:checked~.checkmark {
      background: #185ADB;

    }

    .wrapper .form .inputfield .check input[type="checkbox"]:checked~.checkmark:before {
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

    #gender {
      width: 100%;
    }

    #date {
      width: 100%;
    }

    #state {
      width: 100%;
    }

    #skill1,
    #skill2,
    #skill3,
    #skill4,
    #skill5 {
      width: 100%;
    }

    #availability1,
    #availability2 {
      width: 20px;
      text-align: left;
    }

    #availability {
      width: 125px;
    }



    @media (max-width:420px) {
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
<jsp:useBean id="now" class="java.util.Date" />
<h1>${registerSuccess}</h1>

 <form:form method = "POST" action = "${context}/addUser">
 <div class="wrapper">
      <div class="title">
        Registration Form
      </div>
      <span>Are You a Trainer?</span>
                 <div class="inputfield">
                  Yes <form:radiobutton path="isTrainee" value="No"  />  
        			No <form:radiobutton path="isTrainee" value="Yes"/> 
        		</div>
      <br>
      <br>
      <br>
      <div class="form">
      
    <div class="inputfield">
            
               <form:label path = "firstName">First Name</form:label>
              <form:input path = "firstName" class="input" type="text" minlength="4" maxlength="20" />
    </div>
            
            
          
          <div class="inputfield">
            <form:label path = "lastName">Last Name</form:label>
               <form:input path = "lastName" class="input" minlength="2" maxlength="20" />
          </div>
          
            <div class="inputfield">
               <form:label path = "gender">Gender</form:label>
                Male <form:radiobutton path="gender" value="Male"  />  
        			Female <form:radiobutton path="gender" value="Female"/> 
        		</div>
            
            
            <div class="inputfield">
            
            <form:label path = "phone">Phone</form:label>
            
            	<form:input path = "phone" class="input" pattern="[1-9]{1}[0-9]{9}" />
            
             </div>
            <div class="inputfield">
            <form:label path = "location">Location</form:label>
            
            
			<form:select path="location">
	     		<option value="Select" label="Select The City" ></option>
	     		<form:options items="${locations}"/>
			</form:select>
			</div>
			<div class="inputfield">
            	<form:label path = "dob">Date of Birth</form:label>
            	
            	
            	<form:input path="dob" type="date"  name="date" pattern="yyyy-MM-dd"/> 
                </div>
            	
            
            <div class="inputfield">
            
            <form:label path = "userid">User Id</form:label>
            
            	<form:input path = "userid" class="input"/>
            </div>
             <div class="inputfield">
            
            <form:label path = "password" >Password</form:label>
            
            	<form:input path = "password"  type="password" class="input"/>
            </div>
            
             <div class="inputfield">
             <form:checkbox class="skill-chk" path="skillsets" value = "Java"/>
             	<form:label path="skillsets">Java</form:label>
             	<form:checkbox class="skill-chk" path="skillsets" value = "C"/>
             	<form:label path="skillsets">C</form:label>
	          	<form:checkbox class="skill-chk" path="skillsets" value = "C++"/>
             	<form:label path="skillsets">C++</form:label>
             	<form:checkbox  class="skill-chk" path="skillsets" value = "Python"/>
             	<form:label path="skillsets">Python</form:label>
             	<form:checkbox class="skill-chk"  path="skillsets" value = "HTML"/>
             	 <form:label path="skillsets">HTML</form:label>
             </div>
             
            <div class="inputfield">
            <form:label path = "availability">Availability</form:label>
            
                FN <form:radiobutton path="availability" value="fn"  />  
        			AN <form:radiobutton path="availability" value="an"/>
            
            
            </div>
            <div class="inputfield">
              
                  <input type = "submit" value = "Register" class="btn" />
               </div>
         </div>
         </div>
  </form:form>
  


</body>
</html>