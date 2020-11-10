package com.integradorFinalParte2.fabricaDeAutos.repositories;

import com.integradorFinalParte2.fabricaDeAutos.entities.autos.Auto;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoRepository extends CrudRepository<Auto,Integer> {
//    @Modifying
//    @Query("update auto set  precio_final = ?2, precio_base = ?1 where id = ?3")
//    void setadicionalInfoById(Double precio_base,Double precio_final, Integer id);
}
