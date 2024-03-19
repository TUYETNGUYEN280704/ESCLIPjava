package model;

public class SACH1 {
	private String id;
	private String tenSach;
	private float giaBan;
	private int namXuatBan;
	
	public SACH1() {
	}
	
	public SACH1(String id, String tenSach, float giaBan, int namXuatBan) {
		this.id = id;
		this.tenSach = tenSach;
		this.giaBan = giaBan;
		this.namXuatBan = namXuatBan;
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	public String gettensach() {
		return tenSach;
	}
	public void settenSach(String tenSach) {
		this.tenSach=tenSach;
		
	}

	public float getGiaBan() {
		return giaBan;
	}

	public void setGiaBan(float giaBan) {
		this.giaBan = giaBan;
	}

	public int getNamXuatBan() {
		return namXuatBan;
	}

	public void setNamXuatBan(int namXuatBan) {
		this.namXuatBan = namXuatBan;
	}

	@Override
	public String toString() {
		return "sach [id=" + id + ", tenSach=" + tenSach + ", giaBan=" + giaBan + ", namXuatBan=" + namXuatBan + "]";
	}
	
	}
