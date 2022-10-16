package com.bdv.microservicios.Msvcreglas.services;


;
import com.bdv.microservicios.Msvcreglas.model.entities.Reglas;
import com.bdv.microservicios.Msvcreglas.model.repo.IReglasRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@Service
public class IReglasServiceImpl implements IReglasService{

    private static final String USER = "PLATAFORMA";


    @Autowired
    IReglasRepo reglasRepo;

    @Override
    @Transactional
    public Reglas guardarReglas(Reglas reglas) {
      String sProducto=reglas.getSproducto();
      Integer iTipo1=reglas.getItipo1();
      Integer iTipo2=reglas.getItipo1();
      String sMonto=reglas.getSproducto();
      reglasRepo.sp_RULE("INSERT",sProducto,iTipo1,iTipo2,sMonto,USER);
      return reglas;
    }

    @Override
    @Transactional
    public void eliminarRegla(String productoId,Integer iTipo1,Integer iTipo2) {
        String sMonto="0";
        reglasRepo.sp_RULE("DELETE",productoId,iTipo1,iTipo2,sMonto,USER);
    }






    /*@Override
    @Transactional
    public Reglas guardarPersona(Reglas reglas) {

      //  String personaId=persona.getPersonaid();
      //  String personanombre=persona.getPersona();
      //  String direccion=persona.getDireccion();
     //   String user=persona.getUser();

    //    personaRepo.sp_PEOPLE("INSERT",personaId,personanombre,direccion,user);

        return reglas;
    }*/

   /* @Override
    public void eliminarPersona(String personaId) {

      //  String personaId=persona.getPersonaid();
        String personanombre="";
        String direccion="";
  //      String user=persona.getUser();
        String user="PLATAFORMA";

        personaRepo.sp_PEOPLE("DELETE",personaId,personanombre,direccion,user);

    }*/


}
