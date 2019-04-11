package fr.glm.stopWaisting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import fr.glm.stopWaisting.dao.ProfilRepository;
import fr.glm.stopWaisting.entities.Profil;

/**
 * 
 * @author dlibii
 *
 */
@SpringBootApplication
// pour utiliser run il faut implementer implements CommandLineRunner
public class StopWaistingApplication {

	/**
	 * il exisite 2 façons de tester l'application soin par injection avec la
	 * methode RUN ou en instanciant soi-meme avec la methode Main
	 * 
	 */
	@Autowired
	private ProfilRepository profilRepository;

	public static void main(String[] args) {
		SpringApplication.run(StopWaistingApplication.class, args);
		/**
		 * ApplicationContext ctx= //
		 * SpringApplication.run(StopWaistingApplication.class, args); //
		 * ProfilRepository profilRepository = //
		 * ctx.getBean(ProfilRepository.class); profilRepository.save(new
		 * Profil("Magasin"));
		 **/
	}

	/**
	 * @Override public void run(String... args) throws Exception {
	 * 
	 *           //retourne un objet Profil p1 =profilRepository.save(new
	 *           Profil("Magasin")); Profil p2 = profilRepository.save(new
	 *           Profil("Abonne")); Profil p3 =profilRepository.save(new
	 *           Profil("Association")); }
	 **/

}
