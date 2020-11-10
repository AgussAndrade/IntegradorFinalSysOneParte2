package com.integradorFinalParte2.fabricaDeAutos.entities.autos;

import com.integradorFinalParte2.fabricaDeAutos.dtos.adicionalDTOS.AdicionalDTO;
import com.integradorFinalParte2.fabricaDeAutos.dtos.autoDTOS.AutoDTO;
import com.integradorFinalParte2.fabricaDeAutos.dtos.autoDTOS.SedanDTO;
import com.integradorFinalParte2.fabricaDeAutos.entities.adicionales.Adicional;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

@Entity
@DiscriminatorValue(value = "sedan")
public class Sedan extends Auto {
    public Sedan (){
        super();
        this.setPrecioBase( 230000);
    }
    @Override
    public AutoDTO toDTO() {
        AutoDTO auto = new SedanDTO();
        return formarAuto(auto);
    }
}
