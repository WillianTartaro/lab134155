package mdbs;

import java.util.logging.Logger;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.univel.model.Log;
import entidades.Venda;

@MessageDriven(name = "MdbLogistica", activationConfig = {
		@ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "queue/QueuePedido"),
		@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
		@ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge"),
		@ActivationConfigProperty(propertyName = "maxSession", propertyValue = "1"),

		
})
public class MdbLogistica implements MessageListener {

private final static Logger LOGGER = Logger.getLogger(MdbLogistica.class.toString());

@PersistenceContext(unitName = "lab134155-persistence-unit")
private EntityManager em;
	
	public void onMessage(Message rcvMessage) {
		ObjectMessage msg = null;
		try {
			if (rcvMessage instanceof ObjectMessage) {
				msg = (ObjectMessage) rcvMessage;
				Venda venda = (Venda) msg.getObject();
				
				Log log = new Log();
				log.setMdb(MdbLogistica.class.toString());
				log.setData("01/01/0000");
				log.setHora("00:00:00");
				log.setInformacoes("Objeto recebido: " + venda);

				em.persist(log);
				
				 LOGGER.info("Logistica: Realizando");
				 LOGGER.info("Logistica: Processando....");
				 try {
					Thread.sleep(30000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 LOGGER.info("A Entrega foi despachada.");
			} else {
				LOGGER.warning("Message of wrong type:" + rcvMessage.getClass().getName());
			}
		} catch (JMSException e) {
			throw new RuntimeException(e);
		}
		
	}
	
}
