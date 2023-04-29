package br.com.projetojsp.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.projetojsp.dao.ProdutoDao;
import br.com.projetojsp.model.Produto;

@WebServlet("/produtos-request")
public class ProdutosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ProdutoDao dao = new ProdutoDao();
		
		List<Produto> produtos = dao.listarProdutos();
		
		request.setAttribute("produtos", produtos);
		
		RequestDispatcher rd = request.getRequestDispatcher("produtos.jsp");
		
		rd.forward(request, response);
	}
}
