package com.landSoft.vuelos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.landSoft.vuelos.entity.Pasajero;
import com.landSoft.vuelos.repository.PasajeroCrud;

@Service
public class PasajeroService implements PasajeroServiceImp {

	@Autowired
	private PasajeroCrud pasajeroCrud;

	@Override
	public List<Pasajero> getAll() {

		return (List<Pasajero>) pasajeroCrud.findAll();
	}

	@Override
	public List<Pasajero> getByCcPasajero(int ccPasajero) {

		return pasajeroCrud.findByCcPasajero(ccPasajero);
	}

	@Override
	public Pasajero save(Pasajero pasajero) {
		return pasajeroCrud.save(pasajero);
	
	}

	@Override
	public void delete(int idpasajero) {
		pasajeroCrud.deleteById(idpasajero);
	}

	@Override
	public Pasajero update(String nombre, String apellido, int idVuelo, int ceduala ) {

		return pasajeroCrud.setUserInfoById(nombre, apellido, idVuelo, ceduala);
	}

	

}
