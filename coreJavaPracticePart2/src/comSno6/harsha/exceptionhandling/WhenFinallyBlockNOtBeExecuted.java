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
			
		}
		finally {
			System.out.println("Finally");
		} 
		System.out.println("main");
		
	}
		
}
