package comSno6.harsha.exceptionhandling;



public class MultipleCatchBlocks {

	public static void main(String[] args)throws Exception {
		
		try {
			System.out.println("hhdjshdshd");
			int[] arr = {1,2};
			// System.out.println(arr[2]);
			System.err.println(arr[1]/0);
			
			
		} 
		
		
		catch(ArrayIndexOutOfBoundsException e2) {
			e2.printStackTrace();
			System.err.println("Please use the index within the array range");
		}
		
		catch(ArithmeticException e3) {
			e3.printStackTrace();
			System.err.println("Please dont divide the number with zero");
		}
	}

}
