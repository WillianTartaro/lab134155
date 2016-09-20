package serv;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entidades.Venda;
import rest.ProcessVenda;

@WebServlet(value = "/venda")
public class VendaServ extends HttpServlet {

	
	@EJB
	 	ProcessVenda processVenda; // Faz a injeção na variável.
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Processo de venda foi iniciado...");
		 
		 		// Lista com itens comprados.
		 		List<String> itensVenda = new ArrayList<>();
		 		itensVenda.add("Arroz");
		 		itensVenda.add("Feijão");
		 		itensVenda.add("Carne");
		 

		 		Venda venda = new Venda(1, itensVenda, new BigDecimal(250.50));
		 
		 		System.out.println("Gerando processo de venda...");
		 
		 		// Envia o objeto
		 		processVenda.processarVenda(venda);
		 
		 		resp.setContentType("text/html");
		 		PrintWriter out = resp.getWriter();
		 		out.write("Processo de venda foi encaminhado.");
		 	}
	
}
