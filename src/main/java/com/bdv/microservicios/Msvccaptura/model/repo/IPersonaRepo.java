package com.bdv.microservicios.Msvccaptura.model.repo;



import com.bdv.microservicios.Msvccaptura.model.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepo extends JpaRepository<Persona,String> {

    @Procedure
    void sp_PEOPLE(@Param("Accion") String Accion,
                  @Param("sPersonaId") String sPersonaId,
                  @Param("sPersona") String sPersona,
                  @Param("sDireccion") String sDireccion,
                  @Param("sUser") String sUser

    );

}
