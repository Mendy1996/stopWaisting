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
public class ProduitPublier implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_publication;
	private Date date_publication;
	private Boolean disponible;
	private Double quantite;
	private Date date_fin;
	private Date jour_retrait_invendu;
	@ManyToOne
	@JoinColumn(name="id_magasin")
	private Utilisateur id_magasin;
	@ManyToOne
	@JoinColumn(name="id_produit")
	private Utilisateur id_produit;
	
	public ProduitPublier() {
		super();
	}

	public ProduitPublier(Date date_publication, Boolean disponible, Double quantite, Date date_fin,
			Date jour_retrait_invendu, Utilisateur id_magasin, Utilisateur id_produit) {
		super();
		this.date_publication = date_publication;
		this.disponible = disponible;
		this.quantite = quantite;
		this.date_fin = date_fin;
		this.jour_retrait_invendu = jour_retrait_invendu;
		this.id_magasin = id_magasin;
		this.id_produit = id_produit;
	}

	public Long getId_publication() {
		return id_publication;
	}

	public void setId_publication(Long id_publication) {
		this.id_publication = id_publication;
	}

	public Date getDate_publication() {
		return date_publication;
	}

	public void setDate_publication(Date date_publication) {
		this.date_publication = date_publication;
	}

	public Boolean getDisponible() {
		return disponible;
	}

	public void setDisponible(Boolean disponible) {
		this.disponible = disponible;
	}

	public Double getQuantite() {
		return quantite;
	}

	public void setQuantite(Double quantite) {
		this.quantite = quantite;
	}

	public Date getDate_fin() {
		return date_fin;
	}

	public void setDate_fin(Date date_fin) {
		this.date_fin = date_fin;
	}

	public Date getJour_retrait_invendu() {
		return jour_retrait_invendu;
	}

	public void setJour_retrait_invendu(Date jour_retrait_invendu) {
		this.jour_retrait_invendu = jour_retrait_invendu;
	}

	public Utilisateur getId_magasin() {
		return id_magasin;
	}

	public void setId_magasin(Utilisateur id_magasin) {
		this.id_magasin = id_magasin;
	}

	public Utilisateur getId_produit() {
		return id_produit;
	}

	public void setId_produit(Utilisateur id_produit) {
		this.id_produit = id_produit;
	}
	
	
	

}
