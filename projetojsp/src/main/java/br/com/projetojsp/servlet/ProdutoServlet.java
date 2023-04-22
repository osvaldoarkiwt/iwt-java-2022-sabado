package br.com.projetojsp.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.projetojsp.model.Produto;

@WebServlet("/produto-dispatcher")
public class ProdutoServlet extends HttpServlet{

	
	protected void service(HttpServletRequest request, HttpServletResponse response) {
	
		Produto produto = new Produto();
		
		
		
	}
}
