package testKetNoi;

import java.util.ArrayList;
import java.util.Iterator;

import dao_doiTuongTRuyXuatDl.sachDAO;
import model.SACH1;

public class testSachDAO {
public static void main(String[] args) {
	/*-------------test INSERT */// -> ĐÃ THÀNH CÔNG----------------

	//sach s0 = new sach("abc1"," lập trình abc",150000, 2025);
//	sach s2 = new sach(" c++"," lập trình c++",10000, 2035);
//	
//	// tạo ra 1 đối tượng
//	sachDAO.getInstance().insert(s1);
//	// thêm nhiều sinh viên cùn lúc dùng vòng lặp
//	
//	for(int i = 0; i<10;i++) {
//		sach s3 = new sach("python" +i," lập trình i "+i,10000, 2045);
	//  sachDAO.getInstance().insert(s0);
//
//	}
	
	
	
//	/*--------------test UPDATE*///---------------------------------------
//	sach s2 = new sach(" c++"," lập trình c++",7000, 2075);
//	sachDAO.getInstance().update(s2);
////	
	
	
	
	/*--------------test delete*///---------------------------------------
//	sach s2 = new sach(" c++"," lập trình c++",7000, 2075);
//	sachDAO.getInstance().delete(s2);
////	
	
	
	/*--------------test arraylist*///---------------------------------------
	ArrayList<SACH1> list = sachDAO.getInstance().selectAll();
	for(SACH1 s1 : list) {
		System.out.println(s1.toString());
	}
	
	
	
	/*-----------------test selectById----------------------------------*/
	System.out.println("=============================");
	SACH1 find = new SACH1();
	find.setId("abc1");
	SACH1 s5 = sachDAO.getInstance().selectById(find);
	System.out.println(s5);

	
	
	/*-----------------test selectByCondition----------------------------------*/
	System.out.println("=============================");
	ArrayList<SACH1> list3 = sachDAO.getInstance().selectByCondition("giaBan<70000");
	for(SACH1 s1 : list3) {
		System.out.println(s1.toString());
	}
	
}
}
