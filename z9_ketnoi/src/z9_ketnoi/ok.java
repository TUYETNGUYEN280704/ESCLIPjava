package z9_ketnoi;

import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ok {	
	public static void main(String[] args) {
		java.sql.Connection conn;
		try {
			String dbURL = "jdbc:sqlserver://localhost;databaseName=DE_1;user=sa;password=280704";
			conn = DriverManager.getConnection(dbURL);
			if(conn != null) {
				JOptionPane.showMessageDialog(null, "ket noi thanh cong:");
			}
		}catch (SQLException ex) {
				JOptionPane.showMessageDialog(null,""+ ex);
			}
		}
	}

