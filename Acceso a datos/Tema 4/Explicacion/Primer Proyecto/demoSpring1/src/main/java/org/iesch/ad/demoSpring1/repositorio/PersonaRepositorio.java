package org.iesch.ad.demoSpring1.repositorio;

import org.iesch.ad.demoSpring1.modelo.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.NativeQuery;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaRepositorio extends JpaRepository<Persona, Long> {

    // Devuelve todas las personas utilizando HQL
    @Query("select p from Persona p")
    List<Persona> buscarTodos();

    // Devuelve todas las personas utilizando SQL nativo
    @NativeQuery("select * from Persona p")
    List<Persona> buscarTodosSQL();

    // Busca personas cuyo nombre empiece por una letra determinada
    List<Persona> findByNombreStartingWith(char letra);

    // Busca personas cuyo DNI contenga una letra y cuyo apellido contenga un texto
    List<Persona> findByDniContainingAndApellidoContaining(char letraDNI, String letraApellido);

}
