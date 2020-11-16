package com.landSoft.vuelos.entity;

import java.sql.Time;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Vuelo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idvuelo;

	private Date fecha;
	
	private Time hora;
	
	@Column(name = "idestino")
	private Integer idDestino;
	
	
	@Column(name = "idorigen")
	private Integer idOrigen;
	
	@OneToMany(mappedBy = "vuelo")
	private List<Pasajero> pasajeros;


	public Integer getIdvuelo() {
		return idvuelo;
	}


	public void setIdvuelo(Integer idvuelo) {
		this.idvuelo = idvuelo;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public Time getHora() {
		return hora;
	}


	public void setHora(Time hora) {
		this.hora = hora;
	}


	public Integer getIdDestino() {
		return idDestino;
	}


	public void setIdDestino(Integer idDestino) {
		this.idDestino = idDestino;
	}


	public Integer getIdOrigen() {
		return idOrigen;
	}


	public void setIdOrigen(Integer idOrigen) {
		this.idOrigen = idOrigen;
	}
	

}
