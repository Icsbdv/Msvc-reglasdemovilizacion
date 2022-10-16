package com.bdv.microservicios.Msvcreglas.controller;



import com.bdv.microservicios.Msvcreglas.model.entities.Reglas;
import com.bdv.microservicios.Msvcreglas.services.IReglasService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("app")
public class Reglascontroller {



    @Autowired
    IReglasService iReglasService;




    @PostMapping("/crearregla")
    public ResponseEntity<?> crearRegla(@RequestBody Reglas reglas){
        Reglas reglasguardadas=iReglasService.guardarReglas(reglas);
        return ResponseEntity.status(HttpStatus.CREATED).body(reglasguardadas);

    }

    @DeleteMapping("/eliminaregla")
    public ResponseEntity<?> eliminarRegla(
            @RequestParam(name="productoId") String productoId,
            @RequestParam(name="itipo1") Integer itipo1,
            @RequestParam(name="itipo2") Integer itipo2){
       iReglasService.eliminarRegla(productoId,itipo1,itipo2);
        return ResponseEntity.noContent().build();
    }


 /*   @DeleteMapping("/eliminarpersona")
    public ResponseEntity<?> eliminarPersona(@RequestParam String idPersona){
        iPersonaService.eliminarPersona(idPersona);
        return ResponseEntity.noContent().build();
    }*/



}
