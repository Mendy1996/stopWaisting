package fr.glm.stopWaisting.metier;

import java.util.List;

import fr.glm.stopWaisting.entities.Profil;

public interface IappMetier {
	
	public Profil ajouterProfil(Profil p);
	public List<Profil> listProfil();

}
