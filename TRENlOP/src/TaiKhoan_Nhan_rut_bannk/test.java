package TaiKhoan_Nhan_rut_bannk;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
//		// Scanner sc = new Scanner(System.in);
//
//		taiKhoan a = new taiKhoan("01234", 10000);
//		taiKhoan b = new taiKhoan("45678", 2000);
//		
//		a.inthongitn();
//		a.nap(1000);
//		a.rut(100);
//		a.chuyenKhoann(10, a);
//		a.inthongitn();
//		

		
		
		taiKhoan tk1 = new taiKhoan("12345", 150000);
		taiKhoan tk2 = new taiKhoan("45678", 20000);
		
		
		tk1.inthongtin();
		tk1.rut(1000);
		tk1.nap(2000);
		tk1.chuyenkhoan(5000, tk2);
		tk1.inthongtin();    
	}
}



