package org.iesch.ad.Explicacion_lazy_eagle.Servicio;

import jakarta.transaction.Transactional;
import org.iesch.ad.Explicacion_lazy_eagle.Modelos.Cliente;
import org.iesch.ad.Explicacion_lazy_eagle.Repositorio.ClienteRepository;
import org.iesch.ad.Explicacion_lazy_eagle.Repositorio.PedidoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ClienteService {
    // LOG
    private static final Logger LOG = LoggerFactory.getLogger(ClienteService.class);
    @Autowired
    ClienteRepository clienteRepository;
    @Transactional
    public void ClienteporID(int id){
        LOG.trace("Iniciando Cliente por ID");
        LOG.debug("ID: "+id);

       Optional<Cliente> clienteID=clienteRepository.findById(id);
        LOG.info("Se hace la consulta por ID");
       if(clienteID.isPresent()){
           Cliente cliente = clienteID.get();
           System.out.println("Cliente por ID: "+cliente.getNombre()+" el cliente tiene "+cliente.getPedidos().size()+" pedidos");
           //System.out.println("El cliente tiene "+cliente.getPedidos().size()+" pedidos");
       }else {
           System.out.println("Cliente no encontrado: "+clienteID.get());
       }
        LOG.trace("Finaliza Cliente por ID");
    }
    @Transactional
    public void mostrarTodos() {
        List<Cliente> todos=clienteRepository.findAll();
        if(todos.isEmpty()){
            System.out.println("No hay clientes encontrados");
        }else {
            System.out.println(todos.size());
            todos.forEach(cliente -> System.out.println(cliente.getNombre()+" "+cliente.getPedidos().size()));
        }

    }

    public void arreglarN1() {
        List<Cliente> todos=clienteRepository.findAllConPedidos();
        System.out.println(todos);
    }
}
