package org.iesch.ad.demoSpring1;

import org.iesch.ad.demoSpring1.modelo.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;
import java.awt.*;
import java.util.List;

@SpringBootApplication
public class DemoSpring1Application implements CommandLineRunner {
	@Autowired
	List<Persona> personas;
	@Value("${firma}")
	String firma;
	@Override
	public void run(String... args) throws Exception {

		System.out.println(personas);
		/*System.out.println("Hola mundo");
		System.out.println(firma);
		Persona personaconfiguracion = new Persona();
		personaconfiguracion.setNombre("Fernando");
		personaconfiguracion.setApellido("Lopez");
		personaconfiguracion.setEmail("fer@gmail.com");
		personaconfiguracion.setId(Long.valueOf(1));
		personaconfiguracion.setDNI("123456789");
		Persona personaconfiguracion= Persona.builder().id(1).DNI("123456789").nombre("fernando").apellido("Lopez").build();
		Persona persona2= Persona.builder().id(2).nombre("juana").apellido("Lopez").build();
		System.out.println(personaconfiguracion);
		System.out.println(persona2);*/
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoSpring1Application.class, args);
	}


}
