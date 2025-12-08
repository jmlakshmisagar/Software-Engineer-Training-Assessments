package practice.two.utils;

import java.io.InputStream;
import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {

    private static final SessionFactory factory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            Properties properties = new Properties();
            InputStream input = HibernateUtil.class.getClassLoader()
                    .getResourceAsStream("application.properties");

            if (input == null) {
                throw new RuntimeException("Cannot find application.properties in classpath");
            }

            properties.load(input);

            Configuration configuration = new Configuration();
            configuration.setProperties(properties);

            configuration.addAnnotatedClass(practice.two.model.Employee.class);

            StandardServiceRegistryBuilder registryBuilder =
                    new StandardServiceRegistryBuilder()
                            .applySettings(configuration.getProperties());

            ServiceRegistry registry = registryBuilder.build();

            return configuration.buildSessionFactory(registry);

        } catch (Exception e) {
            throw new RuntimeException("Failed to create SessionFactory", e);
        }
    }

    public static SessionFactory getSessionFactory() {
        return factory;
    }
}
