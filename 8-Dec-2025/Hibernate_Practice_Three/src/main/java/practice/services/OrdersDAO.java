package practice.services;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import practice.model.Orders;
import practice.utils.HibernateUtil;

public class OrdersDAO implements OrderDAOInterface {

	@Override
	public List<Orders> findAll() {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			return session.createNamedQuery("Orders.findAll", Orders.class).list();
		}
	}

	@Override
	public Orders findById(int id) {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			Query<Orders> query = session.createNamedQuery("Orders.findById",Orders.class);
			query.setParameter("o", id);
			return query.uniqueResult();
		}
	}

	@Override
	public void addOrder(Orders orders) {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			session.save(orders);
			System.out.println("Added successfully");
		}
	}

	@Override
	public void deleteOrder(int id) {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			Orders orders = findById(id);
			session.delete(orders);
		}
	}

	@Override
	public List<Orders> findOrdersWithRange(int minCost, int maxCost) {
		
		return null;
	}

	@Override
	public List<Orders> listItemsOfOrders(int orderId) {
		// TODO Auto-generated method stub
		return null;
	}

}
