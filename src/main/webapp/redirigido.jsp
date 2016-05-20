<%--
  Created by IntelliJ IDEA.
  User: pepesan
  Date: 20/5/16
  Time: 11:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP Redirigido</title>
</head>
<body>
<% String variable=(String)request.getAttribute("variable");%>
<h5>Variable:<%=variable %></h5>
<a href="index.jsp">Página principal</a>
</body>
</html>
