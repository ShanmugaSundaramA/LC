<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Test Page</title>
</head>
<body>
	<h1>Test</h1>

	Website name : ${websiteInfoDTO.websiteName}
	<br> 
	Website Company : ${websiteInfoDTO.websiteCompany}
	<br>
	<br>
	<br>
	<form:form action="/LC/test1" modelAttribute="websiteInfoDTO">
		<table>
			<tr>
				<td><label for="websiteName">User Name : </label></td>
				<td><form:input id="websiteName" path="websiteName" /></td>
				<td><form:errors id="error" path="websiteName" /></td>
			</tr>
			<tr>
				<td><label for="websiteCompany">Crush Name : </label></td>
				<td><form:input id="websiteCompany" path="websiteCompany" /></td>
				<td><form:errors id="error" path="websiteCompany" /></td>
			</tr>
		</table>
		<input type="submit" value="Sumbit">

	</form:form>

</body>
</html>