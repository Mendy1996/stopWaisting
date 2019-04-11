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
public class PlusInvenduParMois implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_invendu;
	private Date date_invendu;
	@ManyToOne
	@JoinColumn(name="id_magasin")
	private Utilisateur id_magasin;
	@ManyToOne
	@JoinColumn(name="id_produit")
	private Produit id_produit;
	public PlusInvenduParMois() {
		super();
	}
	public PlusInvenduParMois(Date date_invendu, Utilisateur id_magasin, Produit id_produit) {
		super();
		this.date_invendu = date_invendu;
		this.id_magasin = id_magasin;
		this.id_produit = id_produit;
	}
	public Long getId_invendu() {
		return id_invendu;
	}
	public void setId_invendu(Long id_invendu) {
		this.id_invendu = id_invendu;
	}
	public Date getDate_invendu() {
		return date_invendu;
	}
	public void setDate_invendu(Date date_invendu) {
		this.date_invendu = date_invendu;
	}
	public Utilisateur getId_magasin() {
		return id_magasin;
	}
	public void setId_magasin(Utilisateur id_magasin) {
		this.id_magasin = id_magasin;
	}
	public Produit getId_produit() {
		return id_produit;
	}
	public void setId_produit(Produit id_produit) {
		this.id_produit = id_produit;
	}
	
	
	
	

}
