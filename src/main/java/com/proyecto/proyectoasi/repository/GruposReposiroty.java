package com.proyecto.proyectoasi.repository;

import com.proyecto.proyectoasi.entity.Grupos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface GruposReposiroty extends JpaRepository<Grupos, Long> {
}
