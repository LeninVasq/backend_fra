package com.proyecto.proyectoasi.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name ="materias")
public class Materias {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long materia_id;
    private String nombreMateria;
    private String descripcion;
    @ManyToOne
    @JoinColumn(name = "carrera_id", referencedColumnName = "carrera_id")
    private Carreras carrera;
}
