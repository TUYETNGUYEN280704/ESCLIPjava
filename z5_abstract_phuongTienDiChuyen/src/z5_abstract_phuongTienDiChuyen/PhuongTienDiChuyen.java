package z5_abstract_phuongTienDiChuyen;

public abstract class PhuongTienDiChuyen {
	protected String loaiPhuongTien;
	protected HangSX hangSanXuat;

//	public PhuongTienDiChuyen(String loaiPhuongTien) {
	

	public PhuongTienDiChuyen(String loaiPhuongTien, HangSX hangSanXuat) {
 		this.loaiPhuongTien = loaiPhuongTien;
		this.hangSanXuat = hangSanXuat;
	}

	

	public String getLoaiPhuongTien() {
		return loaiPhuongTien;
	}


	public void setLoaiPhuongTien(String loaiPhuongTien) {
		this.loaiPhuongTien = loaiPhuongTien;
	}


	public HangSX getHangSanXuat() {
		return hangSanXuat;
	}


	public void setHangSanXuat(HangSX hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}

	//***********************

	public String layTenHangSanXuat() {
		return this.hangSanXuat.getTenHangSX();
	}

	public void batDau() {
		System.out.println(" bắt đầu : ");
		
		
	}
	
	public void tangToc() {
		System.out.println(" tăng tốc: ");
	}
	
	public void dungLai() {
		System.out.println(" dừng lại : ");

	}
	
	public abstract double layVanToc();
	
}
