package com.proyecto.proyectoasi.service;

import com.proyecto.proyectoasi.entity.Profesores;
import com.proyecto.proyectoasi.repository.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfesorService {
    @Autowired
    ProfesorRepository profesorRepository;

    public List<Profesores> getProfesores(){
        return profesorRepository.findAll();
    }



    public Optional<Profesores> getProfesoresId(Long id){
        return profesorRepository.findById(id);
    }
}
