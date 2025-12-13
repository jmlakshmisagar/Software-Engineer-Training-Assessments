package practice;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = "practice")
@EnableWebMvc
public class WebConfig {

    @Autowired
    private Environment environment;

    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName(environment.getProperty("db.driver"));
        ds.setUrl(environment.getProperty("db.url"));
        ds.setUsername(environment.getProperty("db.username"));
        ds.setPassword(environment.getProperty("db.password"));
        return ds;
    }

    @Bean("sessionFactory")
    public LocalSessionFactoryBean getSessionFactory() {
        LocalSessionFactoryBean factory = new LocalSessionFactoryBean();
        factory.setDataSource(getDataSource());
        factory.setPackagesToScan("practice.model");
        factory.setHibernateProperties(getHibernateProps());
        return factory;
    }

    public Properties getHibernateProps() {
        Properties props = new Properties();
        props.put("hibernate.dialect", environment.getProperty("hibernate.dialect"));
        props.put("hibernate.show_sql", environment.getProperty("hibernate.show_sql"));
        props.put("hibernate.hbm2ddl.auto", environment.getProperty("hibernate.hbm2ddl.auto"));
        return props;
    }

    @Bean
    public HibernateTemplate getHibernateTemplate(SessionFactory sessionFactory) {
        return new HibernateTemplate(sessionFactory);
    }

    @Bean
    public HibernateTransactionManager getTxManager(SessionFactory sessionFactory) {
        return new HibernateTransactionManager(sessionFactory);
    }

    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
}
