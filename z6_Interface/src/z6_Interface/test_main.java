package z6_Interface;

public class test_main {
	public static void main(String[] args) {
		System.out.println(" test câu a: ");
		mayTinhCasioFX500 mfx500 = new mayTinhCasioFX500();
		mayTinhVinaCal500 mvn500 = new mayTinhVinaCal500();

		System.out.println(" 5+3= " + mfx500.cong(5, 3));
		System.out.println(" 4*5= " + mfx500.nhan(4, 5));
		System.out.println(" 4/0= " + mfx500.chia(4, 0));

		
		System.out.println(" test câu b : ");
		double[] arr = new double[] {5,1,3,4,5,8,0};
		double[] arr2 = new double[] {6,2,7,9,2,4,5};
	
		sapXepChen sxchen = new sapXepChen();
		SapXepChon sxchon = new SapXepChon();
		
		//tesst
		sxchen.sapXepTang(arr);
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr[i]+" ");
			//double d = arr[i];
		}
		System.out.println();
		sxchon.sapXepGiam(arr2);
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]+" ");
			//double d = arr2[i];
		}
			System.out.println( );
		}
	}
