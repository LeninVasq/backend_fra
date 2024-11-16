package com.proyecto.proyectoasi.repository;


import com.proyecto.proyectoasi.entity.Profesores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface ProfesorRepository extends JpaRepository<Profesores, Long> {

    Optional<Profesores> findByCorreoAndContra(String correo, String contra);

}
