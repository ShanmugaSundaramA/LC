<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<h1>Login Page</h1>
	
	${registrationDTO.user }<br>
	${registrationDTO.userName }<br>
	${registrationDTO.age }<br>
	${registrationDTO.country }<br>
   
   <c:forEach var="hobby" items="${registrationDTO.hobbies}" >
      ${hobby} , 
   </c:forEach>
   <br>
   
	${registrationDTO.gender }<br>
	${registrationDTO.communicationDTO.email }<br>
	${registrationDTO.communicationDTO.phone }
	
</body>
</html>
