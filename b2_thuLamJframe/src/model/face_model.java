package model;

public class face_model {
	
	private int value;
	
	private String name;
	
	public face_model() {
		this.value = 0;
		this.name ="";
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public void increment() {
		this.value++;
	}
	public void decrment() {
		this.value--;
	}
	
	public void reset() {
		this.value=0;
	}
	public void clear() {
		this.value =0;
	}


	

}
