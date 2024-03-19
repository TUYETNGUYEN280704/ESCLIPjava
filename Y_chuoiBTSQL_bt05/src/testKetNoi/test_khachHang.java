package testKetNoi;

import java.util.ArrayList;

import dao_doiTuongTRuyXuatDl.khachHangDAO;
import dao_doiTuongTRuyXuatDl.sachDAO;
import model.KHACHHANG1;
import model.SACH1;
import java.util.Date;


public class test_khachHang {
public static void main(String[] args) {
	
	
	
//	KHACHHANG1 s0 = new KHACHHANG1("123", "NGUYEN A", new Date(2004 - 1900, 11, 4), "ABC");
//	khachHangDAO.getInstance().insert(s0);

	
	ArrayList<KHACHHANG1> list = khachHangDAO.getInstance().selectAll();
	for(KHACHHANG1 kh : list) {
		System.out.println(kh.toString());
		
		
		
		
}
}
}
