package com.integradorFinalParte2.fabricaDeAutos.repositories;

import com.integradorFinalParte2.fabricaDeAutos.entities.autos.Auto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface autoRepository extends CrudRepository<Auto,Integer> {
}
