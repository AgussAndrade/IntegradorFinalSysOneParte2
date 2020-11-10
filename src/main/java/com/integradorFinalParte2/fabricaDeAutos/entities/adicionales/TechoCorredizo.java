package com.integradorFinalParte2.fabricaDeAutos.entities.adicionales;

import com.integradorFinalParte2.fabricaDeAutos.dtos.adicionalDTOS.AdicionalDTO;
import com.integradorFinalParte2.fabricaDeAutos.dtos.adicionalDTOS.AirbagDTO;
import com.integradorFinalParte2.fabricaDeAutos.dtos.adicionalDTOS.SistemaDeFrenosDTO;
import com.integradorFinalParte2.fabricaDeAutos.dtos.adicionalDTOS.TechoCorredizoDTO;

import javax.persistence.*;

@Entity
@DiscriminatorValue(value="techo_corredizo")
public class TechoCorredizo extends Adicional {
    public TechoCorredizo(){
        setPrecioBase( 12000);
    }


    @Override
    public AdicionalDTO toDTO() {

        AdicionalDTO adicionalDTO = new SistemaDeFrenosDTO();
        adicionalDTO.setPrecioBase(getPrecioBase());
        return adicionalDTO;
    }
}
