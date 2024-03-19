package a2_QuanLyBoPHim;

public class BoPhim {
	private String tenPhim;
	private Ngay namsx;
	private hangSanXuat hangsx;
	private double giaVe;
	private Ngay ngayChieu;
	public BoPhim(String tenPhim, Ngay namsx, hangSanXuat hangsx, double giaVe, Ngay ngayChieu) {
		super();
		this.tenPhim = tenPhim;
		this.namsx = namsx;
		this.hangsx = hangsx;
		this.giaVe = giaVe;
		this.ngayChieu = ngayChieu;
	}
	
	
	public String getTenPhim() {
		return tenPhim;
	}
	public void setTenPhim(String tenPhim) {
		this.tenPhim = tenPhim;
	}
	public Ngay getNamsx() {
		return namsx;
	}
	public void setNamsx(Ngay namsx) {
		this.namsx = namsx;
	}
	public hangSanXuat getHangsx() {
		return hangsx;
	}
	public void setHangsx(hangSanXuat hangsx) {
		this.hangsx = hangsx;
	}
	public double getGiaVe() {
		return giaVe;
	}
	public void setGiaVe(double giaVe) {
		this.giaVe = giaVe;
	}
	public Ngay getNgayChieu() {
		return ngayChieu;
	}
	public void setNgayChieu(Ngay ngayChieu) {
		this.ngayChieu = ngayChieu;
	}
	
// câu 1: ktra gia ve của 1 phim bất kỳ có rẽ hơn
	//****giá vé của 1 phim khác hay ko ?
	public boolean ktrGiaVe(BoPhim veKhac) {
//		if(this.giaVe >= veKhac.giaVe)
//		{
//			return true;
//		}else {
//			return false;
//		}
	return this.giaVe < veKhac.giaVe;
	}
	
	//câu 2; cho biêt steen của hãng sx phim
 public String tenHangSx()
 {
	// System.out.println(" Hãng xuất xuất có tên là :");
	 return this.hangsx.getTenHang();
 }
 
 // câu 3: cho bt giá vé của phim khi có khuyến mãi 
 /*ví dụ như khi khuyên mãi 10%, 20%... )
  * số tiền khuyến mãi được giảm  trừ theo %giá bán 
  */
 public double giaVekhuyenMai(double x)
 {
//	 if(this.giaVe *(1-x/100))
//	 {
//		 return this.giaVe = giaVekhuyenMai(10);
//	 }else {
//		 return false;
//	 }
// }
// }
	 return this.giaVe *(1-x/100);
 }
	 
}
	
