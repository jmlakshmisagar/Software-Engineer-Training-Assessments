
package servlet.config.practice;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public HelloServlet() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String url = getServletContext().getInitParameter("url");
		String username =  getServletContext().getInitParameter("username");
		String password =  getServletContext().getInitParameter("pwd");
		String driver =  getServletContext().getInitParameter("driver");

		out.println("<h3>Servlet Initialized Parameters:</h3>");
		out.println("URL: " + url + "<br>");
		out.println("Username: " + username + "<br>");
		out.println("Password: " + password + "<br>");

		try { 
			Class.forName(driver);
			Connection connection = DriverManager.getConnection(url, username, password);
			out.println("<h3>Database Connection Successful!</h3>");
			connection.close();
		} catch (ClassNotFoundException e) {
			out.println("<h3>Error: Driver not found!</h3>");
			e.printStackTrace();
		} catch (SQLException e) {
			out.println("<h3>Error connecting to database: " + e.getMessage() + "</h3>");
			e.printStackTrace();
		}

		out.close();
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
