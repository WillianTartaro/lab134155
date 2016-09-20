package serv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entidades.Entrega;
import rest.ProcessEntrega;

@WebServlet(value = "/entrega")
public class EntregaServ extends HttpServlet {

	@EJB
 	ProcessEntrega processEntrega; // Faz a injeção na variável.
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	 

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Processo de entrega foi iniciado...");
		 
		 		Entrega entrega = new Entrega(1, "Rua EOQ");
		 
		 		System.out.println("Gerando remessa de entrega...");
		 
		 		processEntrega.processarEntrega(entrega);
		 
		 		resp.setContentType("text/html");
				PrintWriter out = resp.getWriter();
		 		out.write("Processo de entrega foi despachado.");
		  	
	}
}
