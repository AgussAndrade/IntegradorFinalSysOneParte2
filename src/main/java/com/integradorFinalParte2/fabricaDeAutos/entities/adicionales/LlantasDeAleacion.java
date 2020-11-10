package com.integradorFinalParte2.fabricaDeAutos.entities.adicionales;

import com.integradorFinalParte2.fabricaDeAutos.dtos.adicionalDTOS.AdicionalDTO;
import com.integradorFinalParte2.fabricaDeAutos.dtos.adicionalDTOS.AirbagDTO;
import com.integradorFinalParte2.fabricaDeAutos.dtos.adicionalDTOS.LlantasDeAleacionDTO;

import javax.persistence.*;

@Entity
@DiscriminatorValue(value="llantas_de_aleacion")
public class LlantasDeAleacion extends Adicional{
    public LlantasDeAleacion(){
        setPrecioBase(12000);
    }

    @Override
    public AdicionalDTO toDTO() {

        AdicionalDTO adicionalDTO = new LlantasDeAleacionDTO();
        adicionalDTO.setPrecioBase(getPrecioBase());
        return adicionalDTO;
    }
}
