package com.proyecto.proyectoasi.controller;

import com.proyecto.proyectoasi.entity.Materias;
import com.proyecto.proyectoasi.service.MateriasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/materias")

public class MateriasController {

    @Autowired
    private MateriasService materiasService;

    @GetMapping
    public List<Materias> getall(){
        return materiasService.getMaterias();
    }

    @PostMapping("/{nombre}")
    public List<Materias> getByNombre(@RequestBody String nombre) {
        return materiasService.getMateriasnombre(nombre);
    }

    @DeleteMapping  ("/{materia_id}")
    public void deleteid(@PathVariable("materia_id") Long profe_id){
        materiasService.deletemate(profe_id);
    }

}
