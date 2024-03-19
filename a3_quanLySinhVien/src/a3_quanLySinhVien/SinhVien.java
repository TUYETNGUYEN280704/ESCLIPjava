package a3_quanLySinhVien;

public class SinhVien {
	private int MSSV;
	private String hoTen;
	private Ngay date;
	private double avg;
	private Lop lop;

	public int getMSSV() {
		return MSSV;
	}

	public void setMSSV(int mSSV) {
		MSSV = mSSV;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public Ngay getDate() {
		return date;
	}

	public void setDate(Ngay date) {
		this.date = date;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public Lop getLop() {
		return lop;
	}

	public void setLop(Lop lop) {
		this.lop = lop;
	}

	public SinhVien(int mSSV, String hoTen, Ngay date, double avg, Lop lop) {
		super();
		MSSV = mSSV;
		this.hoTen = hoTen;
		this.date = date;
		this.avg = avg;
		this.lop = lop;
	}

	// a , cho biet ten khhoa ma sinh vien dang theo hc
	public String layTenKhoa() {
		return this.lop.getTenKhoa();
	}

	// cau b, cho biet sv cos dau hay ko ( diem trung binhf >= 5)
	public boolean ktrSV() {
		if (this.avg >= 5) {
			return true;
		} else {
			return false;
		}
	}

	// cau c; ktr sv co ngay sinh giong voi ngsinh cua 1 sv khac
	public boolean ktraNGSINH(SinhVien ngaykhac) {
//		if(this.date == ngaykhac.date) {
//			return true;
//		}else {
//			return false;
//		}
		return this.date == ngaykhac.date;

	}
}