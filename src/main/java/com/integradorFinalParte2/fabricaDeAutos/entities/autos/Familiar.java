package com.integradorFinalParte2.fabricaDeAutos.entities.autos;

import com.integradorFinalParte2.fabricaDeAutos.dtos.adicionalDTOS.AdicionalDTO;
import com.integradorFinalParte2.fabricaDeAutos.dtos.autoDTOS.AutoDTO;
import com.integradorFinalParte2.fabricaDeAutos.dtos.autoDTOS.FamiliarDTO;
import com.integradorFinalParte2.fabricaDeAutos.entities.adicionales.Adicional;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

@Entity
@DiscriminatorValue(value = "familiar")
public class Familiar extends Auto {
    public Familiar(){
        super();
        this.setPrecioBase(245000);

    }
    @Override
    public AutoDTO toDTO() {
        AutoDTO auto = new FamiliarDTO();
        return formarAuto(auto);

    }
}
