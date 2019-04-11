package fr.glm.stopWaisting.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CategorieProduit implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_cat_Produit;
	
	private String libelle_produit;
	public CategorieProduit() {
		super();
	}
	public CategorieProduit(String libelle_produit) {
		super();
		this.libelle_produit = libelle_produit;
	}
	public Long getId_cat_Produit() {
		return id_cat_Produit;
	}
	public void setId_cat_Produit(Long id_cat_Produit) {
		this.id_cat_Produit = id_cat_Produit;
	}
	public String getLibelle_produit() {
		return libelle_produit;
	}
	public void setLibelle_produit(String libelle_produit) {
		this.libelle_produit = libelle_produit;
	}
	
	
	
	
	

}
