package com.proyecto.proyectoasi.service;

import com.proyecto.proyectoasi.entity.Profesores;
import com.proyecto.proyectoasi.repository.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

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



    public void saves(Profesores profesores) {
        profesorRepository.save(profesores);
    }

   public boolean login(String correo, String contra){
       Optional<Profesores> profesor = profesorRepository.findByCorreoAndContra(correo, contra);
       return profesor.isPresent();
    }


    public void deleteprofe(Long id) {
        profesorRepository.deleteById(id);
    }
}
