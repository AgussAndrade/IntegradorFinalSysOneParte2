package com.integradorFinalParte2.fabricaDeAutos.repositories;

import com.integradorFinalParte2.fabricaDeAutos.entities.adicionales.Adicional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface adicionalRepository extends CrudRepository<Adicional, Integer> {
}
