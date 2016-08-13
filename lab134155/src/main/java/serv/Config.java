package serv;

import javax.jms.JMSDestinationDefinition;
import javax.jms.JMSDestinationDefinitions;

@JMSDestinationDefinitions(value = { @JMSDestinationDefinition(name = "java:/queue/QueuePedido", interfaceName = "javax.jms.Queue", destinationName = "QueuePedido"), 
									@JMSDestinationDefinition(name = "java:/topic/TopicVenda", interfaceName = "javax.jms.Topic", destinationName = "TopicVenda") })

public class Config {

}
