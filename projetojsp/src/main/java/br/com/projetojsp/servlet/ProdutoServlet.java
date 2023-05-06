package br.com.projetojsp.servlet;

import java.io.IOException;
import java.util.Optional;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.projetojsp.dao.ProdutoDao;
import br.com.projetojsp.model.Produto;

@WebServlet("/produto-serv")
public class ProdutoServlet extends HttpServlet{

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		Long id = Long.parseLong(request.getParameter("id"));
		
		ProdutoDao dao = new ProdutoDao();
		
		Produto produto = dao.buscarProdutosPorId(id);
		
		String resultado = produto == null ? "/notfound.jsp" : "/editar.jsp";
		
		RequestDispatcher rd = request.getRequestDispatcher(resultado);
		
		request.setAttribute("produto", produto);
		
		rd.forward(request, response);
	}
}
