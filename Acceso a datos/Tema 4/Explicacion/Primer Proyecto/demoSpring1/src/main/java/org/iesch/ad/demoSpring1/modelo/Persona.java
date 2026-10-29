package org.iesch.ad.demoSpring1.modelo;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@Builder
@ToString
@EqualsAndHashCode
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nombre;
    String apellido;
    @Column(unique = true,length = 9)
    String dni;
    //@Column(unique = true)
    String email;
    private LocalDateTime creacion;
    @PrePersist
    public void guardarhora(){
        this.creacion = LocalDateTime.now();
    }
    @PostPersist
    public void postguardar(){
        System.out.println("Se guarda la persona con ID " +this.id);
    }
    @OneToOne(cascade = CascadeType.ALL)
            //@JsonManagedReference
            @JoinColumn(name="coche_id",referencedColumnName = "id")
    Coche coche;

}
