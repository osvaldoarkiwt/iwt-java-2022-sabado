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
		
		    <table border="1">
		        <thead>
		            <tr>
		                <th>id</th>
		                <th>nome</th>
		                <th>preço</th>
		                <th>quantidade</th>
		            </tr>
		        </thead>
		        <tbody>
		        	<td><%=produto.getId() %></td>
		        	<td><%=produto.getNome() %></td>
		        	<td><%=produto.getPreco() %></td>
		        	<td><%=produto.getQuantidade() %></td>
		        </tbody>
		        <tfoot>
		            <tr>
		                <td colspan="4">isso é um footer</td>
		            </tr>
		        </tfoot>
    		</table>
</body>
</html>