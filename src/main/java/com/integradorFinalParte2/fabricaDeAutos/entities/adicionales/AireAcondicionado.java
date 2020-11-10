package com.integradorFinalParte2.fabricaDeAutos.entities.adicionales;

import com.integradorFinalParte2.fabricaDeAutos.dtos.adicionalDTOS.AdicionalDTO;
import com.integradorFinalParte2.fabricaDeAutos.dtos.adicionalDTOS.AirbagDTO;
import com.integradorFinalParte2.fabricaDeAutos.dtos.adicionalDTOS.AireAcondicionadoDTO;

import javax.persistence.*;

@Entity
@DiscriminatorValue(value="aire_acondicionado")
public class AireAcondicionado extends Adicional {


    public AireAcondicionado(){
        setPrecioBase(20000);

    }

    @Override
    public AdicionalDTO toDTO() {

        AdicionalDTO adicionalDTO = new AireAcondicionadoDTO();
        adicionalDTO.setPrecioBase(getPrecioBase());
        return adicionalDTO;
    }
}
