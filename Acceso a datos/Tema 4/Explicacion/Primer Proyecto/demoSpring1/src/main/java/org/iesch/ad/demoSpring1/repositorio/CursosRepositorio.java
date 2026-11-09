package org.iesch.ad.demoSpring1.repositorio;

import org.iesch.ad.demoSpring1.modelo.Curso;
import org.iesch.ad.demoSpring1.modelo.Ordenes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursosRepositorio extends JpaRepository<Curso,Long
        > {
    //Optional<Coche> findById(int id);
}
