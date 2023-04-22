package br.com.projetojsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/recurso")
public class ProjetoServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		String nome = request.getParameter("nome");
		
		PrintWriter out = response.getWriter();
		
		out.write("<html>");
		out.write("<body>");
		out.write("<h3>Implementando um servlet "+nome+"</h3>");
		out.write("</body>");
		out.write("</html>");
	}
}
