package com.bdv.microservicios.Msvcreglas.model.repo;




import com.bdv.microservicios.Msvcreglas.model.entities.Reglas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IReglasRepo extends JpaRepository<Reglas,String> {

    @Query(value="SELECT " +
            "a.ID_Cuenta as sproducto," +
            "a.ID_Tipo1 as itipo1," +
            "a.ID_Tipo2  as itipo2," +
            "a.Monto as smonto " +

            "from Combinacion a " +
            "WHERE " +
            "a.ID_Cuenta=?1 " +
            "and a.ID_Tipo1=?2 " +
            "and a.ID_Tipo2=?3",nativeQuery = true)
    Reglas findRegla(String idproducto,Integer itipo1,Integer itipo2);


    @Procedure
    void sp_RULE(@Param("Accion") String Accion,
                  @Param("sProducto") String sProducto,
                  @Param("iTipo1") Integer iTipo1,
                  @Param("iTipo2") Integer iTipo2,
                  @Param("sMonto") String sMonto,
                 @Param("sUser") String sUser


                 );

}
