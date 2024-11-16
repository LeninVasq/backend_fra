package com.proyecto.proyectoasi.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name ="inscripcion")
public class Inscripcion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long inscripcion_id;

    @ManyToOne
    @JoinColumn(name = "alumnosId", referencedColumnName = "alumnosId")
    private Alumnos alumnosId;


    @ManyToOne
    @JoinColumn(name = "grupo_id", referencedColumnName = "grupo_id")
    private Grupos grupo_id;

    @ManyToOne
    @JoinColumn(name = "profesor_id", referencedColumnName = "profesor_id")
    private Profesores profesor_id;

    @ManyToOne
    @JoinColumn(name = "materia_id", referencedColumnName = "materia_id")
    private Materias materia_id;
    @Column(name= "fecha_nacimiento", nullable = false)
    private Date fecha_nacimiento;
}
