package com.bdv.microservicios.Msvcreglas.model.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter
@Entity
@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(
                name = "Regla",
                procedureName = "sp_RULE",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "Accion", type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "sProducto", type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "iTipo1", type = Integer.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "iTipo2", type = Integer.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "sMonto", type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "sUser", type = String.class),
                })

})
public class Reglas implements Serializable {

    @Id
    String sproducto;


    Integer itipo1;


    Integer itipo2;


    String smonto;




}
