package fr.glm.stopWaisting.metier;

import java.util.List;

import fr.glm.stopWaisting.entities.Produit;
import fr.glm.stopWaisting.entities.Profil;

public interface IappMetier {
	
	public Profil ajouterProfil(Profil p);
	public List<Profil> listProfil();
	public List<Produit> listProduit();
	public List<Produit> listProduitCathegorie(int id);

}
