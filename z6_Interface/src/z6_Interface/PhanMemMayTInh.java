package z6_Interface;

public class PhanMemMayTInh implements MayTinhBoTuiInterface, SapXepInterface{

	@Override
	public void sapXepTang(double[] arr) {
 		
	}

	@Override
	public void sapXepGiam(double[] arr) {
		 		
	}

	@Override
	public double cong(double a, double b) {
		 		return 0;
	}

	@Override
	public double tru(double a, double b) {
		 		return 0;
	}

	@Override
	public double nhan(double a, double b) {
 		return 0;
	}

	@Override
	public double chia(double a, double b) {
 		return 0;
	}
	
	@Override
	public void sapXepTang1(double[] arr) {
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
	public void sapXepGiam1(double[] arr) {
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

}
//bò húc , ko độ = 160k 12b ly nhỏ 

