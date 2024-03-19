package z5_abstract_phuongTienDiChuyen;

public class xeOto extends PhuongTienDiChuyen{
	private String loaiNhienLieu;

	 

	public xeOto(String loaiPhuongTien, HangSX hangSanXuat, String loaiNhienLieu) {
		super(loaiPhuongTien, hangSanXuat);
		this.loaiNhienLieu = loaiNhienLieu;
	}

	public String getLoaiNhienLieu() {
		return loaiNhienLieu;
	}

	public void setLoaiNhienLieu(String loaiNhienLieu) {
		this.loaiNhienLieu = loaiNhienLieu;
	}

	@Override
	public double layVanToc() {
 		return 60;
	}

	 
}
