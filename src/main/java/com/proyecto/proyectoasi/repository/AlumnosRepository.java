package com.proyecto.proyectoasi.repository;

import com.proyecto.proyectoasi.entity.Alumnos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface AlumnosRepository extends JpaRepository<Alumnos, Long> {
}
