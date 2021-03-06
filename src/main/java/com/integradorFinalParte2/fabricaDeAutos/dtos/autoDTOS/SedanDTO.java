package com.integradorFinalParte2.fabricaDeAutos.dtos.autoDTOS;

import com.integradorFinalParte2.fabricaDeAutos.dtos.adicionalDTOS.AdicionalDTO;
import com.integradorFinalParte2.fabricaDeAutos.entities.autos.Auto;
import com.integradorFinalParte2.fabricaDeAutos.entities.autos.Sedan;

import java.util.List;

public class SedanDTO implements AutoDTO{
    private List<AdicionalDTO> adicionalesDTO;
    private double precioBase;
    private double precioFinal;

    public double getPrecioFinal(){
        return precioFinal;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }


    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }
    @Override
    public Auto toAuto() {
        Auto auto = new Sedan();
        //Se repite codigo pero las opciones para mejorar seria pasar autoDTO a clase, pero pierdo la interfaz
        // y ademas pierdo la opcion de que algun futuro auto de transforme de forma distinta
        for(AdicionalDTO adicional : this.adicionalesDTO){
            auto.addAdicional(adicional.ToAdicional());
        }
        if(getPrecioBase() != 0){
            auto.setPrecioBase(getPrecioBase());
        }
        if(getPrecioFinal() != 0){
            auto.setPrecioFinal(getPrecioFinal());
        }

        return auto;
    }

    @Override
    public void setAdicionales(List<AdicionalDTO> adicionales) {
        this.adicionalesDTO = adicionales;
    }

    @Override
    public List<AdicionalDTO> getAdicionales() {
        return adicionalesDTO;
    }
}
