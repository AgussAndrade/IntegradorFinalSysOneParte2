package com.integradorFinalParte2.fabricaDeAutos.services.impl;


import com.integradorFinalParte2.fabricaDeAutos.dtos.adicionalDTOS.AdicionalDTO;
import com.integradorFinalParte2.fabricaDeAutos.entities.adicionales.Adicional;
import com.integradorFinalParte2.fabricaDeAutos.repositories.AdicionalRepository;
import com.integradorFinalParte2.fabricaDeAutos.services.AdicionalService;
import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdicionalServiceImpl implements AdicionalService {
    @Autowired
    private AdicionalRepository adicionalDAO;


    @Override
    public void ingresarAdicional(AdicionalDTO adicional){
        adicionalDAO.save( (adicional.ToAdicional()));


    }
    @Override
    public AdicionalDTO consultarAdicional(Integer id) throws ServiceException {
            return ( adicionalDAO.findById(id).get().toDTO() );
    }


    @Override
    public void modificarAdicional(AdicionalDTO adicional, Integer id) throws ServiceException {
        Adicional ad = adicional.ToAdicional();
        ad.setId(id);
        adicionalDAO.save(ad);
    }

    @Override
    public void eliminarAdicional(Integer id) {
        adicionalDAO.deleteById(id);

    }


}
