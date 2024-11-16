package com.proyecto.proyectoasi.controller;

import com.proyecto.proyectoasi.entity.Profesores;
import com.proyecto.proyectoasi.service.ProfesorService;
import jakarta.servlet.http.HttpSession;
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

    @Autowired
    private ProfesorService profesorService;

    @PostMapping("/login")
    public String login(@RequestBody Map<String, String> datos, HttpSession session) {
        String correo = datos.get("correo");
        String contra = datos.get("contra");

        boolean autenticado = profesorService.login(correo, contra);

        if (autenticado) {
            String rol = profesorService.emaillogin(correo);
            session.setAttribute("correo", correo);
            session.setAttribute("rol", rol);
            return ""+session;
        } else {
            return "Credenciales incorrectas";
        }
    }


    @GetMapping("/usuario")
    public String obtenerUsuario(HttpSession session) {
        String correo = (String) session.getAttribute("correo");
        String rol = (String) session.getAttribute("rol");

        if (correo != null && rol != null) {
            return "Usuario: " + correo + " con rol: " + rol;
        } else {
            return "No hay sesión activa.";
        }
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "Sesión cerrada exitosamente";
    }





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
