package com.integradorFinalParte2.fabricaDeAutos.dtos.adicionalDTOS;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.integradorFinalParte2.fabricaDeAutos.entities.adicionales.*;


@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "tipo")
@JsonSubTypes({@JsonSubTypes.Type(value = AirbagDTO.class, name = "Airbag"),
        @JsonSubTypes.Type(value = TechoCorredizoDTO.class, name = "TechoCorredizo"),
        @JsonSubTypes.Type(value = SistemaDeFrenosDTO.class, name = "SistemaDeFrenos"),
        @JsonSubTypes.Type(value = AireAcondicionadoDTO.class, name = "AireAcondicionado"),
        @JsonSubTypes.Type(value = LlantasDeAleacionDTO.class, name = "LlantasDeAleacion")})
public interface AdicionalDTO {
    public Adicional ToAdicional();

    public double getPrecioBase();
    public void setPrecioBase(double precioBase);


}
