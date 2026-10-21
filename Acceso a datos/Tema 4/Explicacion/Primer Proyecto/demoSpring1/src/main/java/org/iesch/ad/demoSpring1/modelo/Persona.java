package org.iesch.ad.demoSpring1.modelo;

import lombok.*;


@Getter
@Setter
/*@NoArgsConstructor
@AllArgsConstructor*/
@Builder
@ToString
@EqualsAndHashCode
public class Persona {
    int id;
    String nombre;
    String apellido;
    String DNI;
    String email;
}
