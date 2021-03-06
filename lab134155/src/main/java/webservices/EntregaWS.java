package webservices;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entidades.Entrega;
import rest.ProcessEntrega;

@WebService
public class EntregaWS {

	@EJB
	private ProcessEntrega processEntrega;
	
	@WebMethod(operationName = "opEntrega")
	@WebResult(name = "resultEntrega")
	public Entrega doGet() throws ServletException, IOException {
		System.out.println("Processo de entrega foi iniciado...");
		 
		 		Entrega entrega = new Entrega(1, "Rua EOQ");
		 
		 		System.out.println("Gerando remessa de entrega...");
		 
		 		processEntrega.processarEntrega(entrega);
		 
		 		
		 		return entrega;
		  	
	}
	
}
