package com.integradorFinalParte2.fabricaDeAutos.entities.adicionales;

import com.integradorFinalParte2.fabricaDeAutos.dtos.adicionalDTOS.AdicionalDTO;
import com.integradorFinalParte2.fabricaDeAutos.dtos.adicionalDTOS.AirbagDTO;
import com.integradorFinalParte2.fabricaDeAutos.dtos.adicionalDTOS.SistemaDeFrenosDTO;

import javax.persistence.*;

@Entity
@DiscriminatorValue(value="sistema_de_frenos")
public class SistemaDeFrenos extends Adicional{
    public SistemaDeFrenos(){
        setPrecioBase(14000);
    }

    @Override
    public AdicionalDTO toDTO() {

        AdicionalDTO adicionalDTO = new SistemaDeFrenosDTO();
        adicionalDTO.setPrecioBase(getPrecioBase());
        return adicionalDTO;
    }
}
