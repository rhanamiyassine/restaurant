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

import ma.ac.insea.restaurant.entities.Role;
import ma.ac.insea.restaurant.services.RoleService;

@Controller
@RequestMapping("/role")
public class RoleController {
		
	@Autowired
	private RoleService roleService; 
	
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public String addPage(Model model) {
		model.addAttribute("role",new Role());
		return "role/add";
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String add(@ModelAttribute Role role, Model model) {
		roleService.save(role);	
		
		return "redirect:list";
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public String find(Model model,@PathVariable("id") Long id) {
		model.addAttribute("role",this.roleService.getById(id));
		return "role/add";
	}
	
	@RequestMapping(value="/remove/{id}",method=RequestMethod.GET)
	public String remove(@PathVariable("id") Long id, Model model) {
		this.roleService.delete(id);
		//return "redirect:list";
		return "redirect:/role/list";
	}
	
	
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public String list(Model model) {
		List<Role> roles=roleService.read();
		model.addAttribute("roles",roles);
		return "role/list";
	}

	
}
