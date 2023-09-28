package comSno1.harsha.interfaces;

public class User {

	public static void main(String[] args) {
		Lenovo lenovo = new Lenovo();
		lenovo.copy();
		lenovo.cut();
		lenovo.paste();
		lenovo.capture();
		
		System.out.println();
		HP hp = new HP();
		hp.copy();
		hp.cut();
		hp.paste();
		hp.printing();
		System.out.println();
		System.out.println("untill java7");
		
		                                                   
		System.out.println();
		lenovo.security();
		hp.security();
		Laptops.audio();
 		
		
	}

}
