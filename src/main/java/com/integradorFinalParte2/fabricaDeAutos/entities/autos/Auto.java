package com.integradorFinalParte2.fabricaDeAutos.entities.autos;



import com.integradorFinalParte2.fabricaDeAutos.dtos.adicionalDTOS.AdicionalDTO;
import com.integradorFinalParte2.fabricaDeAutos.dtos.autoDTOS.AutoDTO;
import com.integradorFinalParte2.fabricaDeAutos.entities.adicionales.Adicional;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "auto")
@DiscriminatorColumn(name="modelo")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Auto {
    @Column(name = "precio_base")
    private double precioBase;
    @Column(name = "precio_total")
    private double precioFinal;

    @OneToMany(mappedBy = "auto",fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private List<Adicional> adicionales;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


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

    public abstract AutoDTO toDTO();

    protected AutoDTO formarAuto(AutoDTO auto){
        List<AdicionalDTO> adicionalDTOS = new ArrayList<>();
        for(Adicional adicional : this.getAdicionales()){
            adicionalDTOS.add(adicional.toDTO());
        }
        auto.setPrecioBase(getPrecioBase());
        auto.setAdicionales(adicionalDTOS);
        auto.setPrecioFinal(this.getPrecioFinal());
        return auto;

    }
}
