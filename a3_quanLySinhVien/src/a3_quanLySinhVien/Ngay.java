package a3_quanLySinhVien;

public class Ngay {
	private int ngay;
	private int thang;
	private int nam;

	public Ngay(int ngay, int thang, int nam) {
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
	}

	public int getNgay() {
		return ngay;
	}

	public void setNgay(int ngay) {
		this.ngay = ngay;
	}

	public void setThang(int thang) {
		this.thang = thang;
	}

	public int getNam() {
		return nam;
	}

	public void setNam(int nam) {
		this.nam = nam;
	}

//	public Ngay(int n, int t, int n)
//	{
//		this.ngay = n;
//		this.thang= t;
//		this.nam=nam;
//	}
//	
//	//get laf lay ra ko truyen j vao rungf return  
//	//set thay the gtr can truyen vao , ko return 
//	public int getNgay()
//	{
//		return this.ngay;
//	}
//	public void setNgay(int n) {
//		this.ngay=n;
//	}

}
