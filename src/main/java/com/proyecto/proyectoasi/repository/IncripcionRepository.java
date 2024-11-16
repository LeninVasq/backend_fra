package com.proyecto.proyectoasi.repository;

import com.proyecto.proyectoasi.entity.Inscripcion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IncripcionRepository extends JpaRepository<Inscripcion, Long> {
}
