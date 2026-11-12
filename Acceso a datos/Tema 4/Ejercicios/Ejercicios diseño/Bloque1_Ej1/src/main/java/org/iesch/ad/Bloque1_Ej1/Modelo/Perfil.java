package org.iesch.ad.Bloque1_Ej1.Modelo;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class Perfil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String fotoperfil;
    private String descripcion;
    private LocalDate fechanacimiento;

    @OneToOne
    @JoinColumn(name="usuario_id",nullable = false,unique = true)
    private Usuario usuario;// No puede existir un perfil sin un Usuario relacionado

}
