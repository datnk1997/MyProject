<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Edit User</h1>
	<form action="edit">
	<input type="hidden" name="idu" value="${user.getId()}"/>
	<p>Name</P> <input type="text" name="nameu" value="${user.getName()}"/>
	<p>Address</p> <input type="text" name="addressu" value="${user.getAddress()}"><br><br>
	<button>Submit</button>
	</form>
	
</body>
</html>