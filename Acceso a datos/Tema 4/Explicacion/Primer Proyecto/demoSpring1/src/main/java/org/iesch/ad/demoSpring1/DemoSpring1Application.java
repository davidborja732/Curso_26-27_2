package org.iesch.ad.demoSpring1;

import org.iesch.ad.demoSpring1.modelo.Coche;
import org.iesch.ad.demoSpring1.modelo.Persona;
import org.iesch.ad.demoSpring1.repositorio.CocheRepositorio;
import org.iesch.ad.demoSpring1.repositorio.PersonaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;

import static java.lang.Long.valueOf;

@SpringBootApplication
//@RequiredArgsConstructor
public class DemoSpring1Application implements CommandLineRunner {
	@Autowired
	PersonaRepositorio personaRepositorio;
	@Autowired
	CocheRepositorio cocheRepositorio;
	/*public DemoSpring1Application(PersonaRepositorio personaRepositorio) {
		this.personaRepositorio = personaRepositorio;
	}*/
	/*@Autowired
	List<Persona> personas;
	@Value("${firma}")
	String firma;*/
	@Override
	public void run(String... args) throws Exception {

		// Mostrar mensaje de prueba
		// System.out.println("Hola mundo");

		// Crear una persona mediante setters
    /*
    Persona personaconfiguracion = new Persona();
    personaconfiguracion.setNombre("Fernando");
    personaconfiguracion.setApellido("Lopez");
    personaconfiguracion.setEmail("fer@gmail.com");
    personaconfiguracion.setId(Long.valueOf(1));
    personaconfiguracion.setDNI("123456789");
    */

		// Crear personas usando Builder
		// Persona personaconfiguracion = Persona.builder().DNI("123456789").nombre("Fernando").apellido("Lopez").build();
		// Persona persona2 = Persona.builder().nombre("Juana").apellido("Lopez").build();

		// Mostrar objetos creados
		// System.out.println(personaconfiguracion);
		// System.out.println(persona2);

		// Crear persona para guardar en BD
		// Persona p = Persona.builder().nombre("Juan").email("email@gmail.com").apellido("Lopa").DNI("12345678N").build();

		// Guardar personas
		// personaRepositorio.save(p);
		// personaRepositorio.save(persona2);
		// personaRepositorio.save(personaconfiguracion);

		// Obtener todas las personas
		List<Persona> personas = personaRepositorio.findAll();
		System.out.println(personas);

		// Buscar persona por ID
		Optional<Persona> personaID3 = personaRepositorio.findById(valueOf(3));

		if (personaID3.isPresent()) {
			System.out.println(personaID3.get());
		} else {
			System.out.println("Persona no encontrada");
		}

		// Modificar datos de la persona encontrada
		if (personaID3.isPresent()) {
			personaID3.get().setNombre("Modificado");
			personaID3.get().setApellido("Apellido Nuevo");
			personaID3.get().setDni("90876543R");
			personaID3.get().setEmail("nuevo@gmail.com");

			// Guardar cambios
			personaRepositorio.save(personaID3.get());
		}

		// Eliminar persona por ID
		Optional<Persona> personaID1 = personaRepositorio.findById(valueOf(1));

		if (personaID1.isPresent()) {
			personaRepositorio.delete(personaID1.get());
		}

		// Crear persona de prueba
		Persona p = new Persona();
		p.setNombre("Modificado con");
		p.setApellido("hora");
		p.setDni("45676543G");
		p.setEmail("nuevoconhora@gmail.com");

		// Guardar persona
		// personaRepositorio.save(p);

		// Consulta personalizada HQL
		List<Persona> personasprueba = personaRepositorio.buscarTodos();
		System.out.println(personasprueba);

		// Consulta personalizada SQL
		List<Persona> personaspruebaSQL = personaRepositorio.buscarTodosSQL();
		System.out.println(personaspruebaSQL);

		// Buscar personas por inicial del nombre
		List<Persona> personaspruebaPersonalizada =
				personaRepositorio.findByNombreStartingWith('j');
		System.out.println(personaspruebaPersonalizada);

		// Buscar por DNI y apellido
		List<Persona> personaDNIApellido =
				personaRepositorio.findByDniContainingAndApellidoContaining('R', "n");
		System.out.println(personaDNIApellido);

		// Crear coche
		Coche coche = new Coche();
		coche.setMarca("Seat");
		coche.setModelo("Ibiza");
		coche.setMatricula("3456LKJ");

		// Crear persona asociada al coche
		Persona personaCoche = new Persona();
		personaCoche.setNombre("Coche");
		personaCoche.setApellido("persona");
		personaCoche.setDni("67543290L");
		personaCoche.setEmail("nuevoconcoche@gmail.com");
		personaCoche.setCoche(coche);

		// Guardar persona y coche
		personaRepositorio.save(personaCoche);

		// Buscar persona creada
		Optional<Persona> p2 = personaRepositorio.findById(7L);

		if (p2.isPresent()) {
			System.out.println(p2.get());
		}

		// Buscar coche creado
		Optional<Coche> coches = cocheRepositorio.findById(1);

		if (coches.isPresent()) {
			System.out.println(coches.get());
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoSpring1Application.class, args);
	}


}
