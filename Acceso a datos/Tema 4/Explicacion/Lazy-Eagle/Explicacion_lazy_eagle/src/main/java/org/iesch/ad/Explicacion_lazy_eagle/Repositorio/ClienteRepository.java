package org.iesch.ad.Explicacion_lazy_eagle.Repositorio;

import jakarta.persistence.Entity;
import org.iesch.ad.Explicacion_lazy_eagle.Modelos.Cliente;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    @Query("select distinct c from Cliente c left join fetch c.pedidos")
    List<Cliente> findAllConPedidos();

    //Cambiar comportamiento por defecto de findall para evitar n+1 consultas
    @EntityGraph(attributePaths = {"pedidos"})
    List<Cliente> findAll();
}
