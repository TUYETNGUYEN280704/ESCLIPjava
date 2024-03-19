
public class c2_main {
	public static void main(String[] args) {
		c1_Get_Set md = new c1_Get_Set(28, 7, 2004);
//	System.out.println(" ngày , tháng, năm " );

		System.out.println(" ngày : " + md.getDay());
		md.setDay(32);
		System.out.println(" ngày :" + md.getDay());
		md.setDay(19);
		System.out.println(" ngày :" + md.getDay());

		System.out.println(" tháng : " + md.getMonth());
		md.setMonth(13);
		System.out.println(" tháng : " + md.getMonth());
		md.setMonth(12);
		System.out.println(" tháng : " + md.getMonth());

		System.out.println(" date: " + md.getDay() + "_" + md.getMonth() + "_" + md.getYear());
	}
}
