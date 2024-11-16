package com.proyecto.proyectoasi.repository;

import com.proyecto.proyectoasi.entity.Asistencias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface AsisteciasRepository extends JpaRepository<Asistencias, Long> {
}
