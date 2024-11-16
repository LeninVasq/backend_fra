package com.proyecto.proyectoasi.entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name ="asistencias")
public class Asistencias {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long asistencia_id;

    @ManyToOne
    @JoinColumn(name = "inscripcion_id", referencedColumnName = "inscripcion_id")
    private Inscripcion inscripcion_id;
}
