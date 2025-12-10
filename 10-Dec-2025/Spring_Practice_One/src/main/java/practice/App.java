package practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import practice.beans.Employee;
import practice.beans.Hello;
import practice.beans.Person;

public class App {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext applicationContext1 = new ClassPathXmlApplicationContext("emp-bean.xml");
		
//		Hello hello = (Hello) applicationContext1.getBean("hello");
//		Person person1 = (Person) applicationContext2.getBean("person");
//		Person person2 = (Person) applicationContext2.getBean("person");
//		System.out.println(hello.sayHello());

//		System.out.println(person1);
//		System.out.println(person2.hashCode());
		
		Employee employee = (Employee) applicationContext1.getBean("emp");
		System.out.println(employee);
	}
}
