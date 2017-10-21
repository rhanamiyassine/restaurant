package ma.ac.insea.restaurant.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ma.ac.insea.restaurant.entities.Utilisateur;
import ma.ac.insea.restaurant.services.UtilisateurService;

@Controller
public class UtilisateurController {
		
	@Autowired
	private UtilisateurService utilisateurService; 
	
	@RequestMapping(value="user/add",method=RequestMethod.GET)
	public String addPage() {
		return "utilisateur/add";
	}
	
	@RequestMapping(value="user/add",method=RequestMethod.POST)
	public String add() {
		System.out.println("please");
		return "utilisateur/list";
	}
	
	@RequestMapping(value="users",method=RequestMethod.GET)
	public String getUser() {
		return "utilisateur/list";
	}

	
}
