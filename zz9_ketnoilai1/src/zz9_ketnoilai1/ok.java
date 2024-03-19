package zz9_ketnoilai1;

import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ok {
	public static void main(String[] args) {
		java.sql.Connection conn;
		try {
			String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=ketnoi_Esclip;user=sa;password=280704";
			conn = DriverManager.getConnection(dbURL);
			if (conn != null) {
				JOptionPane.showMessageDialog(null, "ket noi thanh cong:");
			}
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "" + ex);
		}
	}
}
 //Lỗi java.sql.SQLException:No suitable driver found for jdbc:sqlserver://localhost;databaseName=ketnoi_Esclip;user=sa;password=280704"