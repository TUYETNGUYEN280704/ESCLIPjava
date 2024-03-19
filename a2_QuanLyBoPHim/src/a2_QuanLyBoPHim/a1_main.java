package a2_QuanLyBoPHim;

public class a1_main {
public static void main(String[] args) {
	Ngay ngay1 = new Ngay(15, 05, 2022);
	Ngay ngay2 = new Ngay(31, 1, 2025);
	Ngay ngay3 = new Ngay(16, 02, 2030);
	
	hangSanXuat hsx1 = new hangSanXuat("hang a", "vn");
	hangSanXuat hsx2 = new hangSanXuat("hang b", "mỹ");
	hangSanXuat hsx3 = new hangSanXuat("hang c", "balan");
	
	BoPhim bp1 = new BoPhim("bố già", ngay1, hsx1, 5000, ngay1);
 	BoPhim bp2 = new BoPhim("mai", ngay2, hsx2, 25000, ngay2);
 	BoPhim bp3 = new BoPhim("yêu", ngay3, hsx3, 15000, ngay3);

System.out.println(" giá ve 1 rẻ hơn 2: "+ bp1.ktrGiaVe(bp2));
System.out.println(" giá ve 1 rẻ hơn 3: "+ bp1.ktrGiaVe(bp3));
System.out.println(" giá ve 2 rẻ hơn 3: "+ bp2.ktrGiaVe(bp3));

System.out.println(" tên hãng sx của bp1: "+bp1.tenHangSx());
System.out.println(" tên hãng sx của bp2: "+bp2.tenHangSx());
System.out.println(" tên hãng sx của bp3: "+bp3.tenHangSx());

System.out.println(" bp1 giam 10 % = " + bp1.giaVekhuyenMai(10));
System.out.println(" bp2 giam 20 % = " + bp2.giaVekhuyenMai(20));
System.out.println(" bp3 giam 30 % = " + bp3.giaVekhuyenMai(30));

}
}
