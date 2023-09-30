package comSno6.harsha.exceptionhandling;

public class MultipleExceptionInSingleCatchBlock {

	public static void main(String[] args) throws Exception {
		try {
			int[] arr = {1,2};
			// System.out.println(arr[1]/0);
			System.out.println(arr[2]);
			/*
			 * some senario's
			 * 
			 * Multiple exception in a single catch block
			 * like
			 * all FileNotFoundException
			 * all ArrayIndexOutOfBoundException
			 * all ArithematicException
			 * 
			 * in a single catch for some scenario can possible
			 * 
			 * by using pipe separator 
			 * 
			 */
		} catch (ArrayIndexOutOfBoundsException | ArithmeticException  e) {
			e.printStackTrace();
			System.err.println("commom output ");
		}

	}

}
