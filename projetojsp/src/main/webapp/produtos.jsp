<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="java.util.List" import="br.com.projetojsp.model.Produto" %>       
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Produtos</title>
</head>
<body>

		<%
			List<Produto> produtos = (List<Produto>) request.getAttribute("produtos");
		%>
		
		    <table border="1">
		        <thead>
		            <tr>
		                <th>id</th>
		                <th>nome</th>
		                <th>preço</th>
		                <th>quantidade</th>
		                <th colspan=2>ações</th>
		            </tr>
		        </thead>
		        <tbody>
		        	<% for(Produto produto : produtos){ %>
			        	<tr>		        	
				        	<td><%=produto.getId() %></td>
				        	<td><%=produto.getNome() %></td>
				        	<td><%=produto.getPreco() %></td>
				        	<td><%=produto.getQuantidade() %></td> 
				        	<td><a href="produto-serv?id=<%=produto.getId() %>">editar</a></td>
				        	<td><a href="deletar?id=<%=produto.getId() %>">apagar</a></td>
			        	</tr>
			        <% }%>
		        </tbody>
		        <tfoot>
		            <tr>
		                <td colspan="6">isso é um footer</td>
		            </tr>
		        </tfoot>
    		</table>

</body>
</html>