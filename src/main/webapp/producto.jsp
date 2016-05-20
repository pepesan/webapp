<%@ page import="com.cursosdedesarrollo.app.domain.Producto" %><%--
  Created by IntelliJ IDEA.
  User: pepesan
  Date: 20/5/16
  Time: 11:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ficha de Producto</title>
</head>
<body>
<% Producto p=(Producto)request.getAttribute("producto");

%>
<p>Id:<%=p.getId() %></p>
<p>Nombre:<%=p.getName() %></p>
<a href="index.jsp">Página principal</a>
</body>
</html>
