//thuộc tính : 
/* -String tenLoaiCaPhe
 * -double giaTien1Kg
 * -double khoiLuong
 * 
 * phương thức
 * double tinhTongTien()
 * boolean ktraKLlonHon( double kll)
 * boolean ktraTongTien>500()
 * double giamGia(double x) // thêm double x vì cần phải nhập vào để biết giảm giá bao nhiêu 
 * double giaSauKhiGiam( double x)
 */

public class b1_HoaDonCaPhe {
	private String tenLoaiCaPhe;
	private double giaTien1Kg;
	private double khoiLuong;

	// constructor
	public b1_HoaDonCaPhe(String ten, double gia, double kl) {
		this.tenLoaiCaPhe = ten;
		this.giaTien1Kg = gia;
		this.khoiLuong = kl;

	}

	// phương thức
	// TÍNH TỔNG TIỀN
	public double tinhTongTien() {
		return this.giaTien1Kg * this.khoiLuong;
	}

	// kiểm tra khối lượng lớn hơn -> true / false
	public boolean KtraKLlonHon(double kL) {
//		if( this.khoiLuong > x)
//		{
//			return true;
//		}else {
//			return false;
//		}
		// ngắn gọn hơn là
		return this.khoiLuong > kL;

	}

	// KIỂM TRÂ TỔNG TIỀN của hóa đơn có LỚN HƠN 500K ko
	public boolean ktraTonglonHon500() {
		return this.tinhTongTien() > 500000;
	}

	// TÍNH SỐ TIỀN GIẢM GIÁ , giảm x% cho các hóa đơn có giá trị lớn lơn 500k
	public double tienGiamGia(double x) {
		if(this.tinhTongTien()>500000) {   //-> cần làm điều kiện cho lớn hơn 500 oce
			return (x / 100) * this.tinhTongTien();
		}else {
			return 0;
		}
		
	 
	}

	// Tính số tiền khách phải trả sau khi đã giảm giá
	public double tienSauKhiGiam(double x) {
		return this.tinhTongTien() - this.tienGiamGia(x);
	}

}
