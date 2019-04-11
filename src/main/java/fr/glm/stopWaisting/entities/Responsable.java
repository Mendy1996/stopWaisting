package fr.glm.stopWaisting.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Responsable implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_responsable;
	private String nom_responsable;
	private String prenom_responsable;
	private String contact_responsable;
	
	public Responsable() {
		super();
	}
	public Responsable(String nom_responsable, String prenom_responsable, String contact_responsable) {
		super();
		this.nom_responsable = nom_responsable;
		this.prenom_responsable = prenom_responsable;
		this.contact_responsable = contact_responsable;
	}
	public Long getId_responsable() {
		return id_responsable;
	}
	public void setId_responsable(Long id_responsable) {
		this.id_responsable = id_responsable;
	}
	public String getNom_responsable() {
		return nom_responsable;
	}
	public void setNom_responsable(String nom_responsable) {
		this.nom_responsable = nom_responsable;
	}
	public String getPrenom_responsable() {
		return prenom_responsable;
	}
	public void setPrenom_responsable(String prenom_responsable) {
		this.prenom_responsable = prenom_responsable;
	}
	public String getContact_responsable() {
		return contact_responsable;
	}
	public void setContact_responsable(String contact_responsable) {
		this.contact_responsable = contact_responsable;
	}
	
	
	

}
