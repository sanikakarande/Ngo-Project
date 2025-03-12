package com.example.NgoWebsite.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.NgoWebsite.services.AboutUsService;
//import org.springframework.web.bind.annotation.RestController;

@Controller

public class HomeController {
	
	
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("message","Welcome to our NGO!");
		return "index";
	}
	
	@Autowired
	private AboutUsService aboutUsService;
	 @GetMapping("/about")
	    public String showAbout(Model model) {
	        model.addAttribute("about", aboutUsService.getAboutUs());
	        model.addAttribute("message","Welcome to our NGO!");
	        return "about"; // Public about page
	    }
	
	 @GetMapping("/programs") 
	    public String programs(Model model) {
		 model.addAttribute("message","Welcome to our NGO!");
	        return "programs";
	    }
	 @GetMapping("/campaign") 
	    public String campaign(Model model) {
		 model.addAttribute("message","Welcome to our NGO!");
	        return "campaign";
	    }

	    @GetMapping("/resources") 
	    public String resources(Model model) {
	    	model.addAttribute("message","Welcome to our NGO!");
	        return "resources";
	    }

	    @GetMapping("/career") 
	    public String career(Model model) {
	    	model.addAttribute("message","Welcome to our NGO!");
	        return "career";
	    }

	    @GetMapping("/donate") 
	    public String donate(Model model) {
	    	model.addAttribute("message","Welcome to our NGO!");
	        return "donate";
	    }

	    @GetMapping("/contact") 
	    public String contact(Model model) {
	    	model.addAttribute("message","Welcome to our NGO!");
	        return "contact";
	    }
	    
	    
	
	
}
