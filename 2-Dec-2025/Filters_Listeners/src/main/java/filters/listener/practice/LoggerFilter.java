package filters.listener.practice;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@WebFilter("/*")
public class LoggerFilter implements Filter {

    private static final Logger logger = LogManager.getLogger(LoggerFilter.class);

    @Override
    public void init(FilterConfig filterConfig) {
        logger.info("LoggerFilter initialized");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        logger.info("Incoming request -> Filter");

        chain.doFilter(request, response);

        logger.info("Outgoing response -> Filter");
    }

    @Override
    public void destroy() {
        logger.info("LoggerFilter destroyed");
    }
}
