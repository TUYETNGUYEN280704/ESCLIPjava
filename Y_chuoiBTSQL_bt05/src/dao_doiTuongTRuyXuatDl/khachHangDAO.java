package dao_doiTuongTRuyXuatDl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;


import database.JDBCUtil;
import model.KHACHHANG1;
import model.SACH1;

public class khachHangDAO implements DAOInterface<KHACHHANG1>{

	public static khachHangDAO getInstance() {
		return new khachHangDAO();
	}
	
	@Override
	public int insert(KHACHHANG1 t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(KHACHHANG1 t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(KHACHHANG1 t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<KHACHHANG1> selectAll() {
		ArrayList<KHACHHANG1> ketQua = new ArrayList<KHACHHANG1>();
		try {
			// b1: tạo kết nối đến csdl 
			Connection con = JDBCUtil.getConnection();
			// b2: tạo ra đối tượng statement 
			Statement st = con.createStatement();
			// b2: thực thi câu sql
			String sql = "SELECT * FROM khachHang";

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
				String hoten  = rs.getString("HOTEN");
				Date ngaySinh = rs.getDate("NGAYSINH");
				String diaChi = rs.getString("DIACHI");
				

				KHACHHANG1 kh = new KHACHHANG1(id, hoten, ngaySinh, diaChi);
				ketQua.add(kh);
				
				
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
	public KHACHHANG1 selectById(KHACHHANG1 t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<KHACHHANG1> selectByCondition(String condition) {
		// TODO Auto-generated method stub
		return null;
	}

}