package org.iesch.ad.demoSpring1.modelo;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Ordenes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate fecha;
    private String nombre;
    @ManyToOne
            @JoinColumn(name="order_id")
    Cliente cliente;
}
