package com.anniema.mosquee.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="cours")
public class Cours extends Evenement {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5387871163139123404L;

	private Long id;
	private String libelleCours;
	private String pourPublic;
	private List<Horaire> horaires;
	
	public Cours() {
		horaires = new ArrayList<Horaire>();
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
	public String getLibelleCours() {
		return libelleCours;
	}

	public void setLibelleCours(String libelleCours) {
		this.libelleCours = libelleCours;
	}

	@Column
	public String getPourPublic() {
		return pourPublic;
	}

	public void setPourPublic(String pourPublic) {
		this.pourPublic = pourPublic;
	}

	@OneToMany
	public List<Horaire> getHoraires() {
		return horaires;
	}

	public void setHoraires(List<Horaire> horaires) {
		this.horaires = horaires;
	}
	
	
}
