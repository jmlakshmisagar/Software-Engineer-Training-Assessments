package simple.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.UUID;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public Login() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());

		String username = request.getParameter("username");
		String password = request.getParameter("password");

//		using cookie
//
//		if (username.equals("jmlakshmisagar") && password.equals("123")) {
//			Cookie cookie = new Cookie("username", username);
//			cookie.setMaxAge(60 * 60);
//			response.addCookie(cookie);
//			response.sendRedirect("welcome.jsp");
//		} else {
//			response.sendRedirect("error.jsp");
//		}

//		using url redirect

		PrintWriter printWriter = response.getWriter();

//		if (username.equals("jmlakshmisagar") && password.equals("123")) {
//			response.setContentType("text/html");
//			printWriter.println("<form id=f1 action='welcome.jsp' method='get'>"
//					+ "<input type=hidden name=username value="
//					+ username +"<input type='submit' value='submit'></form>" + "<script>f1.submit()</script>");
//			response.sendRedirect("welcome.jsp?username=" + username);
//		} else {
//			response.sendRedirect("error.jsp?username=" + username);
//		}

		if ("jmlakshmisagar".equals(username) && "123".equals(password)) {
			HttpSession session = request.getSession();
			session.setMaxInactiveInterval(30 * 60);
			String token = UUID.randomUUID().toString();
			session.setAttribute("token", token);
			session.setAttribute("uname", username);

			response.sendRedirect("welcome.jsp");
		} else {
			response.sendRedirect("error.jsp");
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
