package serv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.jms.Destination;
import javax.jms.JMSContext;
import javax.jms.JMSDestinationDefinition;
import javax.jms.JMSDestinationDefinitions;
import javax.jms.ObjectMessage;
import javax.jms.Queue;
import javax.jms.Topic;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entidades.Venda;

@JMSDestinationDefinitions(
 	    value = {
 	        @JMSDestinationDefinition(
 	            name = "java:/queue/QueuePedido",
 	            interfaceName = "javax.jms.Queue",
 	            destinationName = "QueuePedido"
 	        ),
 	        @JMSDestinationDefinition(
 	            name = "java:/topic/TopicVenda",
 	            interfaceName = "javax.jms.Topic",
 	            destinationName = "TopicVenda"
  	        )
  	    })

@WebServlet(value = "/config")
public class Config extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Inject
	private JMSContext context;

	@Resource(lookup = "java:/queue/QueuePedido")
	private Queue queue;

	@Resource(lookup = "java:/topic/TopicVenda")
	private Topic topic;
	

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doGet(req, resp);
		 		resp.setContentType("text/html");
		 		PrintWriter out = resp.getWriter();
		 		out.write("<h1>Quickstart: Trabalho 3º Bimestre.</h1>");
	
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
	
}
