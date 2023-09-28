package comSno6.harsha.exceptionhandling;

public class MultipleExceptionInSingleCatchBlock {

	public static void main(String[] args) throws Exception {
		try {
			int[] arr = {1,2};
			// System.out.println(arr[1]/0);
			System.out.println(arr[2]);
		} catch (ArrayIndexOutOfBoundsException | ArithmeticException  e) {
			e.printStackTrace();
			System.err.println("commom output      ");
		}

	}

}
