package fr.glm.stopWaisting.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class TransactionMagasinPartenaire implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_transaction;
	private Boolean accepter;
	@ManyToOne
	@JoinColumn(name="id_magasin")
	private Utilisateur id_magasin;
	@ManyToOne
	@JoinColumn(name="id_association")
	private Utilisateur id_association;
	@ManyToOne
	@JoinColumn(name="id_publication")
	private ProduitPublier id_publication;
	
	public TransactionMagasinPartenaire() {
		super();
	}
	public TransactionMagasinPartenaire(Boolean accepter, Utilisateur id_magasin, Utilisateur id_association,
			ProduitPublier id_publication) {
		super();
		this.accepter = accepter;
		this.id_magasin = id_magasin;
		this.id_association = id_association;
		this.id_publication = id_publication;
	}
	public Long getId_transaction() {
		return id_transaction;
	}
	public void setId_transaction(Long id_transaction) {
		this.id_transaction = id_transaction;
	}
	public Boolean getAccepter() {
		return accepter;
	}
	public void setAccepter(Boolean accepter) {
		this.accepter = accepter;
	}
	public Utilisateur getId_magasin() {
		return id_magasin;
	}
	public void setId_magasin(Utilisateur id_magasin) {
		this.id_magasin = id_magasin;
	}
	public Utilisateur getId_association() {
		return id_association;
	}
	public void setId_association(Utilisateur id_association) {
		this.id_association = id_association;
	}
	public ProduitPublier getId_publication() {
		return id_publication;
	}
	public void setId_publication(ProduitPublier id_publication) {
		this.id_publication = id_publication;
	}
	
	
	
	
	

}
