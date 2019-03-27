<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello !  
</h1>
<form action="upload" enctype='multipart/form-data' method="get">
<input type="file" name="path" >
<button>Submit</button>
${mess }
</form>
</body>
</html>
