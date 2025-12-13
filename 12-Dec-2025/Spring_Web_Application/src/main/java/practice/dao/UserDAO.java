package practice.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import practice.model.User;

@Repository
public class UserDAO implements DAOInterface {

	@Autowired
	HibernateTemplate hibernateTemplate;

	@Override
	public List<User> findAll() {
		return hibernateTemplate.loadAll(User.class);
	}

	@Override
	public void save(User user) {
		hibernateTemplate.save(user);
	}

	@Override
	public User findByRoleAndNameAndPassword(String role, String name, String password) {
		@SuppressWarnings("unchecked")
		List<User> users = (List<User>) hibernateTemplate.find("from User where role=? and name=? and password=?", role,
				name, password);

		if (users != null && !users.isEmpty()) {
			return users.get(0);
		}
		return null;
	}
}
