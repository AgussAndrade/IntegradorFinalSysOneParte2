package com.integradorFinalParte2.fabricaDeAutos.entities.autos;

public class Familiar extends Auto {
    public Familiar(){
        super();
        this.setPrecioBase(24500);
        setModelo(this.getClass().getSimpleName());

    }
}
