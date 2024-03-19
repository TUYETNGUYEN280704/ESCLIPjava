package dao_doiTuongTRuyXuatDl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import database.JDBCUtil;
import model.SACH1;
 
public class sachDAO implements DAOInterface<SACH1>{

	public static sachDAO getInstance()
	{
		return new sachDAO();
	}
	
	@Override
	public int insert(SACH1 t) {
		int ketQua = 0;
		try {
			// b1: tạo kết nối đến csdl 
			Connection con = JDBCUtil.getConnection();
			// b2: tạo ra đối tượng statement 
			Statement st = con.createStatement();
			// b2: thực thi câu sql
			String sql = "INSERT INTO SACH (ID, TENSACH, GIABAN, NAMXUATBAN)"
			+"VALUES ('"+t.getId() + "','" +t.gettensach() +"','"+t.getGiaBan()+"','"+t.getNamXuatBan() + "')";
			
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
	public int update(SACH1 t) {
		int ketQua = 0;
		try {
			// b1: tạo kết nối đến csdl 
			Connection con = JDBCUtil.getConnection();
			// b2: tạo ra đối tượng statement 
			Statement st = con.createStatement();
			// b2: thực thi câu sql
			String sql = "UPDATE SACH "
				    + "SET "
				    + "TENSACH = '" + t.gettensach() + "', "
				    + "GIABAN = " + t.getGiaBan() + ", "
				    + "NAMXUATBAN = " + t.getNamXuatBan() + " "
				    + "WHERE ID = '" + t.getId() + "'";

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
	public int delete(SACH1 t) {
		int ketQua = 0;
		try {
			// b1: tạo kết nối đến csdl 
			Connection con = JDBCUtil.getConnection();
			// b2: tạo ra đối tượng statement 
			Statement st = con.createStatement();
			// b2: thực thi câu sql
			String sql = "DELETE FROM SACH "
				   +"WHERE ID= '"+t.getId()+"'";

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
	public ArrayList<SACH1> selectAll() {
		ArrayList<SACH1> ketQua = new ArrayList<SACH1>();
		try {
			// b1: tạo kết nối đến csdl 
			Connection con = JDBCUtil.getConnection();
			// b2: tạo ra đối tượng statement 
			Statement st = con.createStatement();
			// b2: thực thi câu sql
			String sql = "SELECT * FROM sach";

			// b3mấy này có sự thay đổi database nên cần hàm này
			// cập nhật hết all thoogn tin của đối tượng t, sau đó ktra 
			//thằng nào có id giống đối tượng t thì sẽ thay đổi all
			
			System.out.println(sql);
// query là câu lệnh truy vấn , lấy dl ra và đưa lên chương trình cho ta
			
			//ResultSet: giống như 1 table có nhiều dòng ở trong
			ResultSet rs = st.executeQuery(sql);
			// b4: xử lí kết quả
			while (rs.next()) {// có dl thì lấy ra, next từng cái
				String id = rs.getString("ID");
				String tenSach  = rs.getString("TENSACH");
				float giaBan = rs.getFloat("giaBan");
				int namXuatBan = rs.getInt("namXuatBan");
				
				SACH1 s1 = new SACH1(id, tenSach,giaBan,namXuatBan);
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
	public SACH1 selectById(SACH1 t) {
		SACH1 ketQua =null;
		try {
			// b1: tạo kết nối đến csdl 
			Connection con = JDBCUtil.getConnection();
			// b2: tạo ra đối tượng statement 
			Statement st = con.createStatement();
			// b2: thực thi câu sql
			//   id của sách phải = id ngta bỏ vào cho mình chỗ t á
			String sql = "SELECT * FROM sach where id= '"+t.getId()+"'";

			// b3mấy này có sự thay đổi database nên cần hàm này
			// cập nhật hết all thoogn tin của đối tượng t, sau đó ktra 
			//thằng nào có id giống đối tượng t thì sẽ thay đổi all
			
			System.out.println(sql);
// query là câu lệnh truy vấn , lấy dl ra và đưa lên chương trình cho ta
			
			//ResultSet: giống như 1 table có nhiều dòng ở trong
			ResultSet rs = st.executeQuery(sql);
			// b4: xử lí kết quả
			while (rs.next()) {// có dl thì lấy ra, next từng cái
				String id = rs.getString("ID");
				String tenSach  = rs.getString("TENSACH");
				float giaBan = rs.getFloat("giaBan");
				int namXuatBan = rs.getInt("namXuatBan");
				
				ketQua = new SACH1(id, tenSach,giaBan,namXuatBan);
				
				
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
	public ArrayList<SACH1> selectByCondition(String condition) {
		ArrayList<SACH1> ketQua = new ArrayList<SACH1>();
		try {
			// b1: tạo kết nối đến csdl 
			Connection con = JDBCUtil.getConnection();
			// b2: tạo ra đối tượng statement 
			Statement st = con.createStatement();
			// b2: thực thi câu sql
			String sql = "SELECT * FROM sach where "+condition;

			// b3mấy này có sự thay đổi database nên cần hàm này
			// cập nhật hết all thoogn tin của đối tượng t, sau đó ktra 
			//thằng nào có id giống đối tượng t thì sẽ thay đổi all
			
			System.out.println(sql);
// query là câu lệnh truy vấn , lấy dl ra và đưa lên chương trình cho ta
			
			//ResultSet: giống như 1 table có nhiều dòng ở trong
			ResultSet rs = st.executeQuery(sql);
			// b4: xử lí kết quả
			while (rs.next()) {// có dl thì lấy ra, next từng cái
				String id = rs.getString("ID");
				String tenSach  = rs.getString("TENSACH");
				float giaBan = rs.getFloat("giaBan");
				int namXuatBan = rs.getInt("namXuatBan");
				
				SACH1 s1 = new SACH1(id, tenSach,giaBan,namXuatBan);
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