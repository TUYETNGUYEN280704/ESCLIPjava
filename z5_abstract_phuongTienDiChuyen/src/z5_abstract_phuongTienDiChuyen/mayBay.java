package z5_abstract_phuongTienDiChuyen;

public class mayBay extends PhuongTienDiChuyen {
	private String loaiNhienLieu;

	// constructor có thể viết theo cách này ,
	// để tuyền thẳng or gán giá trị vào

	/*
	 * public MayBay(String loaiNhienLieu){ super(" máy bay"); this.loaiNhienLieu =
	 * loaiNhienLieu; }
	 */

	public mayBay(String loaiPhuongTien, HangSX hangSanXuat, String loaiNhienLieu) {
		super(loaiPhuongTien, hangSanXuat);
		this.loaiNhienLieu = loaiNhienLieu;
	}

	public String getLoaiNhienLieu() {
		return loaiNhienLieu;
	}

	public void setLoaiNhienLieu(String loaiNhienLieu) {
		this.loaiNhienLieu = loaiNhienLieu;
	}

	public void catCanh() {
		System.out.println(" cát cánh ");
	}

	public void haCanh() {
		System.out.println(" hạ cánh");
	}

	@Override
	public double layVanToc() {
		return 500;
	}

}
