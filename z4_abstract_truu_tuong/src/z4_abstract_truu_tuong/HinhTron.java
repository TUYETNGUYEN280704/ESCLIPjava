package z4_abstract_truu_tuong;

public class HinhTron  extends Hinh{

	private double r;
	
	 

	public HinhTron(toaDo toado, double r) {
		super(toado);
		this.r = r;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	@Override
	public double tinhDienTich() {
		return Math.PI*this.r*this.r;
				
	}
	 
	
}
