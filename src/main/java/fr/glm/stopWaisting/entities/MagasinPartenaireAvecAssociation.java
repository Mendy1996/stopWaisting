package fr.glm.stopWaisting.entities;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class MagasinPartenaireAvecAssociation implements Serializable  {


	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@NotNull
	private Utilisateur id_magasin;
	@NotNull
	private Utilisateur id_association;
	private Boolean partenaire;

	public MagasinPartenaireAvecAssociation() {
		super();
	}

	public MagasinPartenaireAvecAssociation(Utilisateur id_magasin, Utilisateur id_association, Boolean partenaire) {
		super();
		this.id_magasin = id_magasin;
		this.id_association = id_association;
		this.partenaire = partenaire;
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

	public Boolean getPartenaire() {
		return partenaire;
	}

	public void setPartenaire(Boolean partenaire) {
		this.partenaire = partenaire;
	}
	


	
	
	
	

}
