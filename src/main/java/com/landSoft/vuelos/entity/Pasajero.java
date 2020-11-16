package com.landSoft.vuelos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "pasajero")
public class Pasajero {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Integer idpasajero;
	
	@Column(name = "cc_pasajero")
	private Integer ccPasajero;
	
	@Column(name = "nom_pasajero")
	private String nomPasajero;
	
	@Column(name="apellido_pasajero")
	private String apellidoPasajero;
	
	@Column( name = "idvuelo")
	private Integer idVuelo;
	
	
	@ManyToOne
	@JoinColumn(name = "idvuelo", insertable = false, updatable = false)
	private Vuelo vuelo;
	
	public Integer getIdpasajero() {
		return idpasajero;
	}

	public void setIdpasajero(Integer idpasajero) {
		this.idpasajero = idpasajero;
	}

	public Integer getCcPasajero() {
		return ccPasajero;
	}

	public void setCcPasajero(Integer ccPasajero) {
		this.ccPasajero = ccPasajero;
	}

	public String getNomPasajero() {
		return nomPasajero;
	}

	public void setNomPasajero(String nomPasajero) {
		this.nomPasajero = nomPasajero;
	}

	public String getApellidoPasajero() {
		return apellidoPasajero;
	}

	public void setApellidoPasajero(String apellidoPasajero) {
		this.apellidoPasajero = apellidoPasajero;
	}

	public Integer getIdVuelo() {
		return idVuelo;
	}

	public void setIdvuelo(Integer idVuelo) {
		this.idVuelo = idVuelo;
	}

	
	
	
}
