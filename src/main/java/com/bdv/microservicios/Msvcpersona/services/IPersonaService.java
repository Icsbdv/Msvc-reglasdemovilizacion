package com.bdv.microservicios.Msvcpersona.services;



import com.bdv.microservicios.Msvcpersona.model.entities.Persona;

public interface IPersonaService {
    Persona guardarPersona(Persona persona);

    void eliminarPersona(String personaId);
}
