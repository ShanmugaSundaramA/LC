<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bill Page</title>
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

		<form:form action="/LC/process-Bill" modelAttribute="billDTO">
			<table>
				<tr>
					<td><label for="amount">Amount : </label></td>
					<td><form:input id="amount" path="amount" /></td>
					<td><form:errors id="error" path="amount"></form:errors></td>
				</tr>
				<tr>
					<td><label for="currency">Currency :</label></td>
					<td><form:input id="currency" path="currency" /></td>
					<td><form:errors id="error" path="currency"></form:errors></td>
				</tr>
				<tr>
					<td><label for="date">Date : </label></td>
					<td><form:input id="date" path="date" /></td>
					<td><form:errors id="error" path="date"></form:errors></td>
				</tr>
				<tr>
					<td><label for="creditCard">CreditCard : </label></td>
					<td><form:input id="creditCard" path="creditCard" /></td>
					<td><form:errors id="error" path="creditCard"></form:errors></td>
				</tr>
			</table>
			<input type="submit" value="submit">
		</form:form>

	</div>

</body>
</html>