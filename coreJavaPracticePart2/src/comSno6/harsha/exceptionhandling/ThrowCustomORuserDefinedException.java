package comSno6.harsha.exceptionhandling;

public class ThrowCustomORuserDefinedException {

	public static void main(String[] args)throws Exception {
		try {
			System.out.println(1/0);
		} catch (ArithmeticException e) {
			throw new LoginException("Login is failed, please check the credentials");
		}
  
	}

}
