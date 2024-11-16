package com.proyecto.proyectoasi.entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name ="grupos")
public class Grupos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long grupo_id;
    @Column(name= "nombre_grupo", unique = true,nullable = false)
    private String nombre_grupo;
}
