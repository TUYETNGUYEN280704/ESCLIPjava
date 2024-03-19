package test;

import code_A.vidu;
//import code_B.vidu; ko đc import 2 cái class cùng tên 
/* nhung có thể tạo thư mục từ code _ b
 * 
 */

public class test_vidu {
public static void main(String[] args) {
	vidu vd = new vidu(1, 2);
System.out.println(vd.getA());

code_B.vidu vd2 = new code_B.vidu(1, 2, 3);
System.out.println(vd2.getA());
}
 

	
}
