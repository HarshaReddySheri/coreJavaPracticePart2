package comSno1.harsha.interfaces;

public interface Laptops {
	/* BUSINESS DOCUMENTATION FOR LAPTOP (INTEFACE)
	 * 
	 * [LapTop provider or vendor's]
	 * 
	 * Lenovo 
	 * Hp
	 * Dell
	 * Asus
	 * Xiaomi
	 * so these people are (implementor's) or [business plan Implementors]
	 *  
	 *  These following copy, paste, cut, Keyboard
	 *  features or method are compulsory or must be their in your business document
	 *  and
	 *  Other then these method or features your wish on you own document
	 *  
	 *  Interface[What], Class[how]
	 *  Method class end with curly bracket.
	 *  EX: PUBLIC INTERFACE LAPTOP{
	 *  } 
	 *  Method Interface end with Semi colon
	 *  Ex: public void copy(); (no implementation)
	 *  
	 *  Same like variable definition end with semicolon
	 *  EX. Int i ; (no declaration)
	 *  
	 *  
	 */
	
	// Whatever may be every company lapTop designer must be have their features. {what to do}
	public void copy();
	
	public void paste();
	
	public void cut();
	
	public void keyboard();
	//These features are until java version 7 the interface rule only what to do
	
	//java 8 -> super super version
	//If your Wanna do the interface has how to do you can
	//direct implementation interface by using default or static method
	//can't use public it mean the business impact
	
	
	
	/*before java 8 version
	 *  
	 *  Interface is a business document 
	 *  which contain the unimplemented method ( java 7 )
	 * 
	 * java 8
	 * *************
	 * 
	 * Default
	 * ********
	 * must be goto class and then outside the world. (Only business implementor an use)
	 * 
	 * static
	 * ******
	 * direct outside the world (every one can use)
	 * 
	 * java 9
	 * *************
	 * 
	 * private
	 * *******
	 * private (common code) -->default , static inside interface
	 * 
	 *  code duplication can't be inside the interface, 
	 *  code re-usability feature is private
	 *  
	 *  
	 *   
	 */
	default void security() {
		commonCode();
		System.out.println("Laptop security code");
		//new business rule in documentation but no impact on business due to use default or static 
		//we can implement the interface method
		
		
	}
	
	static void audio() {
		
		//non static can't be call in static method, but static can call in non static method
		commonCode();
		System.out.println("Laptop audio code");
	}
	
	private static void commonCode(){
		System.out.println("commoncode");
	}
	
	/*
	 * Only create a business business is not a thing
	 * We have to run the Business
	 * Here create a business doc (Interface) & run the business (Implementors)
	 * 
	 * class is an implementor for interface.
	 * 
	 * Interface is used keyword called implements
	 * 
	 * 
	 * 
	 */
	
	/*
	 * Create a class for every Laptop provider's or Vendor's
	 * 
	 * Add unimplemented methods
	 * you can use Eclipse suggestion 
	 * to implement in the class which is provided 
	 * 
	 * 
	 * 
	 */
}