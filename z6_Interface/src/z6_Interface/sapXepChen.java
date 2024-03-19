package z6_Interface;
import java.util.Iterator;

public class sapXepChen implements SapXepInterface {

	@Override
	public void sapXepTang(double[] arr) {
		int n = arr.length;
		double key;
		int i, j;
		for (i = 1; i < n; i++) {
			key = i - 1;
			j = i - 1;

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;

		}
	}

	@Override
	public void sapXepGiam(double[] arr) {
		int n = arr.length;
		double key;
		int i, j;
		for (i = 1; i < n; i++) {
			key = i - 1;
			j = i - 1;

			while (j >= 0 && arr[j] < key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}

	}

	@Override
	public void sapXepTang1(double[] arr) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sapXepGiam1(double[] arr) {
		// TODO Auto-generated method stub
		
	}
}
