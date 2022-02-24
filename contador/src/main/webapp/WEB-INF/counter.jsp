<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Incrementa en 1</h1>
	<h2> You  have visited <a href="/your_server">http://your_server</a> <c:out value = "${contadorDeVisitas}"></c:out> Times </h2>
	<h2> <a href="/your_server">Test another visit?</a></h2>
	
	
	<h1>Incrementa en 2 </h1>
	<h2> You  have visited <a href="/your_server_dos">http://your_server</a> <c:out value = "${contadorDeVisitas2}"></c:out> Times </h2>
	<h2> <a href="/your_server_dos">Test another visit?</a></h2>
	

</body>
</html>