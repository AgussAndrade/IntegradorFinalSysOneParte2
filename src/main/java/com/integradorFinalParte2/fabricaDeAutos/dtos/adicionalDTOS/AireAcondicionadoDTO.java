package com.integradorFinalParte2.fabricaDeAutos.dtos.adicionalDTOS;

import com.integradorFinalParte2.fabricaDeAutos.entities.adicionales.Adicional;
import com.integradorFinalParte2.fabricaDeAutos.entities.adicionales.AireAcondicionado;
import com.integradorFinalParte2.fabricaDeAutos.entities.autos.Auto;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class AireAcondicionadoDTO implements AdicionalDTO {


    private double precioBase;



    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }


    @Override
    public Adicional ToAdicional() {
        return new AireAcondicionado();
    }
}
