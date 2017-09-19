package com.anniema.mosquee.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
@MappedSuperclass
public class Evenement implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4948634897134195175L;
	
//	private Long id;
	private Periodicite periodicite;
	
	private TypeEvenement typeEvenement;
	private Date dateDebutEvenement;
	private Date datefinEvenement;
	private Date dateDebutAnnonce;
	
	private Membre responsable;
	
	
	public Evenement() {
		// TODO Auto-generated constructor stub
	}

//	@Id
//	@Column
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	public Long getId() {
//		return id;
//	}
//
//
//	public void setId(Long id) {
//		this.id = id;
//	}


	@ManyToOne
	public Periodicite getPeriodicite() {
		return periodicite;
	}


	public void setPeriodicite(Periodicite periodicite) {
		this.periodicite = periodicite;
	}


	@ManyToMany
	public TypeEvenement getTypeEvenement() {
		return typeEvenement;
	}


	public void setTypeEvenement(TypeEvenement typeEvenement) {
		this.typeEvenement = typeEvenement;
	}


	@Column
	public Date getDateDebutEvenement() {
		return dateDebutEvenement;
	}


	public void setDateDebutEvenement(Date dateDebutEvenement) {
		this.dateDebutEvenement = dateDebutEvenement;
	}


	@Column
	public Date getDatefinEvenement() {
		return datefinEvenement;
	}


	public void setDatefinEvenement(Date datefinEvenement) {
		this.datefinEvenement = datefinEvenement;
	}


	@Column
	public Date getDateDebutAnnonce() {
		return dateDebutAnnonce;
	}


	public void setDateDebutAnnonce(Date dateDebutAnnonce) {
		this.dateDebutAnnonce = dateDebutAnnonce;
	}


	@ManyToMany
	public Membre getResponsable() {
		return responsable;
	}


	public void setResponsable(Membre responsable) {
		this.responsable = responsable;
	}
	
	

}
