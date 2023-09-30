package comSno6.harsha.exceptionhandling;

public class WhenFinallyBlockNOtBeExecuted {

	public static void main(String[] args) throws Exception{
		try {
			int[] arr = {1,2};
			// System.out.println(arr[1]/0);
			System.out.println(arr[2]);
		} 
		catch (Exception e) {
			System.out.println("Catch");

			System.exit(0);
			
			/*
			 * When will the finally block not be executed?
			 * Ans:
			 * Yes, it correct exception occur or not but finally block will execute
			 * 
			 * but finally block always can't executed for some senerio's
			 * When you said (i.e, System.exit(0);
			 * inside try or catch so that finally can't execute 
			 * By this Thread is dead for every thing a thread is exist
			 * 
			 * not Only finally block 
			 * After system.exit(0); can't be execute any piece of code   
			 */

		}
		finally {
			System.out.println("Finally");
		} 
		System.out.println("main");

	}

}
