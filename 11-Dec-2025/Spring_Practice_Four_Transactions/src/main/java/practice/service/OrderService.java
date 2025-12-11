package practice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import practice.dao.OrderDAO;
import practice.dao.PaymentDAO;
import practice.entities.Order;
import practice.entities.Payment;

@Service
public class OrderService {
	@Autowired
	OrderDAO orderDAO;

	@Autowired
	PaymentDAO paymentDAO;

	@Transactional
	public void placeOrder(Order order, Payment payment) {
		Long id = orderDAO.save(order);
		payment.setId(id);
		paymentDAO.save(payment);
		System.out.println("Order placed payment pending");
	}
}

