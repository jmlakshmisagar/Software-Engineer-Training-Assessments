package packk;

import jakarta.servlet.AsyncContext;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@WebServlet(urlPatterns = "/AsyncPractice", asyncSupported = true)
public class AsyncPractice extends HttpServlet implements Servlet {
    private static final long serialVersionUID = 1L;

    private static final Logger logger = LogManager.getLogger(AsyncPractice.class);
    private static final ExecutorService EXECUTOR_SERVICE = Executors.newSingleThreadExecutor();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        logger.info("Main thread started: {}", Thread.currentThread().getName());

        AsyncContext ac = request.startAsync();

        EXECUTOR_SERVICE.submit(() -> {
            try {
                Thread.sleep(10);

                String uname = request.getParameter("uname");
                String password = request.getParameter("password");

                logger.info("Async thread: {} → Processing login for user: {}",
                        Thread.currentThread().getName(), uname);

                if ("admin".equals(uname) && "admin123".equals(password)) {
                    logger.info("User authenticated successfully.");
                    response.getWriter().println("Auth Done, Async Ok");
                } else {
                    logger.warn("Authentication failed for: {}", uname);
                    response.getWriter().println("Invalid");
                }

            } catch (Exception e) {
                logger.error("Exception in async thread", e);
            } finally {
                logger.info("Async thread completed: {}", Thread.currentThread().getName());
                ac.complete();
            }
        });
    }
}
