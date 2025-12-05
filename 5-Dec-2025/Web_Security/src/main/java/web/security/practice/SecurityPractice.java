package web.security.practice;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SecurityPractice extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SecurityPractice() {
		super();
	}	

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter printWriter = response.getWriter();
		printWriter.println("<h1>Welcome to servlet security</h1>");
		printWriter.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
