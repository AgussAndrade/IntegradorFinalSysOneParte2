package com.integradorFinalParte2.fabricaDeAutos.controllers;

import com.integradorFinalParte2.fabricaDeAutos.dtos.adicionalDTOS.AdicionalDTO;
import com.integradorFinalParte2.fabricaDeAutos.dtos.autoDTOS.AutoDTO;
import com.integradorFinalParte2.fabricaDeAutos.entities.autos.Auto;
import com.integradorFinalParte2.fabricaDeAutos.services.AutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping(value = "/autos")
public class AutoController {
    @Autowired
    private AutoService autoService;

    @GetMapping
    public List<AutoDTO> listar(@RequestParam(name = "id",required = false,defaultValue = "") Integer id){
        if(null == id) {
            return autoService.consultarAutos();
        }
        List<AutoDTO> autos = new ArrayList<>();
        autos.add(autoService.consultarAuto(id));
        return autos;
    }

    @PostMapping
    public void insertar(@RequestBody AutoDTO auto){
        autoService.ingresarAuto(auto);
    }

    @PutMapping(value = "/{id}")
    public void modificar(@RequestBody AutoDTO auto, @PathVariable("id") Integer id){
        autoService.modificarAuto(auto,id);
    }

    @DeleteMapping(value = "/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        autoService.eliminarAuto(id);
    }

    @RequestMapping(value = "/getPrecioFinal/{id}")
    public Double precioFinal(@PathVariable("id")Integer id){
        return autoService.precioFinal(id);
    }
}
