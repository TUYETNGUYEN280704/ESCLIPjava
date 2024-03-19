package a_quanLiDanhSach;

public class Sach {
String tenSach;
double giaBan;
int namXB;
TacGia tacGia;


public String getTenSach() {
	return tenSach;
}

public void setTenSach(String tenSach) {
	this.tenSach = tenSach;
}

public double getGiaBan() {
	return giaBan;
}

public void setGiaBan(double giaBan) {
	this.giaBan = giaBan;
}

public int getNamXB() {
	return namXB;
}

public void setNamXB(int namXB) {
	this.namXB = namXB;
}

public TacGia getTacGia() {
	return tacGia;
}

public void setTacGia(TacGia tacGia) {
	this.tacGia = tacGia;
}

public Sach(String tenSach, double giaBan, int namXB, TacGia tacGia) {
	super();
	this.tenSach = tenSach;
	this.giaBan = giaBan;
	this.namXB = namXB;
	this.tacGia = tacGia;
}

//câu a in ra tên sach
public void InTenSach() {
	System.out.println(" Sách có tên là : ");
}

// câu b : ktra sách có xuất bản cùng năm hay ko 
public boolean KtrXb( Sach sachKhac) {
	if ( this.namXB == sachKhac.namXB) {
		return true;
	}else {
		return false;
	}
	// ỏ cũng có thể return this.namxb== sachkhac.namxb ; // ví dụ vậy
	
	
}
 // câu c : gia sau khi giảm đi 10%
	public double GiaSauKhiGiam(double x) {
		return this.giaBan * ( 1-x/100);
	}
}


