package fr.glm.stopWaisting.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.glm.stopWaisting.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
