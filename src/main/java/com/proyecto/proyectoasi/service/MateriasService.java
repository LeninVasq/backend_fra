package com.proyecto.proyectoasi.service;

import com.proyecto.proyectoasi.entity.Materias;
import com.proyecto.proyectoasi.entity.Profesores;
import com.proyecto.proyectoasi.repository.MateriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MateriasService {

    @Autowired
    MateriaRepository materiaRepository;

    public List<Materias> getMaterias(){
        return materiaRepository.findAll();
    }

   // public Optional<Materias> getMateriasnombre(String materia){
     //   return materiaRepository.findByNombre_materia(materia);
    //}

    public void save(Materias materias){
        materiaRepository.save(materias);
    }


    public void deletemate(Long id){
        materiaRepository.deleteById(id);
    }

}
