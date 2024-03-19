package database;

  
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.sql.*;
	import java.util.*;
	public class JDBCUtil {
	    public static Connection getConnection() {
	        Connection c = null;
	        try {
	            // Correct SQL Server JDBC driver class
	            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

	            // Connection URL for SQL Server with setTrustServerCertificate(true)
	            String connectionUrl = "jdbc:sqlserver://LAPTOP-A51RB5RS\\SQLEXPRESS:1433;databaseName=nhaSach1;trustServerCertificate=true";
	            String username = "sa";
	            String password = "280704";
	            c = DriverManager.getConnection(connectionUrl, username, password);

	        } catch (SQLException | ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	        return c;
	    }

	    public static void closeConnection(Connection c) {
	        try {
	            if (c != null && !c.isClosed()) {
	                c.close();
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	}

