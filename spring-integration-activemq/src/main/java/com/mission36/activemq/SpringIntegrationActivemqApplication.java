package com.mission36.activemq;

import java.util.Enumeration;

import javax.jms.JMSException;
import javax.jms.QueueBrowser;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.jms.core.BrowserCallback;
import org.springframework.jms.core.JmsTemplate;

@SpringBootApplication
public class SpringIntegrationActivemqApplication {

	public static void main(String[] args) throws JMSException {
		ApplicationContext ctx =  SpringApplication.run(SpringIntegrationActivemqApplication.class, args);
		
		JmsTemplate jmsTemplate = ctx.getBean(JmsTemplate.class);
		jmsTemplate.convertAndSend("test_queue1","hello active mq");
		
		System.out.println("########### message is created ########### ");
		
		jmsTemplate.browse("test_queue1", new BrowserCallback<TextMessage>() {

			@Override
			public TextMessage doInJms(Session session, QueueBrowser browser) throws JMSException {
				// TODO Auto-generated method stub
				Enumeration<TextMessage> message = browser.getEnumeration();
				while(message.hasMoreElements()) {
					System.out.println("Msg: "+message.nextElement().getText());
				}
				return null;
			}
			
		});
	}

}
