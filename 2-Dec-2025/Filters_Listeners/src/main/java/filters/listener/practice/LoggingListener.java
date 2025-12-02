package filters.listener.practice;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;
import jakarta.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class LoggingListener
 *
 */
@WebListener
public class LoggingListener implements ServletRequestListener, ServletContextListener {

	/**
	 * Default constructor.
	 */
	public LoggingListener() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		ServletContextListener.super.contextInitialized(sce);
		System.out.println("App stopped at : "+ System.currentTimeMillis());
	
	}
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		ServletContextListener.super.contextDestroyed(sce);
	}
	
	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		// TODO Auto-generated method stub
		ServletRequestListener.super.requestDestroyed(sre);
	}
	
	
}
