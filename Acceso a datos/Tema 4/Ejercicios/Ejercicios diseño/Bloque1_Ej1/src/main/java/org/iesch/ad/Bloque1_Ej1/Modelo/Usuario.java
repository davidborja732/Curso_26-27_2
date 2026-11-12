package org.iesch.ad.Bloque1_Ej1.Modelo;


import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String contrasena;

    @OneToOne(mappedBy = "usuario",cascade=CascadeType.ALL,orphanRemoval = true)
    private Perfil perfil;
}
