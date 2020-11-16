package com.landSoft.vuelos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.landSoft.vuelos.entity.Vuelo;

public interface VueloCrud extends JpaRepository<Vuelo, Integer> {

}
