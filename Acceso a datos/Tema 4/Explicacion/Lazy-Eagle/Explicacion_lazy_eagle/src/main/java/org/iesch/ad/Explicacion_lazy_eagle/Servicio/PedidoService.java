package org.iesch.ad.Explicacion_lazy_eagle.Servicio;

import org.iesch.ad.Explicacion_lazy_eagle.Repositorio.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // Meto la logica de negocio aqui
public class PedidoService {
    @Autowired
    PedidoRepository pedidoRepository;

}
