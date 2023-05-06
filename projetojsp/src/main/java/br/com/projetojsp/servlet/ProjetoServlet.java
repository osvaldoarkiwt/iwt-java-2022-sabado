package br.com.projetojsp.servlet;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.projetojsp.dao.ProdutoDao;
import br.com.projetojsp.model.Produto;

@WebServlet(urlPatterns = "/recurso")
public class ProjetoServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		
		ProdutoDao dao = new ProdutoDao();

		//Long id = Long.parseLong(request.getParameter("id"));
		String nome = request.getParameter("nome");
		Integer quantidade  = Integer.parseInt(request.getParameter("quantidade"));
		Double preco = Double.parseDouble(request.getParameter("preco"));
		
		Produto produto = new Produto(nome,preco,quantidade);
		
		dao.adicionarProduto(produto);
		
		response.sendRedirect("produtos-request");
	}
}
