// IN RA NGÀY THÁNG NĂM 
/*
 *  thuộc tính private : int ngay, int thang, int nam
 * phương thức: void print MyDate,MyMonth, MyYear
 * 
 */
public class a1_MyDate {
	private int day, month, year;

	// khởi tọa   constructor
	public a1_MyDate(int d, int m, int y) {
		this.day = d;
		this.month = m;
		this.year = y;

	}

	// phương thức
	public void printDay() {
		System.out.println(" Day: " + this.day);
	}

	public void printMonth() {
		System.out.println(" Mont0h :" + this.month);
	}

	public void printYear() {
		System.out.println(" Year :" + this.year);
	}

	public void printDate() {
		System.out.println(" Date :" + this.day + "-" + this.month + "-" + this.year);
	}

}
