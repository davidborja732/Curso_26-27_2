package org.iesch.ad.Explicacion_lazy_eagle.Modelos;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;

    @OneToMany
    @JoinColumn(name = "cliente_id")
    private List<Pedido> pedidos;

}
