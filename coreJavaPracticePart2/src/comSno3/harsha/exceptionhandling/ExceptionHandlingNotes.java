package comSno3.harsha.exceptionhandling;

public class ExceptionHandlingNotes {

	/*
	 * Agenda
	 * *****
	 * 1.What is an exception?
	 * 2.What is exception Handling?
	 * 3.Why do we need exception handling?
	 * 4.Different types of exception?
	 * 5.How to use try,catch, finally blocks?
	 * 6.How to use throw & throws keyWorks?
	 * 7.Hierarchy of exceptions in java?
	 * 8.Eclipse shortCut for exception handling?
	 * 
	 */

	/*
	 * 1Ans 
	 * Exception is an event that occurs during the execution of a program that disrupts or stop the normal flow of instructions
	 * 
	 * Enterprise application, AutoMachine testing without any information the application is disrupts or stop 
	 * Why the application is disrupts or stop to known on these is headache one 0r it consume more amount of time and impossible task.
	 * 
	 * Exception can't be effect to us we have to maintain logFile & every Enterprise application & AutoMachine has their own logFiles 
	 * logFiles (Dairy) --> every step has own info is provided
	 * 
	 * If any problem occurs in application mention it in log files and stop the application is right one
	 * 
	 * When i trouble shoot it i see the log file
	 * 
	 * How to resolve issue 
	 * when we don't have idea of Disrupts or Stopped the application
	 * 
	 * when the exception occurs in a period of time don't stop the program execution.
	 * OR
	 * Exception Occurrence is not so serious & no need of stopping program execution.
	 * 
	 *  Java whenever the Exception can handle, java can't do any operation 
	 *  so that the application how it stop i don't known
	 *  
	 *  
	 *  java decided *
	 *  whenever exception occurs then immediately stop the program execution
	 *  
	 *  User or MyDecision*
	 *  when exception occurs no need to stop the program execution.
	 *   so i have to handle the execution
	 */
	/*
	 * 2Ans
	 * when i have handled the exception procedure is known as exception handling
	 * By writing the log file OR program execution continue OR any other thing OR email sending 
	 * these are my requirement decision 
	 * 
	 * when user want to handle the exception is known has exception handling
	 */
	/*
	 * 3Ans
	 * To take the control of the exception from the java
	 * 
	 */
	/*
	 * 4Ans
	 * Diff types
	 * Checked exception (compile time exception)
	 * unchecked exception (runtime exception)
	 * 
	 * CheckedException(compileTimeException)
	 * ******************************************
	 * The class exception & any SubClasses that are not also subClasses of RunTimeException are CheckedExcption
	 * 
	 * By using throws keyword we can handle the checked exception
	 * 
	 * RunTimeExcption (inside catch block)
	 * ************************************
	 * sysout(ae.toString()); --> Name:/message.
	 * sysout(ae.getMessage()); --> /message
	 * sysout(Arrays.toString(ae.getStackTrace()); --> complete info
	 * ae.printStackTrace(); ----> complete info of exception but it's not a exception
	 * 
	 */
	/*
	 * 5Ans
	 * How to handle the exception
	 * how to do  -> you need something
	 * i.e, try,catch,finally block's
	 * 
	 * EX; cooling -> need's gasStove, vassal, vegtable's
	 * 
	 * Java provided some block's 
	 * By using these block's in java 
	 * you can control the exception & also throw & throws
	 * 
	 * Blocks are try, catch,finally
	 * which piece of code can identify the exception that piece of code placed in the try block
	 * 
	 * run time exception can catch by java without saying anything
	 * 
	 * compile time exception can't catch by java we have to say explicitly
	 * 
	 * STACKTRACE
	 * ae.printStackTrace(); --> complete info of exception but it's not a exception
	 * --> Exception name -----> java.lang.ArithematicException
	 * --> Exception message ---> message / byZero
	 * --> which line number ---> number
	 * --> Methods info 	----> Multiple method, Multiple call
	 * 								complete info of exception
	 * 
	 * last to first        ------>    to trace the exception
	 * 
	 * 
	 */

	/*
	 * Hierarchy of exception in java
	 * ******************************
	 * *Object 
	 * 		*Throwable
	 * 			* Exception
	 * 				*RunTimeException
	 * 					0 IndexoutofBoundsException
	 * 					0 NullPointerException
	 * 					0 ArithematicException
	 * 				*IOException
	 * 					0fileNotFoundException
	 * 				*SQLException
	 * 
	 */

	/*
	 * Eclipse shortCut for exception handling?
	 * 
	 * short 1
	 * ********
	 * Select the code line & right click on it & click on surround with option you get it
	 * 
	 * short 2
	 * *******
	 * try - Ctrl + space
	 * you get a shuddle
	 * 
	 */

}
