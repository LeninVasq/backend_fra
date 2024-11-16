package com.proyecto.proyectoasi.controller;

import com.proyecto.proyectoasi.entity.Materias;
import com.proyecto.proyectoasi.service.MateriasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
