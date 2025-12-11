package practice.dao;

import practice.entities.Order;

public interface OrderDAOInterface {
	public Long save(Order order);

	public Order findById(Long id);
}
