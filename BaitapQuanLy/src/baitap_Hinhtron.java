import java.util.Scanner;

public class baitap_Hinhtron {
	public static void main(String[] args) {
		double r, chuVi, dienTich;
		// nhập r từ bàn phím
		// Scanner sc = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);

		System.out.println(" nhập bán kính r: ");
		r = sc.nextDouble();

		// tính chu vi
		chuVi = 2 * Math.PI * r;
		System.out.println(" chu vi của hình tròn là : " + chuVi);
		System.out.println(" chu vi của hình tròn là : " + Math.round(chuVi));
		System.out.println(" chu vi của hình tròn là : " + Math.round(chuVi*100.0)/100.0);// làm tròn 2 số thập phân cuối

		
		// diện tích
		dienTich = 2 * Math.PI * Math.pow(r, 2);
		System.out.println(" diên tích của hình tròn là : " + dienTich);
		System.out.println(" diên tích của hình tròn là : " + Math.round(dienTich));

	}
}
/*
 * bài tập : tính diện tích và chu vi của hình tròn //khi biết bán kính R được
 * nhập từ bàn phím
 */
