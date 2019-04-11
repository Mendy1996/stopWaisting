package fr.glm.stopWaisting.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Produit implements Serializable  {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_produit;
	private String libelle_produit;
	private String description_produit;
	private Date dlc;
	private int pourcentage_solde;
	private String photo;
	@ManyToOne
	@JoinColumn(name="id_cat_Produit")
	private CategorieProduit id_cat_Produit;
	
	public Produit() {
		super();
	}
	public Produit(String libelle_produit, String description_produit, Date dlc, int pourcentage_solde, String photo,
			CategorieProduit id_cat_Produit) {
		super();
		this.libelle_produit = libelle_produit;
		this.description_produit = description_produit;
		this.dlc = dlc;
		this.pourcentage_solde = pourcentage_solde;
		this.photo = photo;
		this.id_cat_Produit = id_cat_Produit;
	}
	public Long getId_produit() {
		return id_produit;
	}
	public void setId_produit(Long id_produit) {
		this.id_produit = id_produit;
	}
	public String getLibelle_produit() {
		return libelle_produit;
	}
	public void setLibelle_produit(String libelle_produit) {
		this.libelle_produit = libelle_produit;
	}
	public String getDescription_produit() {
		return description_produit;
	}
	public void setDescription_produit(String description_produit) {
		this.description_produit = description_produit;
	}
	public Date getDlc() {
		return dlc;
	}
	public void setDlc(Date dlc) {
		this.dlc = dlc;
	}
	public int getPourcentage_solde() {
		return pourcentage_solde;
	}
	public void setPourcentage_solde(int pourcentage_solde) {
		this.pourcentage_solde = pourcentage_solde;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public CategorieProduit getId_cat_Produit() {
		return id_cat_Produit;
	}
	public void setId_cat_Produit(CategorieProduit id_cat_Produit) {
		this.id_cat_Produit = id_cat_Produit;
	}
	
	
}
