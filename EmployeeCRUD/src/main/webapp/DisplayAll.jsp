<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>All Employees</title>
	</head>
	<body>
		<table border="1">
			<thead>
				<tr>
					<th>Employee Id</th>
					<th>Employee Name</th>
					<th>Employee Email</th>
					<th>Employee Phone</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="emp" items="${eList}">
					<tr>
						<td>${emp.id}</td>
						<td>${emp.name}</td>
						<td>${emp.email}</td>
						<td>${emp.phone}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</body>
</html>