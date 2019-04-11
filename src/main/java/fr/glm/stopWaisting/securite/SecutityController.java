package fr.glm.stopWaisting.securite;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecutityController {
	
	@RequestMapping(value="/login")
	public String login(){
		return "pages/login";
	}

	@RequestMapping(value="/")
	public String home(){
		return "redirect:/login";
	}
	
	@RequestMapping(value="/403")
	public String accesRefuse(){
		return "pages/403";
	}
}
