package fr.glm.stopWaisting.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.glm.stopWaisting.entities.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long>{

}
