<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Love Calculator</title>
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
		<form:form action="/LC/Process-HomePage" modelAttribute="userInfoDTO">
			<table>
                 <tr>
                 	<td><label for="userName">User Name : </label></td>
                 	<td><form:input id="userName" path="userName" /></td>
                 	<td><form:errors  id="error"  path="userName" /></td>
                 </tr>
                 <tr>
                    <td><label for="crushName">Crush Name : </label></td>
                 	<td><form:input id="crushName" path="crushName" /></td>
                 	<td><form:errors  id="error"  path="crushName" /></td>
                 </tr>
                <tr>
                    <td><label for="termsAndCondition">Terms And Conditions : </label></td>
                 	<td><form:checkbox id="termsAndCondition" path="termsAndCondition" /></td>
                 	<td><form:errors  id="error"  path="termsAndCondition" /></td>
                 </tr>
			</table>
			     <input type="submit" value="Sumbit">
		</form:form>
	</div>

</body>
</html>