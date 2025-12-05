package string.reversal.practice;

import jakarta.servlet.AsyncContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@WebServlet(urlPatterns = "/ReversePractice", asyncSupported = true)
public class ReversePractice extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static final Logger logger = LogManager.getLogger(ReversePractice.class);
	private static final ExecutorService EXECUTOR_SERVICE = Executors.newFixedThreadPool(3);

	public static String reverseString(String input) {
		if (input == null)
			return "";
		return new StringBuilder(input).reverse().toString();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String input = req.getParameter("reverserString");

		AsyncContext asyncContext = req.startAsync();

		Future<String> reverseFuture = EXECUTOR_SERVICE.submit(() -> {
			try {
				Thread.sleep(20000);
			} catch (Exception e) {
			}
			return reverseString(input);
		});

		Future<String> lengthFuture = EXECUTOR_SERVICE.submit(() -> {
			return String.valueOf(input.length());
		});

		Future<String> uppercaseFuture = EXECUTOR_SERVICE.submit(() -> {
			return reverseString(input).toUpperCase();
		});

		EXECUTOR_SERVICE.submit(() -> {
			try {
				String reversed = reverseFuture.get();
				String upper = uppercaseFuture.get();
				String len = lengthFuture.get();

				resp.setContentType("text/html");
				resp.getWriter().println(
						"Reverse string: " + reversed + "<br>" + "Uppercase: " + upper + "<br>" + "Length: " + len);
			} catch (Exception e) {
				logger.error("Error: ", e);
			} finally {
				asyncContext.complete();
			}
		});
	}

	@Override
	public void destroy() {
		EXECUTOR_SERVICE.shutdown();
	}
}
