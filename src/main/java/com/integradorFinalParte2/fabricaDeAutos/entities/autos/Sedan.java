package com.integradorFinalParte2.fabricaDeAutos.entities.autos;

public class Sedan extends Auto {
    public Sedan (){
        super();
        this.setPrecioBase( 230000);
        setModelo(this.getClass().getSimpleName());
    }
}
