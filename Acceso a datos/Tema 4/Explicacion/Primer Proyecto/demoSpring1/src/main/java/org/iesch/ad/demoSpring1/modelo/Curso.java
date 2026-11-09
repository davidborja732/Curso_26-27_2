package org.iesch.ad.demoSpring1.modelo;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    @ToString.Exclude // Evito usar si es bidirectional par que puede haber StackOverflow (Desbordamiento)
    @ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE},mappedBy = "cursos")
    // peligroso poner el cascade aquí, ya que se pùede dar el caso que al borrar se borre el padre y el resto de cursos
    // mejor usar cascade persist y merst
    // Persist al guardar se salva el padre
    // Merge al actualizar se actualiza el padre
    /*@JoinTable(
            name = "cursos-student",
            joinColumns = @JoinColumn(name = "cursos_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id")
    )*/ //unidireccional en caso de ser de curso a student
    private Set<Student> estudianes=new HashSet<>();
}
