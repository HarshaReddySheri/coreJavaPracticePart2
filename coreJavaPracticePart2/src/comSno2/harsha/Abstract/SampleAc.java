package comSno2.harsha.Abstract;

public abstract class SampleAc implements Laptop{
	
	/*
	 * you trying to implement the interface but you are not trying to implement all at once.
	 * so i will give you Suggestion
	 * 
	 *  suggestion one
	 *  **************
	 *  Provide all implementation for all interface method
	 *  suggestion two
	 *  **************
	 *  class must be converts to abstract class
	 *  
	 *AbstractClass
	 **************
	 *inside 
	 *unimplemented method must use abstract keyword
	 * 
	 */
	public void copy() {
		System.out.println("copy code");
	}

	public void paste() {
		System.out.println("paste code");
	}
	
	//not mandatory but need clarity you should 
	
	public abstract void cut();
	
	public abstract void keyboard();
	
}
