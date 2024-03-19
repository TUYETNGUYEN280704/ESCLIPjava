
public class b2_main {
	public static void main(String[] args) {
		b1_HoaDonCaPhe hd1 = new b1_HoaDonCaPhe(" cafe chồn", 100000, 1.5);
		b1_HoaDonCaPhe hd2 = new b1_HoaDonCaPhe(" cafe chồn", 100000, 5.5);

		System.out.println(" tổng tiền là : " + hd1.tinhTongTien());
		System.out.println(" tổng tiền là : " + hd2.tinhTongTien());

		System.out.println(" ktra khối lượng lớn hơn 2kg là : " + hd1.KtraKLlonHon(2));
		System.out.println(" ktra khối lượng lớn hơn 1kg là : " + hd1.KtraKLlonHon(1));

		System.out.println(" tổng tiền của hóa đơn lớn hơn 500k: " + hd1.ktraTonglonHon500() +  " vì hd có giá tiền là : " + hd1.tinhTongTien());
		System.out.println(" tổng tiền của hóa đơn lớn hơn 500k: " + hd2.ktraTonglonHon500() +  " vì hd có giá tiền là : " + hd2.tinhTongTien());
		System.out.println(" số tiền được giảm giá là :"+ hd1.tienGiamGia(10));
		System.out.println(" số tiền được giảm giá là :"+ hd2.tienGiamGia(10));
		System.out.println(" số tiền còn lại sau khi được giảm giá : "+ hd1.tienSauKhiGiam(10));
		System.out.println(" số tiền còn lại sau khi được giảm giá : "+ hd2.tienSauKhiGiam(10));

		
	}
}
