package comSno9.harsha.MemoryManagement;

public class NativeArea {
	/*
	 * Different memory area's in java
	 * 
	 * ->Stack Area
	 * ->MetaSpace/PermGen ->Permanent Generation
	 * ->Heap Area
	 * 		0 String pool
	 * 
	 * Our system will allocate a memory for java that memory is called Native Area (inside 3 Area's)
	 *
	 *Let discuss in detail
	 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
	 * StackArea
	 * *************
	 * Default RAM [1024kb = 1Mb]	High-Performance									Thread1											Thread2 		Thread3
	 * * * * * * * * * * * * 													++++++++++++++++++++++++++
	 * Local variable	   *													+						 +-->Frame DeleteEmployee
	 * Reference variables *													+						 +	
	 * 					   *                                                    ++++++++++++++++++++++++++
	 * * * * * * * * * * * *													+						 +-->Frame getOrgID
	 * 																			+						 +
	 * 																			++++++++++++++++++++++++++	
	 * Int value directly stored in the local variable's						+	empId 	+	101		 +-->Frame
	 * Ex; eid = 101, salary = 5000.00											++++++++++++++++++++++++++
	 * 																			+	empName	+	X201	 +-->Frame
	 * String variable stored the address of value of a string 		main------->++++++++++++++++++++++++++
	 * 																			+	Salary	+	5000.00	 +-->Frame
	 * ->located in String pool													++++++++++++++++++++++++++
	 * EX; employee = X															+	e1		+	X301	 +-->Frame
	 * 																			++++++++++++++++++++++++++
	 * Reference variable also stores the address of a value					+	e2		+	X302	 +-->Frame
	 * EX; e1, e2																++++++++++++++++++++++++++
	 * 
	 * Stack is create based in number of Threads
	 * form main method
	 * 		-> the control go to getOrgID & removed
	 * 		-> Next control go to DeleteEmployee & removed
	 * 		-> Next control got to main
	 * Stack -> LastInFirstOut
	 * 
	 * Java minimum no of thread's run during the execution one thread will be active.
	 * for every Thread , one stack is created in your stack area.
	 * 
	 * number of Thread proportional to number of stack area's
	 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
	 * HeapArea
	 * ***********																		StringPool							X301						X302
	 * 																			++++++++++++++++++++++++++						  +						   +		
	 * Default ROM [768MB]   Low-Performance							X201	+	Jhon				 +						+   +					 +   +
	 * * * * * * * * * * *														++++++++++++++++++++++++++          orgID  455+54     +		 orgID  455+54     +
	 *  Objects		   	*												X202    +	HyrTutorials		 +          orgName + X202      +    orgName + X202      +
	 *  String literals  *													    ++++++++++++++++++++++++++			CEO   +   x203		  +  CEO   +   x203        +      		   
	 *  Arrays			*												X203	+   Yadagiri  			 +              +                   +    +                   +
	 * * * * * * * * * * * 														++++++++++++++++++++++++++          No of +Dept   2        + No of +Dept   2       +                
	 * heap area is a area which stored in the object							+						 +			getOrgID+();		 +   getOrgID+();        +  
	 * inside heap area String pool is a area which stored in the String literal++++++++++++++++++++++++++			deleteEmpl+oyee(); +     deleteEmpl+oyee() +
	 * Array is also a object																									+   +                    +   +
	 * 																															  +						   +
	 * 
	 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
	 * PermGen or MetaSpace
	 * *********************											 If any Static's in a Class program that create's a container Employee
	 *						     										   +++++++++++++++++++++++ 
	 *																	   + netWorth = 500.00   +
	 *			     													   + getNetwork();       +----->bucket
	 *																	   +++++++++++++++++++++++
	 *																	   Entire bucket is fully access for the code or program
	 * * * * * * * * * * * * * 
	 *  Class Structure		 *
	 *  Static Variables	 *
	 *  Static Methods		 *
	 *  Static Block		 *
	 * * * * * * * * * * * * * 
	 * Inside one compartment that called MethodArea
	 * 
	 *  
	 *  
	 *  RunTime constant Pool
	 *  *********************
	 *   Inside JVM/LINKING/RESOLVE
	 *   
	 *   Symbolic Reference to Method Reference can be stored in RunTime Constant Pool
	 *    
	 *   No of classes proportional to No of container's or Bucket
	 *   
	 *    
	 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
	 * 
	 *  before java 1.8 
	 *  as like string pool 
	 *  0 The permGen or Meta space is also a Sub section
	 *  
	 *  After java 1.8
	 *  PermGen is named as MetaSpace
	 *  From Heap Area it is separated and being it has a separated memory unit.
	 *  
	 *  when it is in Heap Area
	 *  --> PermGen (before 1.8)
	 *  
	 *  When it is Separated 
	 *  --> it's named as MetaSpace (After 1.8)
	 *  
	 */
}
