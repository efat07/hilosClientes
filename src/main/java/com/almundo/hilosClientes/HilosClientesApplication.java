package com.almundo.hilosClientes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.almundo.hilosClientes.hilos.LlamadasHilo;
import com.almundo.hilosClientes.model.Cliente;
import com.almundo.hilosClientes.model.Llamada;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author https://github.com/efat07 - Eyner Arias - efat07@hotmail.com
 *
 */

@SpringBootApplication
public class HilosClientesApplication {

	public static void main(String[] args) {
		try {
			//SpringApplication.run(HilosClientesApplication.class, args);
			
			ObjectMapper mapper = new ObjectMapper();
			
			Cliente cliente1 = new Cliente(1);
			Llamada llamada1 = new Llamada(1, cliente1);
			String jsonLlamada1 = mapper.writeValueAsString(llamada1);
			
			Cliente cliente2 = new Cliente(2);
			Llamada llamada2 = new Llamada(2, cliente2);
			String jsonLlamada2 = mapper.writeValueAsString(llamada2);
			
			Cliente cliente3 = new Cliente(3);
			Llamada llamada3 = new Llamada(3, cliente3);
			String jsonLlamada3 = mapper.writeValueAsString(llamada3);
			
			Cliente cliente4 = new Cliente(4);
			Llamada llamada4 = new Llamada(4, cliente4);
			String jsonLlamada4 = mapper.writeValueAsString(llamada4);
			
			Cliente cliente5 = new Cliente(5);
			Llamada llamada5 = new Llamada(5, cliente5);
			String jsonLlamada5 = mapper.writeValueAsString(llamada5);
			
			Cliente cliente6 = new Cliente(6);
			Llamada llamada6 = new Llamada(6, cliente6);
			String jsonLlamada6 = mapper.writeValueAsString(llamada6);
			
			Cliente cliente7 = new Cliente(7);
			Llamada llamada7 = new Llamada(7, cliente7);
			String jsonLlamada7 = mapper.writeValueAsString(llamada7);
			
			Cliente cliente8 = new Cliente(8);
			Llamada llamada8 = new Llamada(8, cliente8);
			String jsonLlamada8 = mapper.writeValueAsString(llamada8);
			
			Cliente cliente9 = new Cliente(9);
			Llamada llamada9 = new Llamada(9, cliente9);
			String jsonLlamada9 = mapper.writeValueAsString(llamada9);
			
			Cliente cliente10 = new Cliente(10);
			Llamada llamada10 = new Llamada(10, cliente10);
			String jsonLlamada10 = mapper.writeValueAsString(llamada10);
			
			LlamadasHilo llamadaHilo1 = new LlamadasHilo(jsonLlamada1);
			LlamadasHilo llamadaHilo2 = new LlamadasHilo(jsonLlamada2);
			LlamadasHilo llamadaHilo3 = new LlamadasHilo(jsonLlamada3);
			LlamadasHilo llamadaHilo4 = new LlamadasHilo(jsonLlamada4);
			LlamadasHilo llamadaHilo5 = new LlamadasHilo(jsonLlamada5);
			LlamadasHilo llamadaHilo6 = new LlamadasHilo(jsonLlamada6);
			LlamadasHilo llamadaHilo7 = new LlamadasHilo(jsonLlamada7);
			LlamadasHilo llamadaHilo8 = new LlamadasHilo(jsonLlamada8);
			LlamadasHilo llamadaHilo9 = new LlamadasHilo(jsonLlamada9);
			LlamadasHilo llamadaHilo10 = new LlamadasHilo(jsonLlamada10);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}

}
