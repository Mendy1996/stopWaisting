package fr.glm.stopWaisting.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.glm.stopWaisting.entities.Profil;
/**
 * 
 * @author dlibii
 * JpaRepository va implementer SpringData qui contient les methodes CRUD necessaire l'objet ou la classe profil
 * architecture complete on a : couche DAO qui regroupe et chacune implement la couche en dessous 
 * (Etitiy >JPARepository > Spring data > JPA > Hibernate > JDBC)
 */
public interface ProfilRepository extends JpaRepository<Profil, Long> {

}
