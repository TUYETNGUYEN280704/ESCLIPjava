package a_quanLiMayTinh;

public class MayTinh {
private Hang tenHang;
private Ngay ngaysx;
private double giaBan;
//thời gian bảo hành tính theo ngày
private double tgBaoHanh;
 //private quocGia tenqgsxmt;
public MayTinh(Hang tenHang, Ngay ngaysx, double giaBan, double tgBaoHanh  ) {
	super();
	this.tenHang = tenHang;
	this.ngaysx = ngaysx;
	this.giaBan = giaBan;
	this.tgBaoHanh = tgBaoHanh;
	//this.tenqgsxmt = tenqgsxmt;
}

//public quocGia getTenqgsxmt() {
//	return tenqgsxmt;
//}
//
//public void setTenqgsxmt(quocGia tenqgsxmt) {
//	this.tenqgsxmt = tenqgsxmt;
//}

public Hang getTenHang() {
	return tenHang;
}
public void setTenHang(Hang tenHang) {
	this.tenHang = tenHang;
}
public Ngay getNgaysx() {
	return ngaysx;
}
public void setNgaysx(Ngay ngaysx) {
	this.ngaysx = ngaysx;
}
public double getGiaBan() {
	return giaBan;
}
public void setGiaBan(double giaBan) {
	this.giaBan = giaBan;
}
public double getTgBaoHanh() {
	return tgBaoHanh;
}
public void setTgBaoHanh(double tgBaoHanh) {
	this.tgBaoHanh = tgBaoHanh;
}
 

 
// câu a
public boolean giaBanThapHon(MayTinh mtinhkhac) {
	return this.giaBan < mtinhkhac.giaBan;
}
//câu b
public String laytenqg()
{   
	return this.tenHang.laytenqg();
}
}
