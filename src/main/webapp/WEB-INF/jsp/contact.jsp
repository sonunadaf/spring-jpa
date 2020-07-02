<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:forEach items="${contactList}" var="contacts">
		<tr>
			<td>Employee ID: <c:out value="${contacts.id}" /></td>
			<td>Employee Pass: <c:out value="${contacts.name}" /></td>
		</tr>
	</c:forEach>
	<a href="/save">CreateContacts</a>
</body>
</html>