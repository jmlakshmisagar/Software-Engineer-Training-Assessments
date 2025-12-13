package practice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import practice.dao.UserDAO;
import practice.model.User;

@Service
public class AuthService {

    @Autowired
    UserDAO dao;

    public boolean doAuth(String role, String uname, String password) {
        User user = dao.findByRoleAndNameAndPassword(role, uname, password);
        return user != null;
    }

    public User getDetails(String role, String uname, String password) {
        return dao.findByRoleAndNameAndPassword(role, uname, password);
    }

    public void addUser(User user) {
        dao.save(user);
    }

    public List<User> getAll() {
        return dao.findAll();
    }
}
