<%-- 
    Document   : mostrar
    Created on : 31/08/2019, 15:55:41
    Author     : Dieinimy
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mostrar.jsp</title>
    </head>
    <body>
        <h1>Ação efetuada com sucesso</h1>
        Dados:<br/>
    <c:forEach items="${dados}" var="x">
        ${x}<br/>
    </c:forEach>
    </body>
</html>
