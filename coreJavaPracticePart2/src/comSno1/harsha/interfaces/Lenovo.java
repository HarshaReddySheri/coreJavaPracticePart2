package comSno1.harsha.interfaces;

public class Lenovo implements Laptops {


	public void copy() {
		System.out.println("Lenovo copy code");
	}

	
	public void paste() {
		System.out.println("Lenovo paste code");
		
	}


	public void cut() {
		System.out.println("Lenovo cut code");
		
	}


	public void keyboard() {
		System.out.println("Lenovo keyboard code");
		
	}
	
	public void capture() {
		System.out.println("Lenovo camera capture code");
		
	}
	
	@Override
	public void security() {
		System.out.println("Lenovo security code");
	}
	
	
}
