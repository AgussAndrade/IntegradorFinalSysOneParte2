package com.integradorFinalParte2.fabricaDeAutos.entities.autos;



import com.integradorFinalParte2.fabricaDeAutos.entities.adicionales.Adicional;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "auto")
public abstract class Auto {
    @Column(name = "precio_base")
    private double precioBase;
    @Column(name = "precio_final")
    private double precioFinal;

    @OneToMany(mappedBy = "auto",fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private List<Adicional> adicionales;

    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "modelo")
    private String modelo;

    public Auto (){
        setAdicionales(new ArrayList<Adicional>());
    }
    public void addAdicional(Adicional adicional){
        getAdicionales().add(adicional);
    }
    public double getPrecioFinal(){
        return precioFinal;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Adicional> getAdicionales() {
        return adicionales;
    }

    public void setAdicionales(List<Adicional> adicionales) {
        this.adicionales = adicionales;
    }


    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
