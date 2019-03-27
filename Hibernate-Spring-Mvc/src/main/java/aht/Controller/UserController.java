package aht.Controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import aht.Model.UserDTO;
import aht.Service.UserService;
import aht.Validator.UserValidator;

@Controller
@Transactional
@EnableWebMvc
public class UserController {
	
	@Autowired
	private UserValidator UserValidator;
		
	@Autowired
	private UserService UserServiceImp;
	
	@RequestMapping(value = "/")
	public String getAllUser(Model model) {

		List<UserDTO> ls = UserServiceImp.getAllUser();
		System.out.println(ls.toString());
		model.addAttribute("list", ls);
		return "homepage";
	}

	@RequestMapping(value = "/delete-user/{id}")
	public String deleteUser(@PathVariable("id") int id) {
		UserServiceImp.deleteUser(id);
		return "redirect:/";
	}

	@RequestMapping(value = "/create-user")
	public String createUser(HttpServletRequest request) {
		request.setAttribute("userdto", new UserDTO());
		return "create-user";
	}

	@RequestMapping(value = "/create")
	public String createUser( @ModelAttribute("userdto") UserDTO user,BindingResult bindingResult) {
		UserValidator.validate(user, bindingResult);
		if (bindingResult.hasErrors()){
			return "create-user";
		}
		UserDTO us = new UserDTO(user.getName(), user.getAddress());
		UserServiceImp.addUser(us);
		return "redirect:/";
	}

	@RequestMapping(value = "/edit-user/{id}")
	public String editUser(Model model, @PathVariable("id") int id) {
		UserDTO user = UserServiceImp.getUserByID(id);
		model.addAttribute("user", user);
		return "edit-user";
	}

	@RequestMapping(value = "/edit-user/edit")
	public String edit(Model model, @RequestParam("idu") String id, @RequestParam("nameu") String name,
			@RequestParam("addressu") String add) {
		int a = Integer.parseInt(id);
		UserDTO user = new UserDTO(a, name, add);
		UserServiceImp.updateUser(user);
		return "redirect:/";
	}
	@RequestMapping(value = "/search")
	public String searchPeople(@RequestParam("id") String id, Model model) {
		if (id.equals("")) {
			return "redirect:/";
		}try {
			UserDTO us = UserServiceImp.getUserByID(Integer.parseInt(id));
			model.addAttribute("user", us);
			return "search-user";
		} catch (Exception e) {
			model.addAttribute("mess", "Ma khong ton tai");
			List<UserDTO> ls = UserServiceImp.getAllUser();
			System.out.println(ls.toString());
			model.addAttribute("list", ls);
			return "homepage";
		}
		
	}

}
