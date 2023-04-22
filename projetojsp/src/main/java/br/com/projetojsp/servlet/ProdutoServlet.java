package br.com.projetojsp.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.projetojsp.model.Produto;

@WebServlet("/produto-dispatcher")
public class ProdutoServlet extends HttpServlet{

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		Produto produto = new Produto();
		
		produto.setId(5L);
		produto.setNome("kiwi");
		produto.setPreco(15.00);
		produto.setQuantidade(16);
		
		RequestDispatcher rd = request.getRequestDispatcher("/produto.jsp");
		
		request.setAttribute("produto", produto);
		
		rd.forward(request, response);
	}
}
