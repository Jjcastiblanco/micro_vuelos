package com.landSoft.vuelos.service;

import java.util.List;


import com.landSoft.vuelos.entity.Pasajero;


public interface PasajeroServiceImp  {



	public List<Pasajero> getAll(); 

	public List<Pasajero> getByCcPasajero(int ccPasajero);

	public Pasajero save(Pasajero pasajero); 
	
	public Pasajero update(String nombre, String apellido, int idVuelo, int ceduala );
	
	public void delete(int idpasajero);

	

}
