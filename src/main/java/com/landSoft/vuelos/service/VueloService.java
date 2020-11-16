package com.landSoft.vuelos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.landSoft.vuelos.entity.Vuelo;
import com.landSoft.vuelos.repository.VueloCrud;


@Service
public class VueloService implements VueloServiceImp {
	
	@Autowired
	private VueloCrud vueloCrud;

	@Override
	public List<Vuelo> getAll() {
		
		return vueloCrud.findAll();
	}

}
