package comSno7.harsha.pojoclassANDjavabeanclass;

/*3. Example of POJO class
 *multiple employee's information you want to store
 *So that time Create a POJO Class
 *class is a Non-Primitive dataType
 */

public class Employee{
	private int id;
	public String name;
	public double salary;
	
	public Employee() {
		System.out.println("No arg constructor is called");
	}
	public Employee(int id) {
		this.id = id;
	}
	
	public void setID(int id) {
		this.id = id;
	}
	//Getter Method should n't be private
	public int getID() {
		return id;
	}
	/*
	 * 
	 * Agenda
	 * ******
	 * 
	 * 1.What is a POJO Class?
	 * Ans:POJO means Plain Old Java Object.
	 * 		It is a simple java object, which is not bound by any special restriction
	 * 
	 * 2. Rules for a class to be called as a POJO Class
	 * 
	 * CAPITAL -> Mandatory rule [1,4]
	 * small -> optional rules   [2,3]
	 * 
	 * Ans: 1. IT MUST BE PUBLIC
	 *		2. it is recommended to make the properties (instance variables) as private for improved security
	 *		3. it can have Getters & Setters in order to access the properties
	 *		4. IT SHOULD'NT IMPLEMENT ANY INTERFACES
	 *		   IT SHOULD'NT EXTEND ANY CLASSES
	 *		   IT SHOULD'NT HAVE ANY ANNOTATIONS SPECIFIED (@OVERRIDE)
	 *
	 *
	 *
	 */
}