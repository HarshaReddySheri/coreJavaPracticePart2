package comSno2.harsha.Abstract;

public class User {
	public static void main (String [] args) {
		Lenovo lenovo = new Lenovo();
		lenovo.copy();
		lenovo.cut();
		lenovo.paste();
		
		
		System.out.println();
		HP hp = new HP();
		hp.copy();
		hp.cut();
		hp.paste();
		
		System.out.println();
	}

}
