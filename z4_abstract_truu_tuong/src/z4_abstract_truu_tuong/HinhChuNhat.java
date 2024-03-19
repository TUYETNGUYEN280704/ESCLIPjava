package z4_abstract_truu_tuong;

public class HinhChuNhat extends Hinh {

	  
	 private double chieurong, chieucao;

	public HinhChuNhat(toaDo toado, double chieurong, double chieucao) {
		super(toado);
		this.chieurong = chieurong;
		this.chieucao = chieucao;
	}

	@Override
	public double tinhDienTich() {
 		return this.chieucao*this.chieurong;
	}
	 
	

}
