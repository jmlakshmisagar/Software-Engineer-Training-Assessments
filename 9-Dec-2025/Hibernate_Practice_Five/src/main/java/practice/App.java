package practice;

import practice.dao.PassportDAO;
import practice.model.Passport;
import practice.model.Person;

public class App {
    public static void main(String[] args) {
    	PassportDAO dao = new PassportDAO();
//    	Person person = new Person(1l, "mphasis", new Passport(1l, "1234567", person), "98765462100", "a@gmail.com");
//    	dao.addPassport(person);
    	dao.findAll();
    }
}
