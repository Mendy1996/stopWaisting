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
public class Blog implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_blog ;
	private String contenu;
	private Date date_creation;
	private Date date_modification;
	/**
	 * Récuperer la clé primaire  dans la table utilisateur pour en faire une clé oetrangere dans blog
	 */
	@ManyToOne
	@JoinColumn(name="id_abonne")
	private Utilisateur utilisateur;
	public Blog() {
		super();
	}
	public Blog(String contenu, Date date_creation, Date date_modification, Utilisateur utilisateur) {
		super();
		this.contenu = contenu;
		this.date_creation = date_creation;
		this.date_modification = date_modification;
		this.utilisateur = utilisateur;
	}
	public Long getId_blog() {
		return id_blog;
	}
	public void setId_blog(Long id_blog) {
		this.id_blog = id_blog;
	}
	public String getContenu() {
		return contenu;
	}
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}
	public Date getDate_creation() {
		return date_creation;
	}
	public void setDate_creation(Date date_creation) {
		this.date_creation = date_creation;
	}
	public Date getDate_modification() {
		return date_modification;
	}
	public void setDate_modification(Date date_modification) {
		this.date_modification = date_modification;
	}
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	
	
	

}
