package comSnoA10.harsha.AnonymousObject;

public class Student {
	
	String name = "Yadagiri Reddy";
	
	public void greet() {
		System.out.println("Hi " + name);
	}
	//Object -> Any class which i allocate the memory for an instance of class is created
	
	//ReferanceVariables
	//Any object address that refers the variable 
	
	//ReferenceObjects (refer by Parent)
	//Any object that refers to any variable
	
	//AnonymousObject (Orphans child , no reference)
	//Any object that not refers to any variable.
	//or
	//without reference is called anonymous object
	
	
	//Memory point of view also their is a small difference reference object & anonymous object
	public static void main(String[] args) {
		//Any Object that will do multiple operation or performance then use referenceVariable
		Student s = new Student();
		s.greet();
		
		//Single operation or performance then use Anonymous object
		new Student().greet();
		
		
	}
}

/*
 * what is an object?
 * instance of a class
 * 
 * How to create an object?
 * Using new keyword & calling the constructor
 * 
 * what is an anonymous object?
 * anonymous object is an object which is not referenced by any variable
 * 
 * How to create an anonymous object?
 * very simple just use new keyword and call the constructor
 * but don't store that instance into any other variable
 * 
 * that means
 * 
 * don't Reference to any variable
 * 
 * Advantages
 * **********
 * code Readablity
 * lessCode line
 * memory point of view the optimization
 * 
 * Disadvantage
 * ************
 * we can't perform multiple operation of anonymous object
 * 
 */