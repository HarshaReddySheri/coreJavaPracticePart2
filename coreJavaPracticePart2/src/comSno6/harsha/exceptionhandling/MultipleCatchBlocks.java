package comSno6.harsha.exceptionhandling;

/*
 * let say
 * 
 * I have a piece of code but it have multiple exception throw in code
 * ->Array -> ArrayIndexOutOfBound exception
 * ->Arithmetic -> divide by Zero
 * ->Files-> IO exception or FileNot Found exception
 * 
 * 10 line of code with 3 exception 
 * 
 * Let imagine
 * --> 10 line of code with 3 Exception 
 * 
 * --> 10 line can split & try block for each line is good idea
 * --> let deal with this idea 
 * 		for this - this Exception
 * 		for this - this Exception
 *  	"	" 		"    "
 *  	"	" 		"    "
 *   	"	" 		"    "
 *   
 *   This scenario
 *   
 *   each Exception we have to specific identification
 *   ++++++++++++++++++++++
 *   one try block		  +	
 *   multiple catch block +
 *   ++++++++++++++++++++++-->imp
 *    
 */


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
