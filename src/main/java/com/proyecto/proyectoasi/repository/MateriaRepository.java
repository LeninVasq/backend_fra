package com.proyecto.proyectoasi.repository;

import com.proyecto.proyectoasi.entity.Materias;
import com.proyecto.proyectoasi.entity.Profesores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MateriaRepository extends JpaRepository<Materias, Long> {


//    Optional<Materias> findByNombre_materia(String nombre_materia);


}
