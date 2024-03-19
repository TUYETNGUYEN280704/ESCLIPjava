//overriding thì tham số  truyền vào phải giống nhau 
/*
 * nếu lớp cha có phương thức đó thì ở lớn con ncungx sẽ có 
 * phương thức đó , và tham số truyền vào giống nhau
 */
package z2_overriding;

public class animal {
	protected String dog, meo;

	public animal(String dog, String meo) {
		super();
		this.dog = dog;
		this.meo = meo;
	}

	public String getDog() {
		return dog;
	}

	public void setDog(String dog) {
		this.dog = dog;
	}

	public String getMeo() {
		return meo;
	}

	public void setMeo(String meo) {
		this.meo = meo;
	}

	public void tiengkeumeo() {
		System.out.println(" meo meo ");

	}

	public void tiengkeuDOG() {
		System.out.println(" gau gau ");

	}

}
