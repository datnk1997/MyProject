<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<h1>Danh Sách Sinh Viên</h1>
<form action="search">
	<input type="text" name="id"/>
	<button>Search</button>
</form>
<form action="user">
	<table border="1">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Địa Chỉ</th>
			<th>Chọn</th>
		</tr>
		
			<tr>
				<td>${user.getId()}</td>
				<td>${user.getName()}</td>
				<td>${user.getAddress()}</td>
				<td>
					<button>
						<a href="<c:url value='/delete-user/${user.getId()}'/>">Delete</a>
					</button>
					<button>
						<a href="<c:url value='/edit-user/${user.getId()}'/>">Edit</a>
					</button>
				</td>
			</tr>

		

	</table>
	<br>
</form>
