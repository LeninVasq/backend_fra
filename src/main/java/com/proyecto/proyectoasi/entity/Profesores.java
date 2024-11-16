package com.proyecto.proyectoasi.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "profesores")

public class Profesores {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long profesor_id;
    private String nombre;
    private String apellido;
    @Column(name= "email", unique = true,nullable = false)
    private String correo;
    private String contra;
}
