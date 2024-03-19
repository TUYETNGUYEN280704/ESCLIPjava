package a3_quanLySinhVien;

public class a1_main {
	public static void main(String[] args) {
		Ngay ngay1 = new Ngay(15, 1, 2000);
		Ngay ngay2 = new Ngay(15, 1, 2000);
		Ngay ngay3 = new Ngay(19, 7, 2002);

		Lop lop1 = new Lop(" lop av1: ", " khoa httt");
		Lop lop2 = new Lop(" lop av2: ", " khoa cnpm");
		Lop lop3 = new Lop(" lop av3: ", " khoa ktmt");

//	lic class SinhVien {
//		private int MSSV;
//		private String hoTen;
//		private Ngay date;
//		private double avg;
//		private Lop lop;
		SinhVien sv1 = new SinhVien(123, "nguyen van a", ngay1, 9.3, lop1);
		SinhVien sv2 = new SinhVien(456, "nguyen van b", ngay1, 9.1, lop2);
		SinhVien sv3 = new SinhVien(789, "nguyen van c", ngay3, 9.9, lop3);

		System.out.println(" teen khoa:");
		System.out.println(" khoa cua sv1: " + sv1.layTenKhoa());
		System.out.println(" khoa cua sv2: " + sv2.layTenKhoa());
		System.out.println(" khoa cua sv3: " + sv3.layTenKhoa());

		System.out.println(" sinh vien 1 dau hay ko ( dau->true),(ko dau->false); " + sv1.ktrSV());
		System.out.println(" sinh vien 2 dau hay ko ( dau->true),(ko dau->false);  " + sv2.ktrSV());
		System.out.println(" sinh vien 3 dau hay ko ( dau->true),(ko dau->false);  " + sv3.ktrSV());

		System.out.println(" sv1 có ngày sinh giống vs sv2 " + sv1.ktraNGSINH(sv2));
		System.out.println(" sv1 có ngày sinh giống vs sv2 " + sv1.ktraNGSINH(sv2));
		System.out.println(" sv2 có ngày sinh giống vs sv3 " + sv2.ktraNGSINH(sv3));

	}

}
