package com.integradorFinalParte2.fabricaDeAutos.dtos.adicionalDTOS;

import com.integradorFinalParte2.fabricaDeAutos.entities.adicionales.Adicional;
import com.integradorFinalParte2.fabricaDeAutos.entities.adicionales.TechoCorredizo;

public class TechoCorredizoDTO implements AdicionalDTO {

    private double precioBase;

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    @Override
    public Adicional ToAdicional() {
        Adicional adicional = new TechoCorredizo();


        if(getPrecioBase() != 0){
            adicional.setPrecioBase(getPrecioBase());
        }
        return adicional;
    }
}
