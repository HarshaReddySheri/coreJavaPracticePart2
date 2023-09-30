package comSno6.harsha.exceptionhandling;

public class LoginException extends Exception {

		public LoginException(String message) {
			super(message);
		}
		
		/*
		 * Let create user exception
		 * 
		 * EX; Login Exception
		 * 
		 * Exception type -> Login exception
		 * 
		 * 1. Create class first
		 * 		class name must be exception name
		 * 2. inherit exception to class using extends.
		 * 3. Create parameterized constructor type string message
		 * 		no need to create new one
		 * 4. super(message) must be in constructor because it called throwable
		 *   --> By Super(message) inside the constructor it call's to throwable deals with fillInStackTrace();
		 *   4th point is important to use for your user exception to create the exception message.
		 */
}
