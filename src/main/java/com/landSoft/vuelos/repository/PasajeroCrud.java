package com.landSoft.vuelos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.landSoft.vuelos.entity.Pasajero;

@Repository
public interface PasajeroCrud extends JpaRepository<Pasajero, Integer> {

	List<Pasajero> findByCcPasajero(Integer idpasajero);

	@Modifying
	@Query("update Pasajero p set p.nomPasajero = ?1, p.apellidoPasajero = ?2, p.idVuelo = ?3 where p.ccPasajero = ?4")
	Pasajero setUserInfoById(String nomPasajero, String apellidoPasajero, Integer idVuelo, Integer ccPasajero);

}
