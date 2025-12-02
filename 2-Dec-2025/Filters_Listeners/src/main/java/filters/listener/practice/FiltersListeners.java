package filters.listener.practice;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@WebServlet("/FiltersListeners")
public class FiltersListeners extends HttpServlet {

    /**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	private static final Logger logger = LogManager.getLogger(FiltersListeners.class);

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {


        response.setContentType("text/html");
    }
}
