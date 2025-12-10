package practice;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import practice.beans.Order;
import practice.config.OrderConfiguration;

public class App {
    public static void main(String[] args) {
    	try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				OrderConfiguration.class)) {
    		Order order =  applicationContext.getBean(Order.class);
    		System.out.println(order);
    	}
    }
}
