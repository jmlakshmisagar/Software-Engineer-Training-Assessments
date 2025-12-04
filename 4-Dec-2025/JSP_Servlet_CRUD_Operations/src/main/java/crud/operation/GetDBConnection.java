package crud.operation;

import java.sql.*;
import jakarta.servlet.ServletContext;

public class GetDBConnection {

    public Connection getConnection(ServletContext ctx) throws Exception {
        String url = ctx.getInitParameter("url");
        String user = ctx.getInitParameter("username");
        String pass = ctx.getInitParameter("pwd");
        String driver = ctx.getInitParameter("driver");

        Class.forName(driver);
        return DriverManager.getConnection(url, user, pass);
    }
}
