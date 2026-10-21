package org.iesch.ad.demoSpring1.config;

import org.iesch.ad.demoSpring1.modelo.Persona;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class Configuracion {
    @Bean
    public List<Persona> personaconfiguracion(){
        List<Persona> personas = new ArrayList<>();
        Persona persona= Persona.builder().id(1).DNI("123456789").nombre("fernando").apellido("Lopez").build();
        Persona persona2= Persona.builder().id(2).nombre("juana").apellido("Lopez").build();
        Persona persona3= Persona.builder().id(3).nombre("Nombre").build();
        Persona persona4= Persona.builder().id(3).apellido("Lopez Rodriguez").nombre("prueba").build();
        Persona persona5= Persona.builder().id(5).nombre("juana").build();
        Persona persona6= Persona.builder().id(6).build();
        personas.add(persona);
        personas.add(persona2);
        personas.add(persona3);
        personas.add(persona4);
        personas.add(persona5);
        personas.add(persona6);
        return personas;
    }
}
