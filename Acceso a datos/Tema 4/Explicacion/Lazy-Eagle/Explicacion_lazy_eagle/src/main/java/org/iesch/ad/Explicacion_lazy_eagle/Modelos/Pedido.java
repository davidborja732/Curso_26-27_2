package org.iesch.ad.Explicacion_lazy_eagle.Modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    LocalDateTime fecha;
    String resumen;

}
