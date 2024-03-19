package z2_overriding;

public class dog extends animal {

	public dog(String dog, String meo) {
		super(dog, meo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tiengkeumeo() {
 		super.tiengkeumeo();
	}

	@Override
	public void tiengkeuDOG() {
 		super.tiengkeuDOG();
	}
	
	

}
