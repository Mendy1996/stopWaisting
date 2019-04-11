package fr.glm.stopWaisting.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UtilisateurProfil implements Serializable {


	private static final long serialVersionUID = 1L;
	
	@Id
	private String userName;
	@Id
	private String profilName;
	
	public UtilisateurProfil() {
		super();
	}
	public UtilisateurProfil(String userName, String profilName) {
		super();
		this.userName = userName;
		this.profilName = profilName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getProfilName() {
		return profilName;
	}
	public void setProfilName(String profilName) {
		this.profilName = profilName;
	}
	
	

}
