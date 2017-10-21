package ma.ac.insea.restaurant.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ma.ac.insea.restaurant.entities.Categorie;
import ma.ac.insea.restaurant.services.CategorieService;

@Controller
@RequestMapping("/categorie")
public class CategorieController {
		
	@Autowired
	private CategorieService categorieService; 
	
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public String addPage(Model model) {
		model.addAttribute("categorie",new Categorie());
		return "categorie/add";
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String add(@ModelAttribute Categorie categorie, Model model) {
		categorieService.save(categorie);			
		return "redirect:list";
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public String find(Model model,@PathVariable("id") Long id) {
		model.addAttribute("categorie",this.categorieService.getById(id));
		return "categorie/add";
	}
	
	@RequestMapping(value="/remove/{id}",method=RequestMethod.GET)
	public String remove(@PathVariable("id") Long id, Model model) {
		this.categorieService.delete(id);
		//return "redirect:list";
		return "redirect:/categorie/list";
	}
	
	
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public String list(Model model) {
		List<Categorie> categories=categorieService.read();
		model.addAttribute("categories",categories);
		return "categorie/list";
	}

	
}
