package com.integradorFinalParte2.fabricaDeAutos.controllers;

import com.integradorFinalParte2.fabricaDeAutos.dtos.adicionalDTOS.AdicionalDTO;
import com.integradorFinalParte2.fabricaDeAutos.entities.adicionales.Adicional;
import com.integradorFinalParte2.fabricaDeAutos.services.AdicionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/adicional")
public class AdicionalController {
    @Autowired
    private AdicionalService adicionalService;
    @GetMapping(value = "/{id}")
    public AdicionalDTO getAdicional(@PathVariable("id") Integer id){
        return  adicionalService.consultarAdicional(id);
    }
    @PostMapping
    public void insertar(@RequestBody AdicionalDTO adicionalDTO){
        adicionalService.ingresarAdicional(adicionalDTO);
    }
    @PutMapping(value = "/{id}")
    public void modificar(@RequestBody AdicionalDTO adicional, @PathVariable("id") Integer id){
        // me parece lo mejor que el cliente sepa que id quiere modificar por si mismo,
        //porque si no hay que agregarle id a los dto o no trabajar con dto
        adicionalService.modificarAdicional(adicional,id);
    }
    @DeleteMapping(value = "/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        adicionalService.eliminarAdicional(id);
    }
}
