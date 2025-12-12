package practice.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import practice.model.User;

@Service
public class AuthService {
	private static ArrayList<User> users = new ArrayList<User>();

	static {
		users.add(new User("admin", "123", "admin", 1));
		users.add(new User("Lakshmisagar J M", "123", "user", 2));
		users.add(new User("Manager", "123", "manager", 3));
	}

	public boolean doAuth(String role, String uname, String password) {
		for (User user : users)
			if (user.getRole().equals(role) && user.getName().equals(uname) && user.getPassword().equals(password))
				return true;
		return false;
	}

	public User getDetails(String role, String uname, String password) {
		for (User user : users)
			if (user.getRole().equals(role) && user.getName().equals(uname) && user.getPassword().equals(password))
				return user;
		return null;
	}

	public void addUser(User user) {
		users.add(new User(user.getName(), user.getPassword(), user.getRole(), user.getId()));
	}

}
