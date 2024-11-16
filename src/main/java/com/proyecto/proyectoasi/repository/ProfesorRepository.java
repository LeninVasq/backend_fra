package com.proyecto.proyectoasi.repository;


import com.proyecto.proyectoasi.entity.Profesores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ProfesorRepository extends JpaRepository<Profesores, Long> {
}
