<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Email Page</title>
</head>
<body>
	<h1>Hi  ${userInfoDTO.userName }</h1>

	<h2>Send Result to your Email</h2>
	
	<div >
		<form:form action="/LC/Process-EmailPage" modelAttribute="emailDTO">
			<table>
				<tr>
					<td><label for="email">Enter the Email : </label></td>
					<td><form:input id="email" path="email" /></td>
					<td><form:errors id="email" path="email" /></td>
				</tr>
			</table>
			<input type="submit" value="Sumbit">
		</form:form>
	</div>


</body>
</html>