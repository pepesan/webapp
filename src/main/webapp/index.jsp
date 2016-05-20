<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Home</h1>
<a href="pepe">Enlace al primer servlet</a><br/>
<a href="ruta?param1=valor&param2=valor2">Enlace otro servlet</a>
<a href="redir">Servlet Redirector</a>
<a href="modules">módulo principal</a>
<a href="modules?modulo=Home">módulo Home</a>
<a href="modules?modulo=Contact">módulo Contact</a>
<a href="modules?modulo=Producto">módulo Producto</a>
<form name="formulario" id="formulario" action="form" method="post">
    <label for="usuario">Usuario</label>
    <input id="usuario" type="text" name="usuario" value="" /><br/>
    <label for="pass">Contraseña</label>
    <input id="pass" type="password" name="pass" value="" /><br/>
    <input name="submit" type="submit" value="Enviar"/>
</form>
</body>
</html>