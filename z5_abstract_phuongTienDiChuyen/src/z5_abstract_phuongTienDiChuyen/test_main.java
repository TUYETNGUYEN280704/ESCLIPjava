package z5_abstract_phuongTienDiChuyen;

public class test_main {
	public static void main(String[] args) {

//	System.out.println(" lấy hảng sản xuất ");
//	System.out.println(" p1: "+pt1.layTenHangSanXuat());
//	
//	System.out.println(" bắt đầu :");
//	pt2.batDau();
//	
//	System.out.println(" lấy vận tốc ");
//	System.out.println(" p1 : "+ pt1.layTenHangSanXuat());
//	System.out.println(" p2 : "+ pt2.layTenHangSanXuat());
//	System.out.println(" p3 : "+ pt3.layTenHangSanXuat());
//
//	System.out.println(" cất cánh: ");
//	pt2.catCanh();
		HangSX h1 = new HangSX("hãng oto ", "việt nam ");
		HangSX h2 = new HangSX("hãng xe đạp ", "usa");
		HangSX h3 = new HangSX("hãng máy bay ", "nhật");

		PhuongTienDiChuyen pt1 = new xeOto("oto", h1, "xăng E95");
		// PhuongTienDiChuyen pt2 = new mayBay("máy bay ", h3, " khí đốt");
		// nếu muốn lấy ra "cất cánh" thì phải chuyển thành như sau
		mayBay pt2 = new mayBay("máy bay ", h3, " khí đốt ");
		PhuongTienDiChuyen pt3 = new xeDap("xe đạp ", h2);
 
		// System.out.println(" cat canh của may bay"pt2.catCanh());
		System.out.println(" lấy vận tốc của các phương tiện ");
		System.err.println(" lấy vtoc pt1 ô tô " + pt1.layVanToc());
		System.err.println(" lấy vtoc pt2 máy bay " + pt2.layVanToc());
		System.err.println(" lấy vtoc pt3 xe đạp " + pt3.layVanToc());

		pt1.batDau();
		pt2.batDau();
		pt3.batDau();
		
		pt1.tangToc();
		pt2.tangToc();
		pt3.tangToc();
		
		pt1.dungLai();
		pt2.dungLai();
		pt3.dungLai();

	}
}
