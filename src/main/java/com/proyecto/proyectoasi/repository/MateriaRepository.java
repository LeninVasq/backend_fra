package com.proyecto.proyectoasi.repository;

import com.proyecto.proyectoasi.entity.Materias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MateriaRepository extends JpaRepository<Materias, Long> {
}
