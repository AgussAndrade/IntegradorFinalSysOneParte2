package com.integradorFinalParte2.fabricaDeAutos.entities.adicionales;

import com.integradorFinalParte2.fabricaDeAutos.entities.autos.Auto;

import javax.persistence.*;

@Entity
@Table(name = "adicional")
public class AireAcondicionado implements Adicional {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "tipo")
    private String tipo;
    @Column(name = "precio_base")
    private double precioBase;
    @ManyToOne
    @JoinColumn(name = "id_auto", referencedColumnName = "id")
    private Auto auto;

    public AireAcondicionado(){
        setTipo(this.getClass().getSimpleName());
        this.precioBase =20000;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
