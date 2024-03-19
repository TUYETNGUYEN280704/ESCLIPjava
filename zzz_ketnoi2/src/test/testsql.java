package test;
import database.database;
import java.sql.Connection;
public class testsql {
	  public static void main(String args[]) {
	        Connection connection = database.getConnection();
	        System.out.println(connection);

	        // Don't forget to close the connection when done
	        database.closeConnection(connection);
	    }
}