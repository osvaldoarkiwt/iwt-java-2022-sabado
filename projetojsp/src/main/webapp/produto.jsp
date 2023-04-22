<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<%@ page import="br.com.projetojsp.model.Produto" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Produto</title>
</head>
<body>
		<%
			Produto produto = (Produto) request.getAttribute("produto");
		%>
		
	<h1>		
		<%=produto.getNome() %>
	</h1>
</body>
</html>