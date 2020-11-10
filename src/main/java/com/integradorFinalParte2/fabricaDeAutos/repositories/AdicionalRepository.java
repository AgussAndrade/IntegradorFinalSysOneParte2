package com.integradorFinalParte2.fabricaDeAutos.repositories;

import com.integradorFinalParte2.fabricaDeAutos.entities.adicionales.Adicional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AdicionalRepository extends CrudRepository<Adicional, Integer> {
//    @Modifying
//    @Query("update adicional set id_auto = ?2, precio_base = ?1 where id = ?3")
//    public void setadicionalInfoById(Double precio_base, Integer id_auto, Integer id);
}
