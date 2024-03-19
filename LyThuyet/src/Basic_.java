import java.util.Scanner;

public class basic {
	public static void main(String[] args) {

		// nhập dữ liệu từ bàn phím
		Scanner sc = new Scanner(System.in);

		// khai báo biến
		String thongbao = "xin chào "; // thongbao la bien

		// in ra / xuất ra màn hình
		int a = 6;
		System.out.println(" xuất cái j đó ra : " + a);

		// hoặc nhập từ a từ bàn phím
		System.out.println(" nhập b : ");
		int b;
		Scanner sc1 = new Scanner(System.in);
		b = sc1.nextInt();
		System.out.println(" ==> b  = " + b);

		// các kiểu dl java
		// số nguyên -> byte, short, int, long;
		// số thực -> float, double, boolean;
		// đúng sai ---> boolean
		// ký tự ---> char
		// chuỗi ---> String // S phải viết hoa
		// mảng ----> Array
		// số thực ---> Double
		// VÍ DỤ
		String teensach = " lập trình java";
		int namxuatban = 2024;
		double giatien = 10.0;
		boolean consach = true;// hoặc là false
		char makho = "N";
		// sau đó xuất ra như này
		System.out.println(" tên sách: " + teensach);
		System.out.println(" nam xuất bản" + namxuatban);
		// ... tương tự

		// b6 : HẰNG SỐ -> cố định
		// ví dụ
		final int x = 10;// x sẽ luôn là 10 ko thể thay thế , nếu thay thế sẽ báo lỗi
		// ví dụ
		final int x = 10;
		System.out.println(x);
		x = 10; // xuống đây mà gán lại x = 10 thì sẽ sai và ko run dc

		// BÀI 9 : NHẬP DL TỪ BÀN PHÍM ( next...
		// nextBloolean ,next.(Byte--số nguyên ,Double,Float,Int,Line-- chuỗi có giá trị là string,Long,Short )
		//ví dụ
		Scanner sc = new Scanner(System.in);
		System.out.println(" nhập vào họ tên, masv, diemthi : ");
		String hoten = sc.nextLine();
		long masv = sc.nextLong();
		float diemthi =sc.nextFloat();
		
	//10 , CHUYỂN ĐÔI KIBài ÉP KIỂU
		int a = 90;
		int b = 91;
		System.out.println("a = " + a);
		System.out.println("b = " + b);

		// Ep kiểu ngầm định
		float c = a;
		float d = b;

		System.out.println("c = " + c);
		System.out.println("d = " + d);

		// ép kiểu tường minh
		float e = 9.6f;
		float f = 10.5f;
		System.out.println("e = " + e);
		System.out.println("f = " + f);

		int g = (int) e;
		int h = (int) f;
		System.out.println("g = " + g);
		System.out.println("h = " + h);

		// ép kiểu giữa biến nguyên thủy và đối tượng
		final int x = new Integer(12);
		System.out.println("x = " + x);

		
		/*
		 * bài 20 kiểm tra số ngày của tháng 
		 * tháng 1,3,5,7,8,10,12 có 31 ngày 
		 * tháng 4,6,9,11 có 30 ngày 
		 * tháng 2 , năm nhuận có 29 ngày , ko nhuận thì 28 ngày 
		 * 
		 * CÁCH TÍNH năm nhuận dương lịch 
		 * để tính ta lấy năm đó chia cho 4 
		 * + nếu chia hết cho 4 thì năm Dương lịch đó là năm nhuận
		 * + vs những năm tròn thế kỷ ( có 2 số 00 ở cuối ) thì lấy số năm chia cho 400
		 * + nếu chia hết cho 400 thì năm đó là năm nhuận 
		 * 
		 * ví dụ 2020, 2024 là những năm nhuận dương lịch vì chia hết cho 4
		 * 2021 ko là năm nhuận dương lịch vì chia 4 dư 1
		 * 2000 năm 2400 là các năm nhuận vì chia hết cho 400
		 * 
		 */
	
		
		// tính tháng 2 như này 
		// t2: tháng 2 , năm nhuận có 29 ngày , ko nhuận thì 28 ngày
		case 2: {
			if ((nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0)) {
				System.out.println(" năm nhuận có 29 ngày :");
			} else {
				System.out.println(" năm ko nhuận có 28 ngày :");
			}
		}break;

		
		// Vòng lặp FOR
		//*
		for (initialization; // biểu thức khởi tạo 
				loopContinuationTest;// điều kiện
					increment)// tăng giảm đơn vị 
		{statement:// khối lệnh
			}
	}

}

