package a_quanLiMayTinh;

public class a1_main {
	public static void main(String[] args) {
		Ngay ngay1 = new Ngay(15, 1, 2000);
		Ngay ngay2 = new Ngay(16, 1, 2000);
		Ngay ngay3 = new Ngay(17, 1, 2000);

		quocGia qg1 = new quocGia(123, "việt nam");
		quocGia qg2 = new quocGia(456, "hàn");
		quocGia qg3 = new quocGia(789, "anh");

		Hang hang1 = new Hang("ABC", qg1);
		Hang hang2 = new Hang("DEF", qg2);
		Hang hang3 = new Hang("GHT", qg3);

		MayTinh mt1 = new MayTinh(hang1, ngay1, 10000, 2);
		MayTinh mt2 = new MayTinh(hang2, ngay2, 15000, 3);
		MayTinh mt3 = new MayTinh(hang3, ngay3, 25000, 4);

		// phép tính
		System.out.println(" mt1 có giá bán thấp hơn mt2 " + mt1.giaBanThapHon(mt2));
		System.out.println(" mt2 có giá bán thấp hơn mt3 " + mt2.giaBanThapHon(mt3));
		System.out.println(" mt2 có giá bán thấp hơn mt1 " + mt2.giaBanThapHon(mt1));

		System.out.println("mt1 có tên qg là  "+mt1.laytenqg());
		System.out.println("mt2 có tên qg là  "+mt2.laytenqg());
		System.out.println("mt3 có tên qg là  "+mt3.laytenqg());

	}
}
