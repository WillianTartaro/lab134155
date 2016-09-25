package webservices;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entidades.Venda;
import rest.ProcessVenda;

@WebService
public class VendaWS {
	
	@EJB
	private ProcessVenda processVenda;
	
	@WebMethod(operationName = "opVenda")
	@WebResult(name = "resultVenda")
	protected void doGet(@WebParam(name = "requisicao") HttpServletRequest req, @WebParam(name = "resposta") HttpServletResponse resp) throws ServletException, IOException {
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
