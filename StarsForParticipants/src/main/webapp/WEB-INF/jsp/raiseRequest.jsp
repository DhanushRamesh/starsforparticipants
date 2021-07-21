<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head></head>

<body>
<c:set var="context" value="${pageContext.request.contextPath}"></c:set>
<form:form action="${context}/createRequest" modelAttribute="requestModal">

               <form:label path = "subject">Subject</form:label>
              <form:select path ="subject">
              	<form:options items="${subjectList}"/>
              </form:select>
              
              <form:label path = "location">Location</form:label>
			<form:select path="location">
	     		<option value="Select" label="Select The City" ></option>
	     		<form:options items="${locationList}"/>
			</form:select>
	     		
	     		 <form:label path = "timing">Timing</form:label>
                FN<form:radiobutton path="timing" value="fn"  />  
        			AN<form:radiobutton path="timing" value="an"/> 
        			
        			
	     		 <form:label path = "weekend">Weekend Classes</form:label>
                Yes<form:radiobutton path="weekend" value="yes"  />  
        			No<form:radiobutton path="weekend" value="no"/> 
        			
        			 <form:label path = "modeOfLearning">Mode of Learning</form:label>
                Online<form:radiobutton path="modeOfLearning" value="online"  />  
        			Offline<form:radiobutton path="modeOfLearning" value="offline"/> 
        			 <input type = "submit" value = "Send request" />
</form:form>
</body>
</html>
