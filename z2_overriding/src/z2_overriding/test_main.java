package z2_overriding;

public class test_main {
public static void main(String[] args) {
	animal con1 = new animal(" gau gau ", " meo meo ");
	
	dog dog1  = new dog(" gâu gâu ", " meo meo ");

	dog1.tiengkeuDOG();
	dog1.tiengkeumeo();

con1.tiengkeuDOG();
con1.tiengkeumeo();
}

}
