<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<nav>
		<ul>
			<li><a href="index.jsp">Home</a></li>
			<li><a href="paginas/lista.jsp">Lista</a></li>
		</ul>
	</nav>
	<form action="MatrizServLet" method="post">
		M1: <input type="text" name="m1">
		M2: <input type="text" name="m2">
		M3: <input type="text" name="m3">
		M4: <input type="text" name="m4">
		<input type="submit" value="Enviar">
	</form>

</body>
</html>