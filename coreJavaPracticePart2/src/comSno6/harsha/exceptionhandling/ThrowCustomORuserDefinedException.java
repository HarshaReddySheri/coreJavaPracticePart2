package comSno6.harsha.exceptionhandling;

public class ThrowCustomORuserDefinedException {
	/*
	 * Throw custom (user defined) using throw KW
	 * 
	 * 1. user created exception one throw & it type definition.
	 * 2. Java inside exception with a specific message throw.
	 * 		change the java message exception
	 * 
	 */
	public static void main(String[] args)throws Exception {
		//custom exception
		try {
			System.out.println(1/0);
		} catch (ArithmeticException e) {
			throw new LoginException("Login is failed, please check the credentials");
		}
  
	}

}
