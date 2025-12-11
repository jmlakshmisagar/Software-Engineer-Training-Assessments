package practice;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import practice.config.AppConfig;
import practice.entities.Order;
import practice.entities.Payment;
import practice.service.OrderService;

public class App {
	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) {
			OrderService orderService = context.getBean(OrderService.class);
			Order order = new Order("TV", 1, 45000);
			Payment payment =  new Payment(45000, "UPI", "pending");
			orderService.placeOrder(order, payment);
		}
	}
}
