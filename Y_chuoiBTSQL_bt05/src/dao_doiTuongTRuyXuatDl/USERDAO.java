 package dao_doiTuongTRuyXuatDl;

 
 // class này thực hiện PreparedStatement thay thê cho Statement
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import database.JDBCUtil;
import model.USER1;
 
public class USERDAO implements DAOInterface<USER1>{

	public static USERDAO getInstance()
	{
		return new USERDAO();
	}
	
	@Override
	public int insert(USER1 t) {
		int ketQua = 0;
		try {
			// b1: tạo kết nối đến csdl 
			Connection con = JDBCUtil.getConnection();
			
			// b2: tạo ra đối tượng statement 
			Statement st = con.createStatement();
			// b2: thực thi câu sql
			String sql = "INSERT INTO USER1 (username, passw, hovaten)"
			+"VALUES ('"+t.getUsername() + "','" +t.getPassw() +"','"+t.getHovaten() + "')";
			
			// mấy này có sự thay đổi database nên cần hàm này
			 ketQua = st.executeUpdate(sql);
			// b4: xử lí kết quả
			System.out.println(" bạn đã thực thi :"+sql);
			System. out.println(" có "+ketQua +" dòng bị thay đổi ");
			
			// b5: ngắt kết nối , để nhường slot đó cho các đối tượng khác 
			JDBCUtil.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ketQua;
	}

	@Override
	public int update(USER1 t) {
		int ketQua = 0;
		try {
			// b1: tạo kết nối đến csdl 
			Connection con = JDBCUtil.getConnection();
			// b2: tạo ra đối tượng statement 
			Statement st = con.createStatement();
			// b2: thực thi câu sql
			String sql = "UPDATE USER1 "
				    + "SET "
				    + "username = '" + t.getUsername() + "', "
				    + "passw = " + t.getPassw() + ", "
				    + "hovaten = " + t.getHovaten() + " "
				    + " WHERE username ='"+t.getUsername()+"'";

			// b3mấy này có sự thay đổi database nên cần hàm này
			// cập nhật hết all thoogn tin của đối tượng t, sau đó ktra 
			//thằng nào có id giống đối tượng t thì sẽ thay đổi all
			System.out.println(sql);

			ketQua = st.executeUpdate(sql);
			// b4: xử lí kết quả
			System.out.println(" bạn đã thực thi :"+sql);
			System. out.println(" có "+ketQua +" dòng bị thay đổi ");
			
			// b5: ngắt kết nối , để nhường slot đó cho các đối tượng khác 
			JDBCUtil.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ketQua;
	}
 
	@Override
	public int delete(USER1 t) {
		int ketQua = 0;
		try {
			// b1: tạo kết nối đến csdl 
			Connection con = JDBCUtil.getConnection();
			// b2: tạo ra đối tượng statement 
			Statement st = con.createStatement();
			// b2: thực thi câu sql
			String sql = "DELETE FROM USER1 "
				   +"WHERE username= '"+t.getUsername()+"'";

			// b3mấy này có sự thay đổi database nên cần hàm này
			// cập nhật hết all thoogn tin của đối tượng t, sau đó ktra 
			//thằng nào có id giống đối tượng t thì sẽ thay đổi all
			System.out.println(sql);

			ketQua = st.executeUpdate(sql);
			// b4: xử lí kết quả
			System.out.println(" bạn đã thực thi :"+sql);
			System. out.println(" có "+ketQua +" dòng bị thay đổi ");
			
			// b5: ngắt kết nối , để nhường slot đó cho các đối tượng khác 
			JDBCUtil.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ketQua;

	}

	@Override
	public ArrayList<USER1> selectAll() {
		ArrayList<USER1> ketQua = new ArrayList<USER1>();
		try {
			// b1: tạo kết nối đến csdl 
			Connection con = JDBCUtil.getConnection();
			// b2: tạo ra đối tượng statement 
			Statement st = con.createStatement();
			// b2: thực thi câu sql
			String sql = "SELECT * FROM USER1";

			// b3mấy này có sự thay đổi database nên cần hàm này
			// cập nhật hết all thoogn tin của đối tượng t, sau đó ktra 
			//thằng nào có id giống đối tượng t thì sẽ thay đổi all
			
			System.out.println(sql);
// query là câu lệnh truy vấn , lấy dl ra và đưa lên chương trình cho ta
			
			//ResultSet: giống như 1 table có nhiều dòng ở trong
			ResultSet rs = st.executeQuery(sql);
			// b4: xử lí kết quả
			while (rs.next()) {// có dl thì lấy ra, next từng cái
				String username = rs.getString("username");
				String passw  = rs.getString("passw");
				String hovaten = rs.getString("hovaten");
				
				USER1 s1 = new USER1(username, passw,hovaten);
				ketQua.add(s1);
				
			}
			// b5: ngắt kết nối , để nhường slot đó cho các đối tượng khác 
			JDBCUtil.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return ketQua;
	}

	@Override
	public USER1 selectById(USER1 t) {
		USER1 ketQua =null;
		try {
			// b1: tạo kết nối đến csdl 
			Connection con = JDBCUtil.getConnection();
			// b2: tạo ra đối tượng statement 
			Statement st = con.createStatement();
			// b2: thực thi câu sql
			//   id của sách phải = id ngta bỏ vào cho mình chỗ t á
			String sql = "SELECT * FROM USER1 where username= '"+t.getUsername()+"'";

			// b3mấy này có sự thay đổi database nên cần hàm này
			// cập nhật hết all thoogn tin của đối tượng t, sau đó ktra 
			//thằng nào có id giống đối tượng t thì sẽ thay đổi all
			
			System.out.println(sql);
// query là câu lệnh truy vấn , lấy dl ra và đưa lên chương trình cho ta
			
			//ResultSet: giống như 1 table có nhiều dòng ở trong
			ResultSet rs = st.executeQuery(sql);
			// b4: xử lí kết quả
			while (rs.next()) {// có dl thì lấy ra, next từng cái
				String username = rs.getString("username");
				String passw  = rs.getString("passw");
				String hovaten = rs.getString("hovaten");
				
				ketQua = new USER1(username, passw, hovaten);
				
				
			}
			// b5: ngắt kết nối , để nhường slot đó cho các đối tượng khác 
			JDBCUtil.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return ketQua;
	}

	@Override
	public ArrayList<USER1> selectByCondition(String condition) {
		ArrayList<USER1> ketQua = new ArrayList<USER1>();
		try {
			// b1: tạo kết nối đến csdl 
			Connection con = JDBCUtil.getConnection();
			// b2: tạo ra đối tượng statement 
			Statement st = con.createStatement();
			// b2: thực thi câu sql
			String sql = "SELECT * FROM USER1 where "+condition;

			// b3mấy này có sự thay đổi database nên cần hàm này
			// cập nhật hết all thoogn tin của đối tượng t, sau đó ktra 
			//thằng nào có id giống đối tượng t thì sẽ thay đổi all
			
			System.out.println(sql);
// query là câu lệnh truy vấn , lấy dl ra và đưa lên chương trình cho ta
			
			//ResultSet: giống như 1 table có nhiều dòng ở trong
			ResultSet rs = st.executeQuery(sql);
			// b4: xử lí kết quả
			while (rs.next()) {// có dl thì lấy ra, next từng cái
				String username = rs.getString("username");
				String passw  = rs.getString("passw");
				String hovaten = rs.getString("hovaten");
				
				USER1 s1 = new USER1(username, passw, hovaten);
				ketQua.add(s1);
				
			}
			// b5: ngắt kết nối , để nhường slot đó cho các đối tượng khác 
			JDBCUtil.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return ketQua;		
	}

	 
 

}