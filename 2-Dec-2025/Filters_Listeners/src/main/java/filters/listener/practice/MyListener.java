package filters.listener.practice;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@WebListener
public class MyListener implements ServletContextListener {

    private static final Logger logger = LogManager.getLogger(MyListener.class);

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        logger.info("Application Started (Listener)");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        logger.info("Application Stopped (Listener)");
    }
}
