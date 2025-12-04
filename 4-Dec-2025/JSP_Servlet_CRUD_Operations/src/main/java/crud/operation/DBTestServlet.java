package crud.operation;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
import java.sql.*;

public class DBTestServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		String action = req.getParameter("action");

		try {
			if (action == null) {
				showList(out, req);
			} else if (action.equals("addform")) {
				showAddForm(out);
			} else if (action.equals("editform")) {
				showEditForm(out, req);
			} else if (action.equals("delete")) {
				deleteCustomer(req);
				resp.sendRedirect("test");
			}

		} catch (Exception e) {
			out.println("<h3>Error: " + e.getMessage() + "</h3>");
			e.printStackTrace(out);
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String action = req.getParameter("action");

		try {
			if (action.equals("add")) {
				addCustomer(req);
			} else if (action.equals("update")) {
				updateCustomer(req);
			}
			resp.sendRedirect("test");

		} catch (Exception e) {
			throw new ServletException(e);
		}
	}

	private void addCustomer(HttpServletRequest req) throws Exception {
		GetDBConnection db = new GetDBConnection();
		try (Connection con = db.getConnection(getServletContext())) {

			String sql = "INSERT INTO customer VALUES (?, ?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, Integer.parseInt(req.getParameter("customerid")));
			ps.setString(2, req.getParameter("name"));
			ps.setString(3, req.getParameter("address"));
			ps.setString(4, req.getParameter("phonenumber"));
			ps.setString(5, req.getParameter("email"));
			ps.executeUpdate();
		}
	}

	private void updateCustomer(HttpServletRequest req) throws Exception {
		GetDBConnection db = new GetDBConnection();
		try (Connection con = db.getConnection(getServletContext())) {

			String sql = "UPDATE customer SET name=?, address=?, phonenumber=?, email=? WHERE customerid=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, req.getParameter("name"));
			ps.setString(2, req.getParameter("address"));
			ps.setString(3, req.getParameter("phonenumber"));
			ps.setString(4, req.getParameter("email"));
			ps.setInt(5, Integer.parseInt(req.getParameter("customerid")));
			ps.executeUpdate();
		}
	}

	private void deleteCustomer(HttpServletRequest req) throws Exception {
		int id = Integer.parseInt(req.getParameter("id"));

		GetDBConnection db = new GetDBConnection();
		try (Connection con = db.getConnection(getServletContext())) {
			con.createStatement().executeUpdate("DELETE FROM customer WHERE customerid=" + id);
		}
	}

	private void showList(PrintWriter out, HttpServletRequest req) throws Exception {
		out.println("<center>");
		out.println("<h2>Customer List</h2>");
		out.println("<a href='test?action=addform'>Add Customer</a><br><br>");

		out.println("<table border='1' cellpadding='5'>");
		out.println(
				"<tr><th>ID</th><th>Name</th><th>Address</th><th>Phone</th><th>Email</th><th>Edit</th><th>Delete</th></tr>");

		GetDBConnection db = new GetDBConnection();

		try (Connection con = db.getConnection(getServletContext());
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT * FROM customer")) {

			while (rs.next()) {
				int id = rs.getInt("customerid");

				out.println("<tr>");
				out.println("<td>" + id + "</td>");
				out.println("<td>" + rs.getString("name") + "</td>");
				out.println("<td>" + rs.getString("address") + "</td>");
				out.println("<td>" + rs.getString("phonenumber") + "</td>");
				out.println("<td>" + rs.getString("email") + "</td>");

				out.println("<td><button> <a href='test?action=editform&id=" + id + "'>Edit</a></button></td>");

				out.println("<td>");
				out.println("<button><a href='test?action=delete&id=" + id + "' ");
				out.println("onclick='return confirm(\"sure?\")'>Delete</a>");
				out.println("</button></td>");

				out.println("</tr>");
			}
		}
		out.println("</table></center>");
	}

	private void showAddForm(PrintWriter out) {
		out.println("<center><h2>Add Customer</h2>");
		out.println("<form method='post' action='test'>");
		out.println("<input type='hidden' name='action' value='add'>");

		out.println("ID: <input type='number' name='customerid'><br><br>");
		out.println("Name: <input type='text' name='name'><br><br>");
		out.println("Address: <input type='text' name='address'><br><br>");
		out.println("Phone: <input type='text' name='phonenumber'><br><br>");
		out.println("Email: <input type='email' name='email'><br><br>");

		out.println("<button type='submit'>Save</button>");
		out.println("</form></center>");
	}

	private void showEditForm(PrintWriter out, HttpServletRequest req) throws Exception {
		int id = Integer.parseInt(req.getParameter("id"));

		GetDBConnection db = new GetDBConnection();
		Connection con = db.getConnection(getServletContext());

		PreparedStatement ps = con.prepareStatement("SELECT * FROM customer WHERE customerid=?");
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();

		if (rs.next()) {
			out.println("<center><h2>Edit Customer</h2>");
			out.println("<form method='post' action='test'>");
			out.println("<input type='hidden' name='action' value='update'>");

			out.println("ID: <input type='number' name='customerid' value='" + id + "' readonly><br><br>");
			out.println("Name: <input type='text' name='name' value='" + rs.getString("name") + "'><br><br>");
			out.println("Address: <input type='text' name='address' value='" + rs.getString("address") + "'><br><br>");
			out.println("Phone: <input type='text' name='phonenumber' value='" + rs.getString("phonenumber")
					+ "'><br><br>");
			out.println("Email: <input type='email' name='email' value='" + rs.getString("email") + "'><br><br>");

			out.println("<button type='submit'>Update</button>");
			out.println("</form></center>");
		}
		con.close();
	}
}
