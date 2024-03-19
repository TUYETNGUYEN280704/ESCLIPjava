
public class e2_main {
public static void main(String[] args) {
	e1_equals_hascode md1 = new e1_equals_hascode(15, 5, 20250);
	e1_equals_hascode md2 = new e1_equals_hascode(11, 1,  20250);
	e1_equals_hascode md3 = new e1_equals_hascode(15, 5, 20250);

	System.out.println(md1);
	System.out.println(md2);
	System.out.println(md3);

	
	System.out.println(" md1 so sánh vs md2: "+ md1.equals(md2));
	System.out.println(" md1 so sánh vs md2: "+ md1.equals(md3));
	

}
}
