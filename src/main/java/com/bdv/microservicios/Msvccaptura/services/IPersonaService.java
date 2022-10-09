package com.bdv.microservicios.Msvccaptura.services;


import com.bdv.microservicios.Msvccaptura.model.entities.Persona;

public interface IPersonaService {
    Persona guardarPersona(Persona persona);

    void eliminarPersona(String personaId);
}
