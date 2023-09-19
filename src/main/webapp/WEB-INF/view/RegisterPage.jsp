<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Page</title>
<style type="text/css">
#error{
    color: red;
    position : absolute;
    text-align: left;
    margin-left: 10px;
}
</style>
</head>
<body>

    <div align="center">
		<h1>Love Calculator</h1>
	</div>
     
	<div align="center">
		<form:form action="/LC/Process-RegisterPage" modelAttribute="registrationDTO">

			<table>
				<tr>
				   <td><label for="user">User</label></td>
				   <td><form:input id="user" path="user"/></td>
				   <td><form:errors id="error" path="user"/></td>
				</tr>
				<tr>
				   <td><label for="userName">User Name</label></td>
				   <td><form:input path="userName"/></td>
				   <td><form:errors id="error" path="userName"/></td>
				</tr>
				<tr>
				   <td><label for="password">Password</label></td>
				   <td><form:input path="Password"/></td>
				</tr>
				<tr>
				   <td><label for="age">Age</label></td>
				   <td><form:input path="age"/></td>
				   <td><form:errors id="error" path="age"/></td>
				</tr>
				<tr>
				   <td><label for="country">Country</label></td>
				   <td>
				      <form:select path="country">
				          <form:option value="India">India</form:option>
				          <form:option value="USA">USA</form:option>
				          <form:option value="Italy">Italy</form:option>
				          <form:option value="France">France</form:option>
				      </form:select>
				   </td>
				</tr>
				<tr>
				   <td><label for="hobbies">Hobbies</label></td>
				   <td>
				   		Cricket      <form:checkbox path="hobbies" value="Cricket"/>
				   		BodyBuilding <form:checkbox path="hobbies" value="BodyBuilding"/>
				   		Drawing      <form:checkbox path="hobbies" value="Drawing"/>
				   </td>
				</tr>
				<tr>
				   <td><label for="gender">Gender</label></td>
				   <td>
				       Male   <form:radiobutton path="gender" value="Male"/>
				       female <form:radiobutton path="gender" value="female"/>
				   </td>
				</tr>
				<tr>
				   <td><label for="email">Email</label></td>
				   <td><form:input path="communicationDTO.email" name="email"/></td>
				   <td><form:errors id="error" path="communicationDTO.email"/></td>
				   
				</tr>
				<tr>
				   <td><label for="phone">Phone</label></td>
				   <td><form:input path="communicationDTO.phone" name="phone"/></td>
				</tr>
			</table>
            <input type="submit" value="Submit">
		</form:form>
	</div>
</body>
</html>