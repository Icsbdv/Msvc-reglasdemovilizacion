package com.bdv.microservicios.Msvcreglas.services;




import com.bdv.microservicios.Msvcreglas.model.entities.Reglas;

public interface IReglasService {
    Reglas guardarReglas(Reglas reglas);

    void eliminarRegla(String productoId,Integer iTipo1,Integer iTipo2);
}
