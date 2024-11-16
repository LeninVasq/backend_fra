package com.proyecto.proyectoasi.service;

import com.proyecto.proyectoasi.entity.Profesores;
import com.proyecto.proyectoasi.entity.Roles;
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



    public void saves(Profesores profesores) {
        profesorRepository.save(profesores);
    }

   public boolean login(String correo, String contra){
       Optional<Profesores> profesor = profesorRepository.findByCorreoAndContra(correo, contra);
       return profesor.isPresent();
   }

    public String emaillogin(String correo) {
        Optional<Profesores> profesor = profesorRepository.findByCorreo(correo);
        return profesor.map(p -> p.getRol_id().getRol()).orElse(null);
    }
    public void deleteprofe(Long id) {
        profesorRepository.deleteById(id);
    }
}
