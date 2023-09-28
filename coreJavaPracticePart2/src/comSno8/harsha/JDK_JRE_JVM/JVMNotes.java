package comSno8.harsha.JDK_JRE_JVM;

public class JVMNotes {
	/*
	 * JVM Software 
	 * *************
	 * it's a virtual machine
	 * 
	 * 
* *1.CLASS LOADER SUB SYSTEM + 2.RUMTIME DATA AREAS + 3.EXECUTION ENGINE + MAIN LIBRARIES
	 * 
	 * FIRST THREE ARE MAIN TEAM FOR EXECUTION OF A PROGRAM
	 * 
	 * JRE tools are used to PUSH(LOADER ARE HELP FOR PUSH) main process is done by JVM
	 * 
	 * MACHINE UNDERSTANDABLE CODE/INTERPRETED BYTECODE
	 * 
	 *.javafile, .classfile
	 *these enter into the class loader subSystem (inside 3 phases)
	 */
	
/*1.CLASS LOADER SUBSYSTEM
	 ***********************
	 * *****************************************************
	 * *LOADER(3 LOADER IN IT)    *LINKING  * INITILIZATION*
	 * *****************************************************	
	 * *Bootstrap class loader	 *verify    *			   *	
	 * *Extension class loader	 *prepare   *Initialization*
	 * *Application class loader *Resolve   *			   *
	 * *****************************************************	
	 * 
	 * 
//*LOADER 
//	 * BOOTSTRAP CLASS LOADER*********
//	 * **********************
//	 * 
//	 * 1. Bootstrap class loader are helpful or responsible for load the class from ( rt.jar file & flatform specific ) 
//	 * 
//	 * EXTENSION CLASS LOADER*********
//	 * **********************
//	 * 
//	 * 2. Inside JRE/lib/extFolder
//	 * 			--> jar libraries & lang specific like mac JRE, window JRE, linus JRE
//	 * 
//	 * ext Stand for extension
//	 *
//	 * 1. operation system basic we have class file & libraries
//	 * 2. inside ext folder are responsible for load these 2 
//	 * 
//	 * we require Extension class loader
//	 * 
//	 * APPLICATION CLASS LOADER*******
//	 * ************************
//	 * 
//	 * Application class path mean 
//	 * 			-> java project is created
//	 * 			-> java project inside that if you add any libraries 
//	 * 			-> these libraries are responsible for load
//	 * 				 we require Application class loader
//	 * forEx
//	 * -> we have to handle XLfile using java 
//	 * 		we don't have internal support in java
//	 *   so how 
//	 *   EX:
//	 *   JXL libraries
//	 *   Apache libraries we have used to handle XL files
//	 *   
//	 *    EX How to Read Excelfile using Apache poi 2 video
//	 *    **************************************************
//	 *    Introduction to Apache 1 video 
//	 *    -> what are libraries 
//	 *    -> How to add libarires are in these video
//	 *    
//	 *    when even you work with Selenium standaLone server jar download & added to it so it is also extend libraries
//	 *    
//	 *   
//	 * 
//	 *
//	
//* LINKING 3PHASE**********
//     * 1.VERIFY + 2.PREPARE + 3.RESOLVE
//	 * 
//* VERIFY
//	 * ***********
//	 * 
//	 * What we give byte code is free from harmful or original byte code or altered byte code (infected or malWare)
//	 * 
//	 * At beginning java is a secured programming language
//	 * By using javap -v(vervos) filename.class
//	 * we can read byteCode
//	 * 
//* PREPARE
//     * *******
//     *when we create a static variable in java program these will allocate a default value in it
//     *EX; int default value is 0( coRelate initialization phase)
//     *
//* RESOLVE
//     * ******** 
//     *( REPLACE ) it(Inside byte code) convert symbolic reference to method reference
//     *
//     *   SYMBOLIC REFERANCE MEAN 
//     *   entire constant pool ---> is a symbolic reference
//     *  
//     *   METHOD REFERANCE MEAN 
//     *   entire runtime constantPool --> is a method reference
//     *   
//* Initialization phase**********************
//    *
//    * default static variable are initialized to original value's (coRelate Prepare)
//    *     
	  */
	
	
	
	
	
//2.RUNTIME DATA AREAS (ITS A BIG TOPIC RELATED TO Memory so we discuss in MemoryManagement
	
	
	
	
/*
 * Execution Engine ( operating system)
 * *****************************************
 * 
 * 3 component 
 * ***********
 * 
 * 1. Interpreter
 * ******************** 
 *  Interpreter work as each byte code read line by line 
 *  and which convert into system understandable languages
 *  with the help of 
 *  		--> Native Method Interface
 *  		--> Native Method library   
 * 
 * 2. JIT compiler
 * *******************
 * JIT compiler work as 
 *  if one line is using 10 time in code ( commonCode) not in continues line multiple places
 *  
 *  this one line or common line byte code is multiple time replace in it 
 *  so same line interpreting mean performance is down
 *  
 *  so that Interpreter is identify the repeated line and said to the JIT compiler
 *  
 *  repeated line are interpreted are counted into a system understandable language and store in it.
 *  
 *  these work is done by JIT COMPILER
 *  NO need to do interpreter
 *  so that performance is important
 *  
 *  3. Garbage collection
 *  **********************
 *  variable, object are not deleted in the program so that large amount of garbage is stored in it
 *  
 *  simply municipality collection is called Garbage collection
 */
}
