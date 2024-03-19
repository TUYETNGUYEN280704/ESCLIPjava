package z4_abstract_truu_tuong;

public class test_main {
public static void main(String[] args) {
	toaDo td1 = new toaDo(5, 5);
	toaDo td2 = new toaDo(7, 9);
	toaDo td3 = new toaDo(12, 1);

//	Hinh h1 = new Hinh(); => lỗi biên dịch vì Hinh là lớp trừu tượng
	Hinh h3 = new Diem(td1);
	Hinh h1 = new HinhTron(td2, 10);
	Hinh h2 = new HinhChuNhat(td3, 5, 10);
 
	System.out.println(" dt1 : "+h1.tinhDienTich());
	System.out.println(" dt2 : "+h2.tinhDienTich());
	System.out.println(" dt3 : "+h3.tinhDienTich());

}
}
