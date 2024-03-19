package a_quanLiMayTinh;

public class Hang {
private String tenHang;
private quocGia tenQg;
private Object quocGia;
public Hang(String tenHang, quocGia tenQg) {
 	this.tenHang = tenHang;
	this.tenQg = tenQg;
}
public String getTenHang() {
	return tenHang;
}
public void setTenHang(String tenHang) {
	this.tenHang = tenHang;
}
public quocGia getTenQg() {
	return tenQg;
}
public void setTenQg(quocGia tenQg) {
	this.tenQg = tenQg;
}


public String laytenqg() {
	// TODO Auto-generated method stub
	return ((a_quanLiMayTinh.quocGia) this.quocGia).getTenQgia();
}

 
}
