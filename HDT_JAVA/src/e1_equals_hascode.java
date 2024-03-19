//equals : so sánh
//hashCode : định giá trị cho 1 số đó 


import java.util.Objects;

public class e1_equals_hascode {
	/*
	 * thuộc tính : int day , int month, int year phương thức: constructor mặc định
	 * myDate( int d, int m , int y)
	 */

	// khởi tạo class ngày tháng năm và cài đặt get set
	// get là lấy ra
	// set là thay đổi

	private int day;
	private int month;
	private int year;

	// constructor
//		public c1_Get_Set(int d, int m, int y){
//			this.day = d;
//			this.month = m;
//			this.year = y;
//		}

	// kiểm tra điều kiện để phù hợp vs date dựa vào constructor
	public e1_equals_hascode(int day, int month, int year) {
		if (day >= 1 && day <= 31) {
			this.day = day;
		} else {
			this.day = 1;
		}
		if (month >= 1 && month <= 12) {
			this.month = month;
		} else {
			this.month = 1;
		}
		if (year >= 0) {
			this.year = year;
		}
	}

	// cài đặt SET & GET
	public int getDay() {
		return this.day;
	}

	public void setDay(int d) { // cần phải có dk
		if (d >= 1 && d <= 31)
			this.day = d;
	}

	public int getMonth() {
		return this.month;
	}

	public void setMonth(int m) {
		if (m >= 1 && m <= 12)
			this.month = m;
	}

	public int getYear() {
		return this.year;
	}

	public void setYear(int y) {
		if (y >= 0)
			this.year = y;
	}

//	@Override
//	public int hashCode() {
//		return Objects.hash(day, month, year);
//	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result =1;
		result = prime * result +day;
		result = prime * result +month;
		result = prime * result +year;
		return result;

	}
	@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			e1_equals_hascode other = (e1_equals_hascode) obj;
			if(this.day =! other.day)
				return false;
			if(this.month =! other.month)
				return false;
			if(this.year =! other.year)
				return false;
			return true;
			
			
	}
}
//			e1_equals_hascode other = (e1_equals_hascode) obj;
//			return day == other.day && month == other.month && year == other.year;
//		}
	

//		// tostring
//	public String toString() {
//		return this.day + "/" + this.month + "/" + this.year;
//	}
//}
