package fr.glm.stopWaisting.metierImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.glm.stopWaisting.dao.ProduitRepository;
import fr.glm.stopWaisting.dao.ProfilRepository;
import fr.glm.stopWaisting.entities.Produit;
import fr.glm.stopWaisting.entities.Profil;
import fr.glm.stopWaisting.metier.IappMetier;

/**
 * 
 * @author dlibii
 * 
 *@service permet de dire que cette classe est un bean ou objet spring et l'intancier
 *il y a 2 façon de faire l'injection des dependance : soit par le fichier xml ou par les annotations
 *
 *si on ne rajoute pas cette annotion @Service du coup l'injection @Autowired ne fonctionnera pas (c'est lié la classe doit
 *etre reconnu comme un objet Spring pour pouvoir effectuer une injection de @Autowired )
 */
@Service
public class IappMetierImpl implements IappMetier {

	/**
	 * je demande à spring d'injecter une implémentation de cette interface pour pouvoir utiliser la variable profilRepository
	 * sinon j'aurais un nullPointerException
	 */
	@Autowired
	ProfilRepository profilRepository;
	
	@Autowired
	ProduitRepository produitRepository;
	
	@Override
	public Profil ajouterProfil(Profil p) {
		return profilRepository.save(p);
	}

	@Override
	public List<Profil> listProfil() {
		return profilRepository.findAll();
	}
	
	@Override
	public List<Produit> listProduit() {
		return produitRepository.findAll();
	}

	@Override
	public List<Produit> listProduitCathegorie(int id) {
		// TODO Auto-generated method stub
		return produitRepository.findProduitCathegorie(id);
	}

}
