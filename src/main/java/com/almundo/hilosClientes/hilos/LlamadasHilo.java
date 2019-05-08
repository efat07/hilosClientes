package com.almundo.hilosClientes.hilos;

import javax.jms.Connection;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;

/**
 * @author https://github.com/efat07 - Eyner Arias - efat07@hotmail.com
 *
 */

public class LlamadasHilo implements Runnable {

    Thread hilo;
    String jsonLlamada;

	public LlamadasHilo(String jsonLlamada) {
		this.jsonLlamada = jsonLlamada;
		System.out.println("Hilo: " + this.jsonLlamada);
		hilo = new Thread(this,"name");
		hilo.start();
	}
	
	@Override
	public void run() {
		try {
			ActiveMQConnectionFactory factory = new ActiveMQConnectionFactory("almundo", "almundo", "tcp://localhost:61616");
			Connection con = factory.createConnection();
			Session session = con.createSession(false, Session.AUTO_ACKNOWLEDGE);
			Queue queue = new ActiveMQQueue("jms/almundo/queueDispatcher");
			MessageProducer producer = session.createProducer(queue);
			TextMessage tm = session.createTextMessage(this.jsonLlamada);
			producer.send(queue, tm);
			con.close();
			session.close();
			System.out.println("Llamada enviada...");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
