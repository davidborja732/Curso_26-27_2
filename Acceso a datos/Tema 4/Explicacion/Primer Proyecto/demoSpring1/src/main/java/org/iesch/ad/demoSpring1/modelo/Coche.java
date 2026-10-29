package org.iesch.ad.demoSpring1.modelo;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
public class Coche {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    String marca;
    String modelo;
    String matricula;
    @OneToOne (mappedBy = "coche")// nombre de la variable que hace le mapeo relacion padre
            //@JsonBackReference
           // @ToString.Exclude
    Persona persona;
}
