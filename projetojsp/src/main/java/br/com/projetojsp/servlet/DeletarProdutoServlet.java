package br.com.projetojsp.servlet;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.projetojsp.dao.ProdutoDao;

@WebServlet("/deletar")
public class DeletarProdutoServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		Long id = Long.parseLong(request.getParameter("id"));
		
		ProdutoDao dao = new ProdutoDao();
		
		dao.deletarProduto(id);
		
		response.sendRedirect("produtos-request");
	}
}
