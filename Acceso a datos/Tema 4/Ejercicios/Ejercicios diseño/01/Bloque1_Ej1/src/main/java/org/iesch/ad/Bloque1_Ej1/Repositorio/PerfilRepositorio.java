package org.iesch.ad.Bloque1_Ej1.Repositorio;

import org.iesch.ad.Bloque1_Ej1.Modelo.Perfil;
import org.iesch.ad.Bloque1_Ej1.Modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerfilRepositorio extends JpaRepository<Perfil,Integer> {
}
