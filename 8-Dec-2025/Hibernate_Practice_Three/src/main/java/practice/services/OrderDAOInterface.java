package practice.services;

import java.util.List;

import practice.model.Orders;

public interface OrderDAOInterface {
	public List<Orders> findAll();

	public Orders findById(int id);

	public void addOrder(Orders orders);

	public void deleteOrder(int id);

	public List<Orders> findOrdersWithRange(int minCost, int maxCost);

	public List<Orders> listItemsOfOrders(int orderId);
}
