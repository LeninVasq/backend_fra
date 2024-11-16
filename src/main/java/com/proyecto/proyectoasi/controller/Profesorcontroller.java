package com.proyecto.proyectoasi.controller;

import com.proyecto.proyectoasi.entity.Profesores;
import com.proyecto.proyectoasi.entity.Roles;
import com.proyecto.proyectoasi.service.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;


@RestController
@RequestMapping(path = "api/v1/profesores")
public class Profesorcontroller {


    @PostMapping("/login")
    public String login(@RequestBody Map<String, String> datos) {
        String correo = datos.get("correo");
        String contra = datos.get("contra");

        boolean autenticado = profesorService.login(correo, contra);

        if (autenticado) {
            String rol = profesorService.emaillogin(correo);
            return ""+rol;
        } else {
            return "Credenciales incorrectas";
        }
    }


    @Autowired
    private ProfesorService profesorService;


    @GetMapping
    public List<Profesores> getall(){
        return profesorService.getProfesores();
    }

    @GetMapping("/{profesor_id}")
    public Optional<Profesores> getByid(@PathVariable("profesor_id") Long profe_id){
        return profesorService.getProfesoresId(profe_id);
    }


    @PostMapping
    public ResponseEntity<String> save(@RequestBody Profesores profesores){
        profesorService.saves(profesores);
        return new ResponseEntity<>("Profesor guardado exitosamente", HttpStatus.CREATED);
    }



    @DeleteMapping("/{profesor_id}")
    public void deleteid(@PathVariable("profesor_id") Long profe_id){
        profesorService.deleteprofe(profe_id);
    }



}
