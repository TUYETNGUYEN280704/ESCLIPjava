package z3_overloading;

public class test_main {
public static void main(String[] args) {
	math m1 = new math();
	
	System.out.println("min  "+m1.timMIN(3, 4)) ;
	System.out.println("min  "+	m1.timMIN(9.5, 10.5));
	System.out.println("tinh tong  "+m1.tinhTong(2, 10));
	System.out.println("tinh tong  "+m1.tinhTong(2.1, 10.1));

	// tính mảng thì cần tạo mảng mới
	double arr[] = new double[] {1,2,3};
	System.out.println(" tinh tong (arr)= "+m1.tinhTong(arr) );
}
}    
