package com.integradorFinalParte2.fabricaDeAutos.services;



import com.integradorFinalParte2.fabricaDeAutos.dtos.autoDTOS.AutoDTO;
import com.integradorFinalParte2.fabricaDeAutos.entities.autos.Auto;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

public interface AutoService {
    void ingresarAuto(AutoDTO auto);

    AutoDTO consultarAuto(Integer id) ;


    void modificarAuto(AutoDTO auto, Integer id);

    void eliminarAuto(Integer id) ;

    Double precioFinal(Integer id);

    List<AutoDTO> consultarAutos() ;
}
