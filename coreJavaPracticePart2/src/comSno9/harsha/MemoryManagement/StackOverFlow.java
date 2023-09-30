package comSno9.harsha.MemoryManagement;

public class StackOverFlow {
	/*
	 * Method calling inside the program is done in StackArea
	 * 
	 * calling add add add so many time it's storage is full, it play an exception
	 * 
	 * java.lang.stackOverFlowError.
	 * when stack area is full of memory
	 */
	public static void main(String[] args) {

		new StackOverFlow().add(1);

	}
	public void add(int i) {
		System.out.println(i);
		i++;
		if (i<100000)
			add(i);

	}
	/*
	 * 
	 * calling method inside the same method
	 * 
	 * --> Method name add(i);
	 * --> add method is called inside add
	 * 
	 * How to OverCome
	 * java.lang.StackOverFlowError
	 * By increasing StackArea memory 
	 * -->execution time
	 * you have to pass a Argument
	 * 
	 * argument pass through
	 * 
	 * click on Run As
	 * click on Run Configurations
	 * click on Arguments beside main
	 * Inside VM arguments
	 * you have to pass the argument
	 * 
	 * JVM 
	 * you are saying to JVM, that 
	 * so on increase the memory, you have to create the memory
	 * 
	 * To say JVM -> we use VM arguments
	 * 
	 * pass argument
	 * 
	 * -Xss2m (2mb) it means StackMemory
	 * 
	 * 
	 */

}
