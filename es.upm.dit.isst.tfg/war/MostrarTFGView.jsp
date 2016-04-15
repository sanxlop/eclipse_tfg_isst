<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ISST Talleres</title>
<link rel = "stylesheet" type = "text/css" href = "css/main.css"/>
</head>
<body>


<p>Sistema de gestión de TFGs</p>
	<c:if test = "${user != null}">
		<c:out value = "${user}" />
	</c:if>

<p> Puedes pulsar el siguiente enlace para salir
<a href = " <c:url value = "${url}"/> " ><c:out value = "${urlLinktext}" /></a></p>

<c:forEach items="${tfgs}" var="tfg">
	<tr>
		<tr> <c:out value = "${tfg.autor}"/> </tr>
		<tr> <c:out value = "${tfg.titulo}"/> </tr>
		<tr> <c:out value = "${tfg.resumen}"/> </tr>
		<tr> <c:out value = "${tfg.tutor}"/> </tr>
	</tr>
</c:forEach>


</body>
</html>