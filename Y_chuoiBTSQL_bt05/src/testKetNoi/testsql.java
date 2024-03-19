package testKetNoi;
import database.JDBCUtil;
import java.sql.Connection;
public class testsql {
	  public static void main(String args[]) {
	        Connection connection = JDBCUtil.getConnection();
	        System.out.println(connection);

	        // Don't forget to close the connection when done
	        JDBCUtil.closeConnection(connection);
	    }
}