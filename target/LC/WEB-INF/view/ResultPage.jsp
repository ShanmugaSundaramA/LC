<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result Page</title>
</head>
<body>

	<div align="center">
		<h1>Love Calculator</h1>
	</div>

    <h1>The Calculator Predicts</h1>

	<p>${ userInfoDTO.userName } and ${ userInfoDTO.crushName } are </p>
	
	<p>Friends</p>
	
	<a href="/LC/email">Send Result.</a>

</body>
</html>