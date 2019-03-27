<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

	<h1>Login</h1>
	<c:url value='/login' var="url"></c:url>
	<form action="${url }">
	<p>UserName</P> <input type="text" name="username" />
	<p>PassWord</p> <input type="password" name="password"><br><br>
	<button>Login</button>
	</form>
