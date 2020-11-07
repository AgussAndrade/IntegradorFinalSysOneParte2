package com.integradorFinalParte2.fabricaDeAutos.entities.adicionales;

import com.integradorFinalParte2.fabricaDeAutos.entities.autos.Auto;

import javax.persistence.*;

@Entity
@Table(name = "adicional")
public class TechoCorredizo implements Adicional {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "precio_base")
    private double precioBase;

    @Column(name = "tipo")
    private String tipo;
    @ManyToOne
    @JoinColumn(name = "id_auto", referencedColumnName = "id")
    private Auto auto;
    public TechoCorredizo(){
        precioBase = 12000;
        setTipo(this.getClass().getSimpleName());
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public double getPrecioBase() {
        return precioBase;
    }

    @Override
    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
