package com.integradorFinalParte2.fabricaDeAutos.services;

import com.integradorFinalParte2.fabricaDeAutos.dtos.adicionalDTOS.AdicionalDTO;
import com.integradorFinalParte2.fabricaDeAutos.entities.adicionales.Adicional;
import org.hibernate.service.spi.ServiceException;

public interface AdicionalService {

    void ingresarAdicional(AdicionalDTO adicional);

    AdicionalDTO consultarAdicional(Integer id) ;


    void modificarAdicional(AdicionalDTO adicional, Integer id) throws ServiceException;

    void eliminarAdicional(Integer id);
}
