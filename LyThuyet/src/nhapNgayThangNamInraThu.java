import java.util.Scanner;

public class nhapNgayThangNamInraThu {
	public static void main(String[] args) {
//		int day, month, year;
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println(" nhập ngày , tháng , năm ");
//		System.out.println("nhập ngày: ");
//		day = sc.nextInt();
//		System.out.println("nhập tháng: ");
//		month = sc.nextInt();
//		System.out.println("nhập năm: ");
//		year = sc.nextInt();
//
//		int y0 = year - (14 - month) / 12;
//		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
//		int m0 = month + 12 * ((14 - month) / 12) - 2;
//		int thu = (day + x + 31 * m0 / 12) % 7;
//
//		System.out.println("day là: " + thu);
//
//		if (thu == 0) {
//			System.out.println("chu nhat ");
//		} else if (thu == 1) {
//			System.out.println("thứ 2 ");
//		} else if (thu == 2) {
//			System.out.println("thứ 3 ");
//		} else if (thu == 3) {
//			System.out.println("thứ 4");
//		} else if (thu == 4) {
//			System.out.println("thứ 5");
//		} else if (thu == 5) {
//			System.out.println("thứ 6");
//		} else {
//			System.out.println("thứ 7");
//		}

		
		int ngay, thang, nam;
		int s= 0;
		Scanner sc = new Scanner(System.in);

		String thu[] = {"thu 5","thứ 6","thứ 7","thứ 8","thứ 2", "thứ 3","thứ 4"};
		System.out.println(" nhập ngày , tháng , năm ");
		System.out.println("nhập ngày: ");
		ngay = sc.nextInt();
		System.out.println("nhập tháng: ");
		thang = sc.nextInt();
		System.out.println("nhập năm: ");
		nam = sc.nextInt();
		
		s = ngay;
		for (int i =1;i<thang;i++) {
			switch (i) {
			case 1: 
			case 3:
			case 5:
			case 8:
			case 10:
			case 12:
				System.out.println(" tháng có 31 ngày:" );
				s = s+31;
				break;
			case 4:
				System.out.println(" tháng có 30 ngày: ");
				s= s+30;
				break;
			case 2:
				if((nam %4 ==0 && nam %100 != 0)) {
					System.out.println(" tháng có 28 ngày: ");
				}else {
					System.out.println(" tháng có 29 ngày: ");
				}
				break;
				
				
			
			default:
				System.out.println(" không hợp lệ, yêu cầu nhập lại ! ");
				}
		}
			
			for ( int i = 1970; i< nam; i++) {
				if(nam %4 ==0 && nam %100 != 0) {
					s = s+336;
				}else {
					s=s+365;
				}}
			
				s = s-1;
				System.out.println(" thứ là "+thu[s%7]);
				}
			
	}
	


