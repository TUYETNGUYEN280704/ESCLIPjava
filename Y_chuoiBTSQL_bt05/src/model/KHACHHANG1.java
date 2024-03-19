package model;

//import java.sql.Date;
import java.util.Date;
import java.text.SimpleDateFormat;


public class KHACHHANG1 {

	private String id;
	private String hoten;
	private Date ngaySinh;
	private String diaChi;
	
	public KHACHHANG1() {
 	}

	//public khachHang(int id, String hoten, Date ngaysinh, String diaChi) {}

	public KHACHHANG1(String id, String hoten, Date ngaySinh, String diaChi) {
 		this.id = id;
		this.hoten = hoten;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	@Override
	public String toString() {
		return "khachHang [id=" + id + ", hoten=" + hoten + ", ngaySinh=" + ngaySinh + ", diaChi=" + diaChi + "]";
	}
	
	
	
	
}
