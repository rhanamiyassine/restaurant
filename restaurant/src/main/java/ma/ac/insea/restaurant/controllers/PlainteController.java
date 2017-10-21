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

import ma.ac.insea.restaurant.entities.Plainte;
import ma.ac.insea.restaurant.services.PlainteService;

@Controller
@RequestMapping("/plainte")
public class PlainteController {
		
	@Autowired
	private PlainteService plainteService; 
	
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public String addPage(Model model) {
		model.addAttribute("plainte",new Plainte());
		return "plainte/add";
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String add(@ModelAttribute Plainte plainte, Model model) {
		plainteService.save(plainte);	
		
		return "redirect:list";
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public String find(Model model,@PathVariable("id") Long id) {
		model.addAttribute("plainte",this.plainteService.getById(id));
		return "plainte/add";
	}
	
	@RequestMapping(value="/remove/{id}",method=RequestMethod.GET)
	public String remove(@PathVariable("id") Long id, Model model) {
		this.plainteService.delete(id);
		//return "redirect:list";
		return "redirect:/plainte/list";
	}
	
	
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public String list(Model model) {
		List<Plainte> plaintes=plainteService.read();
		model.addAttribute("plaintes",plaintes);
		return "plainte/list";
	}

	
}
