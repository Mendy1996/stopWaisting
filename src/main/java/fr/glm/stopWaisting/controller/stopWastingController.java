package fr.glm.stopWaisting.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.glm.stopWaisting.entities.Produit;
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
	//@RequestMapping("/")
	//@GetMapping("/")
	public String index(){
		return "pages/home";
	}
	
	@GetMapping("/")
	public String doHome(@RequestParam(defaultValue="Acceuil" ,required = false) String name , ModelMap modelMap) {
		/**String name= request.getParameter("name") != null && !request.getParameter("name").isEmpty()
				? request.getParameter("name")
				:"Ya rien";**/
		//return "jsp/index";
		List<Produit>lesProduit= appMetierImpl.listProduitCathegorie(1);
				modelMap.put("listProduit", lesProduit);
		return "pages/home";
	}
}
