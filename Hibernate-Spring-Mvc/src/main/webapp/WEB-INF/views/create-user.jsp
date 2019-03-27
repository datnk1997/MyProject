<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<div align="left">
	<h1>Create User</h1>
	<form:form modelAttribute="userdto"  action="create">
	<p>Name</P> <form:input path="name"/>
	<p style="color: red;"><form:errors path="name"></form:errors></p>
	<p>Address</p> <form:input path="Address"/>
	<p style="color: red;"><form:errors path="Address"></form:errors></p>
	<br>
	<button>Create</button>
	</form:form>
	</div>
</body>
</html>