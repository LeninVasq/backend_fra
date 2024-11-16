package com.proyecto.proyectoasi.repository;

import com.proyecto.proyectoasi.entity.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolesService   extends JpaRepository<Roles, Long> {
}
