package practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import practice.model.User;
import practice.service.AuthService;

@RestController
public class UserController {

	@Autowired
	AuthService authService;

	@GetMapping("/users")
	public List<User> users() {
		return authService.getAll();
	}
}
