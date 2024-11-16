package com.proyecto.proyectoasi.repository;

import com.proyecto.proyectoasi.entity.Carreras;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarreraRepository extends JpaRepository<Carreras, Long> {
}
