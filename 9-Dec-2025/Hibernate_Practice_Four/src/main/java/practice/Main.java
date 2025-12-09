
package practice;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import practice.entities.Product;
import practice.entities.Vehicle;
import practice.utils.HibernateUtil;

public class Main {
    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

	  @SuppressWarnings("deprecation")
		public static void main(String[] args) {

	        LOGGER.info("=== Application Initialization Started ===");

	        Session session = null;
	        Transaction transaction = null;

	        try {
	            session = HibernateUtil.getSessionFactory().openSession();
	            LOGGER.info("Hibernate session opened successfully");

	            transaction = session.beginTransaction();
	            LOGGER.debug("Transaction started");

	            Vehicle vehicle = new Vehicle(0007,"two");
	            LOGGER.info("Attempting to save product: id={}, name={}", vehicle.getId(), vehicle.getType());

	            session.save(vehicle);

	            transaction.commit();
	            LOGGER.info("Product saved successfully. Transaction committed.");

	        } catch (Exception e) {

	            if (transaction != null) {
	                transaction.rollback();
	                LOGGER.error("Transaction rolled back due to an error");
	            }

	            LOGGER.error("Error occurred while saving product: {}", e.getMessage(), e);

	        } finally {

	            if (session != null) {
	                session.close();
	                LOGGER.info("Hibernate session closed");
	            }

	            LOGGER.info("=== Application Execution Completed ===");
	        }
	    }
}
