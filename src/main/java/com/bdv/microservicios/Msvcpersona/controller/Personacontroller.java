package com.bdv.microservicios.Msvcpersona.controller;



import com.bdv.microservicios.Msvcpersona.model.entities.Persona;
import com.bdv.microservicios.Msvcpersona.services.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("app")
public class Personacontroller {



    @Autowired
    IPersonaService iPersonaService;




    @PostMapping("/crearpersona")
    public ResponseEntity<?> crearPersona(@RequestBody Persona persona){
        Persona personaguardada=iPersonaService.guardarPersona(persona);
        return ResponseEntity.status(HttpStatus.CREATED).body(personaguardada);
    }

   /* @DeleteMapping("/eliminarpersona")
    public ResponseEntity<?> eliminarPersona(@RequestBody Persona persona){
       iPersonaService.eliminarPersona(persona);
        return ResponseEntity.noContent().build();
    }*/


    @DeleteMapping("/eliminarpersona")
    public ResponseEntity<?> eliminarPersona(@RequestParam String idPersona){
        iPersonaService.eliminarPersona(idPersona);
        return ResponseEntity.noContent().build();
    }



}
