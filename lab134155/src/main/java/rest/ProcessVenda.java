package rest;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jms.Destination;
import javax.jms.JMSContext;
import javax.jms.JMSException;
import javax.jms.ObjectMessage;
import javax.jms.Topic;

import entidades.Venda;

@Stateless
public class ProcessVenda {
	
	@Inject
	 	private JMSContext context;

	@Resource(lookup = "java:/topic/TopicVenda")
	 	private Topic topicVenda;
	
	
	public void processarVenda(Venda venda) {
		 
		 		System.out.println("Venda recebida pelo EJB Process Venda");
		 
		 		final Destination destination = topicVenda;
		 
		 		ObjectMessage message = context.createObjectMessage();
		 
		 		try {
		 
		 			message.setObject(venda);
		 			context.createProducer().send(destination, message);
		 
		 			System.out.println("A venda foi repassada.");
		 		} catch (JMSException e) {
		 			// TODO Auto-generated catch block
		 			e.printStackTrace();
		 		}
		 
		 	}
}
