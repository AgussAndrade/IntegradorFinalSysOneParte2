package com.integradorFinalParte2.fabricaDeAutos.dtos.autoDTOS;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.integradorFinalParte2.fabricaDeAutos.dtos.adicionalDTOS.AdicionalDTO;
import com.integradorFinalParte2.fabricaDeAutos.entities.autos.Auto;

import java.util.List;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "modelo")
@JsonSubTypes({@JsonSubTypes.Type(value = CoupeDTO.class, name = "Coupe"),
        @JsonSubTypes.Type(value = SedanDTO.class, name = "Sedan"),
        @JsonSubTypes.Type(value = FamiliarDTO.class, name = "Familiar")})
public interface AutoDTO {
    public Auto toAuto();
    public void setAdicionales(List<AdicionalDTO> adicionales);
    public List<AdicionalDTO> getAdicionales();

    public double getPrecioFinal();
    public double getPrecioBase();
    public void setPrecioBase(double precioBase);

    public void setPrecioFinal(double precioFinal) ;
}
