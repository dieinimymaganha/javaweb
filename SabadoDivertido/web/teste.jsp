<%-- 
    Document   : teste
    Created on : 24/08/2019, 11:03:35
    Author     : Dieinimy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <h1><% out.println("<strong>Java é muito melhor que chocolate"); %></h1>
         <h2><% for (int i=0; i<10; i++){
             out.println("Valor = "+ i);
         }%></h2>
    </body>
</html>
