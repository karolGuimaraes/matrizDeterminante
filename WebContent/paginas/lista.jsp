<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="objeto.Matriz"%>
<%@page import="model.MatrizDB"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Iterator"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<nav>
		<ul>
			<li><a href="../index.jsp">Home</a></li>
			<li><a href="lista.jsp">Lista</a></li>
		</ul>
	</nav>
	<h2>Lista de Determinantes</h2>  
                    
 <%ArrayList<Matriz> m = (ArrayList<Matriz>)MatrizDB.listaMatriz();
    Iterator lit = m.iterator();
    while(lit.hasNext()){
     Matriz mm = (Matriz)lit.next();
                       %>
	M1: <%=mm.getM1()%>
<br>M2: <%=mm.getM2()%>
<br>M3:<%=mm.getM3()%>
<br>M4: <%=mm.getM4()%>
<br>Determinante: <%=mm.getDeterminante()%>
<br><br>
<%} %>
</body>
</html>