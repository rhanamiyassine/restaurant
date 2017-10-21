package ma.ac.insea.restaurant.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ma.ac.insea.restaurant.entities.Jour;
import ma.ac.insea.restaurant.services.JourService;

@Controller
@RequestMapping("/jour")
public class JourController {
		
	@Autowired
	private JourService jourService; 
	
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public String addPage(Model model) {
		model.addAttribute("jour",new Jour());
		return "jour/add";
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String add(@ModelAttribute Jour jour, Model model) {
		jourService.save(jour);			
		return "redirect:list";
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public String find(Model model,@PathVariable("id") Long id) {
		model.addAttribute("jour",this.jourService.getById(id));
		return "jour/add";
	}
	
	@RequestMapping(value="remove/{id}",method=RequestMethod.GET)
	public String remove(@PathVariable("id") Long id, Model model) {
		this.jourService.delete(id);
		return "redirect:/jour/list";
	}
	
	
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public String list(Model model) {
		List<Jour> jours=jourService.read();
		model.addAttribute("jours",jours);
		return "jour/list";
	}

	
}
