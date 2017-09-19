package com.anniema.mosquee.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="horaire")
public class Horaire implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4851952777106441683L;
	
	private Long id;
	private String jour;
	private String heureDebut;
	private String heureFin;
	
	private String consignes;
	
	public Horaire() {
		// TODO Auto-generated constructor stub
	}

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column
	public String getJour() {
		return jour;
	}

	public void setJour(String jour) {
		this.jour = jour;
	}

	@Column
	public String getHeureDebut() {
		return heureDebut;
	}

	public void setHeureDebut(String heureDebut) {
		this.heureDebut = heureDebut;
	}

	@Column
	public String getHeureFin() {
		return heureFin;
	}

	public void setHeureFin(String heureFin) {
		this.heureFin = heureFin;
	}

	@Column
	public String getConsignes() {
		return consignes;
	}

	public void setConsignes(String consignes) {
		this.consignes = consignes;
	}
	
	
}
