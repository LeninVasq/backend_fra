package com.proyecto.proyectoasi.service;


import com.proyecto.proyectoasi.entity.Alumnos;
import com.proyecto.proyectoasi.repository.AlumnosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumnosService {
    @Autowired
    AlumnosRepository alumnosRepository;

    public List<Alumnos> getAlumnos (){
        return alumnosRepository.findAll();
    }
}
