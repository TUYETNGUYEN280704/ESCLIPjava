package z1_kethua;

public class hocSinh extends connguoi {
	private double diemSo;

	public hocSinh(String an, String ngủ, double diemSo) {
		super(an, ngủ);
		this.diemSo = diemSo;
	}

	public double getDiemSo() {
		return diemSo;
	}

	public void setDiemSo(double diemSo) {
		this.diemSo = diemSo;
	}

	public double diemso() {
		System.out.println(" diem so 10");
		return this.diemSo;
	}
}
