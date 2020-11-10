package com.integradorFinalParte2.fabricaDeAutos.entities.adicionales;

import com.integradorFinalParte2.fabricaDeAutos.dtos.adicionalDTOS.AdicionalDTO;
import com.integradorFinalParte2.fabricaDeAutos.dtos.adicionalDTOS.AirbagDTO;

import javax.persistence.*;

@Entity
@DiscriminatorValue(value="Airbag")
public class Airbag extends Adicional {

    public Airbag(){
        setPrecioBase( 7000);
    }

    @Override
    public AdicionalDTO toDTO() {

        AdicionalDTO adicionalDTO = new AirbagDTO();
        adicionalDTO.setPrecioBase(getPrecioBase());
        return adicionalDTO;
    }
}
