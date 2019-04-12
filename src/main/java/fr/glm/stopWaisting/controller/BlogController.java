package fr.glm.stopWaisting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author dlibii
 *
 */
@Controller
public class BlogController {

	@RequestMapping("/blog")
	public String blog(){
		return "/pages/blog/homeBlog";
	}
}
