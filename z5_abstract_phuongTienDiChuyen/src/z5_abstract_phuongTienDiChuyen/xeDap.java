package z5_abstract_phuongTienDiChuyen;

public class xeDap extends PhuongTienDiChuyen {

	

	public xeDap(String loaiPhuongTien, HangSX hangSanXuat) {
		super(loaiPhuongTien, hangSanXuat);
 	}

	@Override
	public double layVanToc() {
 		return 20;
	}
	
	
	
}
