package fr.glm.stopWaisting.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.glm.stopWaisting.metierImpl.IappMetierImpl;


/**
 * 
 * @author dlibii
 *
 *le controller a besoin de la couche métier du coup on utilise @Autowired pour injecter l'implementation de appMetierImpl
 */
@Controller
public class stopWastingController {

	@Autowired
	private IappMetierImpl appMetierImpl;
	
	/**
	 * permet de retouner une vue html
	 * 
	 * @return home.html
	 */
	//url pour acceder à ma page
	@RequestMapping("/stopWasting")
	//@GetMapping("/")
	public String index(){
		return "pages/home";
	}
}
