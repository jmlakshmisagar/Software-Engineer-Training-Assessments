package practice;

import org.hibernate.Session;
import org.hibernate.Transaction;

import practice.model.Item;
import practice.utils.HibernateUtil;

public class App {
	public static void main(String[] args) {
		Session session1 = HibernateUtil.getSessionFactory().openSession();
		Session session2 = HibernateUtil.getSessionFactory().openSession();
		Session session3 = HibernateUtil.getSessionFactory().openSession();

		Item item = new Item("Parle-G", 10);
		Transaction transaction = session1.beginTransaction();
		session1.save(item);
		transaction.commit();
		session1.close();

		System.out.println(session2.get(Item.class, 1));
		System.out.println(session3.get(Item.class, 1));

		System.out.println(session2 == session3 ? "true" : "false");
	}
}
