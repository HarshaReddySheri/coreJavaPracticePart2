package comSno6.harsha.exceptionhandling;

public class program1{
	public static void main(String[] args) {
		System.out.println("program execution start");
		int fNumber = 9;
		int sNumber = 0;
		int result= 0;
		
		
		try {
			result = fNumber/sNumber;
		}
		
		catch(ArithmeticException ae){
			System.out.println(ae.toString());
			throw ae;
		}
		
		finally {
			System.out.println("finally block"
					+ "");
		}
		System.out.println("output is:" + result);
		
		System.out.println("program execution end");
	}
}