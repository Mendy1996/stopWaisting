package fr.glm.stopWaisting.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import fr.glm.stopWaisting.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
	
	@Query("SELECT p FROM Produit p WHERE id_cat_produit=:id")
	List<Produit> findProduitCathegorie(@Param("id") int id);

}
