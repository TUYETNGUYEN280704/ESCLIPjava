package a_quanLiDanhSach;

public class b_main {
public static void main(String[] args) {
	Ngay ngay1 = new Ngay(2, 2, 2000);
	Ngay ngay2 = new Ngay(3, 2, 2000);
	Ngay ngay3 = new Ngay(4, 2, 2000);

	
	TacGia tg1 = new TacGia(" nguyễn vân a", ngay1 );
	TacGia tg2 = new TacGia(" nguyễn vân b", ngay2 );
	TacGia tg3 = new TacGia(" nguyễn vân c", ngay3 );

	
	Sach s1 = new Sach(" slập trình java", 5000, 2001, tg1);
	Sach s2 = new Sach(" lập trình c", 15000, 2002, tg2);
	Sach s3 = new Sach(" lập trình py", 25000, 2003, tg3);

	//a
	s1.InTenSach();
	s2.InTenSach();
	s3.InTenSach();
	
	// câu b : ktra sách có xuất bản cùng năm hay ko 
	System.out.println(" so sanh nxb s1 và s2"+ s1.KtrXb(s2));
	System.out.println(" so sanh nxb s1 và s3"+ s1.KtrXb(s3));

	 // câu c : gia sau khi giảm đi 10%
	System.out.println(" gia sau khi gairm khi 10% là "  +s1.GiaSauKhiGiam(10));

}
}
