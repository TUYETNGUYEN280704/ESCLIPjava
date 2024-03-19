package a_quanLiDanhSach;

public class TacGia {
String tenTacGia;
Ngay ngaySinh;

public TacGia(String tenTacGia, Ngay ngaySinh) {
	super();
	this.tenTacGia = tenTacGia;
	this.ngaySinh = ngaySinh;
}


public String getTenTacGia() {
	return tenTacGia;
}

public void setTenTacGia(String tenTacGia) {
	this.tenTacGia = tenTacGia;
}

public Ngay getNgaySinh() {
	return ngaySinh;
}

public void setNgaySinh(Ngay ngaySinh) {
	this.ngaySinh = ngaySinh;
}


}
