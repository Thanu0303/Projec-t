<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact</title>
</head>
<body>
	<h1>Save your favourite Contact</h1>
	<form action="saveContact.do" method="post">
		<pre>
NAME : <input type="text" name="name">
EMAIL : <input type="text" name="email">
DESCRIPTION : <input type="text" name="description">
PHONE NO : <input type="text" name="phoneNo">
ADDRESS : <input type="text" name="address">
<input type="submit" value="Save">

</pre>
	</form>
</body>
</html>