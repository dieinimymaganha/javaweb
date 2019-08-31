<%-- 
    Document   : forward
    Created on : 31/08/2019, 10:59:10
    Author     : Dieinimy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head><title>Forward</title></head>
        <body>
            <h2>Foi REDIRECIONADO</h2>
                <%
                    for (int i=9; i>=0; i--) {
                        out.println(i + " - ");
                    }
                %>
        </body>
</html>
