package com.integradorFinalParte2.fabricaDeAutos.entities.autos;

public class Coupe extends Auto {
    public Coupe(){
        super();
        this.setPrecioBase( 270000);
        setModelo(this.getClass().getSimpleName());
    }
}
