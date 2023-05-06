<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<%@ page import="br.com.projetojsp.model.Produto" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Editar produto</title>
</head>
<body>
		<% Produto produto = (Produto) request.getAttribute("produto"); %>
	<form action="editarServlet" method="post">
	
		<label>
			id:
			<input type="text" name="id" value='<%=produto.getId() %>' readonly/>
		</label>
		<br/>
		<label>
			nome:
			<input type="text" name="nome" value='<%=produto.getNome() %>'/>
		</label>
		<br/>
		<label>
			quantidade:
			<input type="number" name="quantidade" value='<%=produto.getQuantidade() %>'/>
		</label>
		<br/>
		<label>
			preço:
			<input type="number" name="preco" value='<%=produto.getPreco() %>'/>
		</label>
		<br/>
		<input type="submit" value="enviar">
	</form>
</body>
</html>