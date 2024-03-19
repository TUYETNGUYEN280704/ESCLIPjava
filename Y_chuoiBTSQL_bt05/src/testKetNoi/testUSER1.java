package testKetNoi;

import dao_doiTuongTRuyXuatDl.USERDAO;
import dao_doiTuongTRuyXuatDl.USERDAO2;

import model.USER1;

public class testUSER1 {
	public static void main(String[] args) {

		//========================================================
		
		// insert dữ liệu
//		USER1 u1 = new USER1("u1", "u123", "UUU");
//		USERDAO.getInstance().insert(u1);
//	

//========================================================

		
// xuất cái thông tin vừa insert
//	USER1 u_find = new USER1("u1","u123","UUU");
//	USER1 u_result = USERDAO.getInstance().selectById(u_find);
//	System.out.println(u_result);
	
		
//========================================================
		
//// khi hacker hệ thống ko cần kêu rõ tên thì code như sau
//	USER1 u_find1 = new USER1("x\' or 1=1; -- ", "", "");
//	USER1 u_reUser1 = USERDAO.getInstance().selectById(u_find1);
//	System.out.println(u_result);
	
		
	
	//========================================================
	//test USERDAO2
	
	USER1 u_find3 = new USER1("x\' or 1=1; -- ", "", "");
	USER1 u_result3 = USERDAO2.getInstance().selectById(u_find3);
	System.out.println(u_result3); 
	// CÁI NÀY THÌ HACEKER KO THỂ HACK DỮ LIỆU CỦA MK NX
	
	}
}