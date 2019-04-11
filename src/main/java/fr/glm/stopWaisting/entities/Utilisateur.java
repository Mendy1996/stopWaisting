package fr.glm.stopWaisting.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Utilisateur implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_utilisateur;
	private String raison_sociale;
	private String adresse;
	private int codePostal;
	private String ville;
	private String telephone;
	private String courriel;
	private String motDePass;
	private String logo;
	private Boolean active;
	@ManyToOne
	@JoinColumn(name="id_responsable")
	private Responsable id_responsable;
	@ManyToOne
	@JoinColumn(name="id_Profil")
	private Profil id_Profil;
	@OneToMany(mappedBy="id_magasin",fetch=FetchType.LAZY)
	private Collection<ProduitPublier> produitSPublie;
	@OneToMany(mappedBy="id_magasin",fetch=FetchType.LAZY)
	private Collection<PlusInvenduParMois> listPlusInvenduParMois;
	
	public Utilisateur() {
		super();
	}
	public Utilisateur(String raison_sociale, String adresse, int codePostal, String ville, String telephone,
			String courriel, String motDePass, String logo, Responsable id_responsable, Profil id_Profil) {
		super();
		this.raison_sociale = raison_sociale;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.ville = ville;
		this.telephone = telephone;
		this.courriel = courriel;
		this.motDePass = motDePass;
		this.logo = logo;
		this.id_responsable = id_responsable;
		this.id_Profil = id_Profil;
	}
	public Long getId_utilisateur() {
		return id_utilisateur;
	}
	public void setId_utilisateur(Long id_utilisateur) {
		this.id_utilisateur = id_utilisateur;
	}
	public String getRaison_sociale() {
		return raison_sociale;
	}
	public void setRaison_sociale(String raison_sociale) {
		this.raison_sociale = raison_sociale;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public int getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getCourriel() {
		return courriel;
	}
	public void setCourriel(String courriel) {
		this.courriel = courriel;
	}
	public String getMotDePass() {
		return motDePass;
	}
	public void setMotDePass(String motDePass) {
		this.motDePass = motDePass;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public Responsable getId_responsable() {
		return id_responsable;
	}
	public void setId_responsable(Responsable id_responsable) {
		this.id_responsable = id_responsable;
	}
	public Profil getId_Profil() {
		return id_Profil;
	}
	public void setId_Profil(Profil id_Profil) {
		this.id_Profil = id_Profil;
	}
	public Collection<ProduitPublier> getProduitSPublie() {
		return produitSPublie;
	}
	public void setProduitSPublie(Collection<ProduitPublier> produitSPublie) {
		this.produitSPublie = produitSPublie;
	}
	public Collection<PlusInvenduParMois> getListPlusInvenduParMois() {
		return listPlusInvenduParMois;
	}
	public void setListPlusInvenduParMois(Collection<PlusInvenduParMois> listPlusInvenduParMois) {
		this.listPlusInvenduParMois = listPlusInvenduParMois;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	
	
	

}
