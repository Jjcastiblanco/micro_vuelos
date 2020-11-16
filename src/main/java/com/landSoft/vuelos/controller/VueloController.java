package com.landSoft.vuelos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.landSoft.vuelos.entity.Vuelo;
import com.landSoft.vuelos.repository.VueloCrud;


@RestController
@Controller
@RequestMapping("/vuelo")
public class VueloController {
	
	@Autowired
	private VueloCrud vueloCrud;
	
	
	
	@GetMapping("/all")
	public List<Vuelo> getAll() {

		return vueloCrud.findAll();
	}

}
