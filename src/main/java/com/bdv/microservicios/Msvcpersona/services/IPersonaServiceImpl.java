package com.bdv.microservicios.Msvcpersona.services;


import com.bdv.microservicios.Msvcpersona.model.entities.Persona;
import com.bdv.microservicios.Msvcpersona.model.repo.IPersonaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@Service
public class IPersonaServiceImpl implements IPersonaService {



    @Autowired
    IPersonaRepo personaRepo;





    @Override
    @Transactional
    public Persona guardarPersona(Persona persona) {

        String personaId=persona.getPersonaid();
        String personanombre=persona.getPersona();
        String direccion=persona.getDireccion();
        String user=persona.getUser();

        personaRepo.sp_PEOPLE("INSERT",personaId,personanombre,direccion,user);

        return persona;
    }

    @Override
    public void eliminarPersona(String personaId) {

      //  String personaId=persona.getPersonaid();
        String personanombre="";
        String direccion="";
  //      String user=persona.getUser();
        String user="PLATAFORMA";

        personaRepo.sp_PEOPLE("DELETE",personaId,personanombre,direccion,user);

    }
}
