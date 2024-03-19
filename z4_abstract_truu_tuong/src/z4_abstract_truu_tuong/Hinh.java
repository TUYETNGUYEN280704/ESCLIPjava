package z4_abstract_truu_tuong;

public abstract  class Hinh {
	protected toaDo toado;

	public Hinh(toaDo toado) {
		this.toado = toado;
	}

	public toaDo getToado() {
		return toado;
	}

	public void setToado(toaDo toado) {
		this.toado = toado;
	}

	public abstract double tinhDienTich();
	
	
	
	
}