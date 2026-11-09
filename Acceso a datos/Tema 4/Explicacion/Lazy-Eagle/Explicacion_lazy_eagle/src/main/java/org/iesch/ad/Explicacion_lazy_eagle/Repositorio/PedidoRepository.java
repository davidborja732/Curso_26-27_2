package org.iesch.ad.Explicacion_lazy_eagle.Repositorio;

import org.iesch.ad.Explicacion_lazy_eagle.Modelos.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
}
