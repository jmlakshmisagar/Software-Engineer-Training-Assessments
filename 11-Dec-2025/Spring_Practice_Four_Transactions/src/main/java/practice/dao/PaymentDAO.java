package practice.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import practice.entities.Payment;

@Repository
public class PaymentDAO implements PaymentDAOInterface {

    @Autowired
    HibernateTemplate hibernateTemplate;

    @Override
    public Long save(Payment payment) {
        return (Long) hibernateTemplate.save(payment);
    }

    @Override
    public Payment findById(Long id) {
        return hibernateTemplate.get(Payment.class, id);
    }
}
