package fr.glm.stopWaisting.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Profil implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_Profil;
	private String nom;
	
	public Profil() {
		super();
	}

	public Profil(String nom) {
		super();
		this.nom = nom;
	}

	public Long getId_Profil() {
		return id_Profil;
	}

	public void setId_Profil(Long id_Profil) {
		this.id_Profil = id_Profil;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
	

}
