package fr.glm.stopWaisting.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.glm.stopWaisting.entities.CategorieProduit;

public interface CategorieProduitRepository extends JpaRepository<CategorieProduit, Long> {

}
