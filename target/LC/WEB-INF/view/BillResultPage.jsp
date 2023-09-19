<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bill Result Page</title>
</head>
<body>
${billDTO.creditCard }<br>
${billDTO.amount }<br>
${billDTO.currency.getSymbol() }<br>
${billDTO.date }<br>
</body>
</html>