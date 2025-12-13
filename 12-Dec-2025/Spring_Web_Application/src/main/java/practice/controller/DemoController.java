package practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import practice.model.User;
import practice.service.AuthService;

@Controller
public class DemoController {

	@Autowired
	AuthService authService;

	@RequestMapping("/demo")
	public ModelAndView login() {
		return new ModelAndView("login");
	}

	@RequestMapping("/home/{role}")
	public ModelAndView welcome(@PathVariable("role") String role, @RequestParam("uname") String uname,
			@RequestParam("password") String password) {

		if (authService.doAuth(role, uname, password)) {

			if (role.equals("admin")) {
				ModelAndView mv = new ModelAndView("adminHome");
				mv.addObject("users", authService.getAll());
				return mv;
			}

			ModelAndView mv = new ModelAndView("welcome");
			mv.addObject("user", authService.getDetails(role, uname, password));
			return mv;

		} else {
			ModelAndView mv = new ModelAndView("error");
			mv.addObject("username", uname);
			return mv;
		}
	}

	@RequestMapping("/details/{role}")
	@ResponseBody
	public String getDetails(@PathVariable("role") String role, @RequestParam("uname") String uname,
			@RequestParam("password") String password) {

		return authService.getDetails(role, uname, password).toString();
	}

	@RequestMapping("/add")
	@ResponseBody
	public String addUser(User user) {
		authService.addUser(user);
		return "User added successfully!";
	}

	@RequestMapping("/userform")
	public ModelAndView showUserForm() {
		return new ModelAndView("add");
	}
}
