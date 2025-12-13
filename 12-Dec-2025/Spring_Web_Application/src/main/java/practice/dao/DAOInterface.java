package practice.dao;

import java.util.List;
import practice.model.User;

public interface DAOInterface {
	List<User> findAll();

	void save(User user);

	User findByRoleAndNameAndPassword(String role, String name, String password);
}
