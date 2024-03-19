/*
 * overloading dùng để phân biệt ví dụ như tham số truyền vào là int htif là số nguyên 
 * ---double thì là số thực 
 */

// tìm min ( int và double )
// tính tổng và phân biệt ( int và double ) thông qua tham số truyền vào 

package z3_overloading;

import java.util.Iterator;

public class math {
public int  timMIN(int a, int b ) {
	if ( a< b) {
		return a;
	}else {
		return b ;
		
	}
}

public double timMIN(double a, double b) {
	if ( a < b)
	{
		return a;
	}else {
		return b;
	}
	}

// tổng
public double tinhTong(double a, double b) {
	return a+b;
}
 public double tinhTong( double [] arr) {
double tong = 0;
for (int i = 0; i < arr.length; i++) {
	tong += arr[1];
}
return tong;
	
}
}
