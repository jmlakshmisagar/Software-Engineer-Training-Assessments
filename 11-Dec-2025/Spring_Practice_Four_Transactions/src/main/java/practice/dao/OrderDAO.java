package practice.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import practice.entities.Order;

@Repository
public class OrderDAO implements OrderDAOInterface {
	@Autowired
	HibernateTemplate hibernateTemplate;

	public Long save(Order order) {
		return (Long) hibernateTemplate.save(order);
	}

	public Order findById(Long id) {
		return hibernateTemplate.get(Order.class, id);
	}

}
