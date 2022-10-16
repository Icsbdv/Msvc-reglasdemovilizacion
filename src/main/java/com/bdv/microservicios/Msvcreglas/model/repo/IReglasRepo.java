package com.bdv.microservicios.Msvcreglas.model.repo;




import com.bdv.microservicios.Msvcreglas.model.entities.Reglas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IReglasRepo extends JpaRepository<Reglas,String> {

    @Procedure
    void sp_RULE(@Param("Accion") String Accion,
                  @Param("sProducto") String sProducto,
                  @Param("iTipo1") Integer iTipo1,
                  @Param("iTipo2") Integer iTipo2,
                  @Param("sMonto") String sMonto,
                 @Param("sUser") String sUser


                 );

}
