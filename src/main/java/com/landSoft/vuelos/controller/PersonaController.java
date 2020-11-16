package com.landSoft.vuelos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.landSoft.vuelos.entity.Pasajero;
import com.landSoft.vuelos.service.PasajeroService;

@RestController
@Controller
@RequestMapping("/personas")
public class PersonaController {
	
	@Autowired
	private PasajeroService pasajeroService;
	
	@GetMapping("/all")
	public List<Pasajero> getAll() {

		return (List<Pasajero>) pasajeroService.getAll();
	}
	@GetMapping("/{cc}")
	public List<Pasajero> getByCcPasajero(@PathVariable("cc")int ccPasajero) {

		return pasajeroService.getByCcPasajero(ccPasajero);
	}
	
	@PostMapping("/save")
	public Pasajero save(@RequestBody Pasajero pasajero) {

		return pasajeroService.save(pasajero);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id")int idpasajero) {
		pasajeroService.delete(idpasajero);
	}
	
	@PutMapping("/update")
	public Pasajero update(@RequestBody Pasajero pasajero ) {
		
		return pasajeroService.save(pasajero);
	}
	
}
