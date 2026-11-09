package org.iesch.ad.Explicacion_lazy_eagle;

import org.iesch.ad.Explicacion_lazy_eagle.Servicio.ClienteService;
import org.iesch.ad.Explicacion_lazy_eagle.Servicio.PedidoService;
import org.jspecify.annotations.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExplicacionLazyEagleApplication implements CommandLineRunner {

	@Autowired
	ClienteService clienteService;
	@Autowired
    PedidoService pedidoService;
	public static void main(String[] args) {
		SpringApplication.run(ExplicacionLazyEagleApplication.class, args);

	}


	@Override
	public void run(String... args) throws Exception {
		System.out.println("Datos del cliente 1");
		clienteService.ClienteporID(1);
		/*System.out.println("Mostrar todos");
		clienteService.mostrarTodos();*/

		//Arreglar n+1 consultas
		System.out.println("Arreglar N+1 consultas con left join 1ºER solucion");
		clienteService.arreglarN1();
		System.out.println("Arreglar N+1 consultas con 2ºDA solucion cmabiando comportamiento por defecto de findall");
		clienteService.mostrarTodos();

	}
}
