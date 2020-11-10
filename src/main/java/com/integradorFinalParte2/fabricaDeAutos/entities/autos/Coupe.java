package com.integradorFinalParte2.fabricaDeAutos.entities.autos;

import com.integradorFinalParte2.fabricaDeAutos.dtos.adicionalDTOS.AdicionalDTO;
import com.integradorFinalParte2.fabricaDeAutos.dtos.autoDTOS.AutoDTO;
import com.integradorFinalParte2.fabricaDeAutos.dtos.autoDTOS.CoupeDTO;
import com.integradorFinalParte2.fabricaDeAutos.entities.adicionales.Adicional;
import net.bytebuddy.implementation.bind.annotation.This;
import org.hibernate.hql.spi.id.TableBasedDeleteHandlerImpl;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

@Entity
@DiscriminatorValue(value = "coupe")
public class Coupe extends Auto {
    public Coupe(){
        super();
        this.setPrecioBase( 270000);

    }

    @Override
    public AutoDTO toDTO() {
        AutoDTO auto = new CoupeDTO();
        return formarAuto(auto);

    }
}
