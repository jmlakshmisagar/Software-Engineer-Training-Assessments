package practice.dao;

import practice.entities.Payment;

public interface PaymentDAOInterface {
	public Long save(Payment payment);

	public Payment findById(Long id);
}
