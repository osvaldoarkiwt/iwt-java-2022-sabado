package br.com.projetojsp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/recurso")
public class ProjetoServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		
		Long id = Long.parseLong(request.getParameter("id"));
		String nome = request.getParameter("nome");
		Integer quantidade  = Integer.parseInt(request.getParameter("quantidade"));
		Double preco = Double.parseDouble(request.getParameter("preco"));
		PrintWriter out = response.getWriter();
		
		out.write("<html>");
		out.write("<body>");
		out.write("<h3>Implementando um servlet "+id+" "+nome+" "+quantidade+" "+preco+"</h3>");
		out.write("</body>");
		out.write("</html>");
	}
}
