package comSno1.harsha.interfaces;

public interface Laptops {
	
	public void copy();
	
	public void paste();
	
	public void cut();
	
	public void keyboard();
	
	default void security() {
		commonCode();
		System.out.println("Laptop security code");
	}
	
	static void audio() {
		commonCode();
		System.out.println("Laptop audio code");
	}
	
	private static void commonCode(){
		System.out.println("commoncode");
	}
}