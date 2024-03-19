package BTTHSO3;

public class SinhVien {

	private int mssv;
	private String hoten;
	private float TH;
	private float LT;
	
	public SinhVien() {
		
	}
	public SinhVien(int mssv, String hoten, float TH, float LT) {
		this.mssv = mssv;
		this.hoten = hoten;
		this.TH = TH;
		this.LT = LT;
		
	}
	
	public int getMssv() {
		return mssv;
		
	}
	public void setMssv(int mssv) {
		this.mssv=mssv;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public float getTH() {
		return TH;
	}
	public void setTH(float tH) {
		TH = tH;
	}
	public float getLT() {
		return LT;
	}
	public void setLT(float lT) {
		LT = lT;
	}
	
	
	
	
	@Override
	public String toString() {
		return "mssv" + mssv +
	}
}
	
	
	
	
	
	