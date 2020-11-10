package com.integradorFinalParte2.fabricaDeAutos.services.impl;

import com.integradorFinalParte2.fabricaDeAutos.dtos.autoDTOS.AutoDTO;
import com.integradorFinalParte2.fabricaDeAutos.entities.adicionales.Adicional;
import com.integradorFinalParte2.fabricaDeAutos.entities.autos.Auto;
import com.integradorFinalParte2.fabricaDeAutos.repositories.AdicionalRepository;
import com.integradorFinalParte2.fabricaDeAutos.repositories.AutoRepository;
import com.integradorFinalParte2.fabricaDeAutos.services.AutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AutoServiceImpl implements AutoService {
    @Autowired
    AutoRepository autoDAO;

    @Autowired
    AdicionalRepository adicionalDAO;
    @Override
    public void ingresarAuto(AutoDTO autoDTO) {
        Auto auto = autoDTO.toAuto();
        auto.setPrecioFinal(getPrecioFinal(auto));
        autoDAO.save(auto);
        for(Adicional adicional : auto.getAdicionales()){
            adicional.setAuto(auto);
            adicionalDAO.save(adicional);
        }

    }

    @Override
    public AutoDTO consultarAuto(Integer id){
        return (autoDAO.findById(id).get().toDTO());
    }

    @Override
    public void modificarAuto(AutoDTO autoDTO, Integer id) {
        Auto auto  = autoDTO.toAuto();
        auto.setId(id);
        auto.setPrecioFinal(getPrecioFinal(auto));
        autoDAO.save(auto);
        for(Adicional adicional : auto.getAdicionales()){
            adicional.setAuto(auto);
            adicionalDAO.save(adicional);
        }

    }

    @Override
    public void eliminarAuto(Integer id){
        autoDAO.deleteById(id);
    }

    @Override
    public Double precioFinal(Integer id) {
        Auto auto = autoDAO.findById(id).get();
        return this.getPrecioFinal( auto);
    }

    private Double getPrecioFinal(Auto auto) {
        double toReturn =0;
        for(Adicional adicional : auto.getAdicionales()){
            toReturn += adicional.getPrecioBase();
        }
        toReturn += auto.getPrecioBase();
        return toReturn;
    }

    @Override
    public List<AutoDTO> consultarAutos() {
        List<AutoDTO> autos = new ArrayList<>();
        autoDAO.findAll().forEach(auto -> autos.add(auto.toDTO()));
        return autos;
    }
}
