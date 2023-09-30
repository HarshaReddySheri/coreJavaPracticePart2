package comSno7.harsha.pojoclassANDjavabeanclass;
//Example of javaBean class?
import java.io.Serializable;
public class Student implements Serializable{
	private int id;
	private String name;
	private double marks;
	
	public Student() {
		
	}
	
	public Student(int id, String name) {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	/*
	 * 
	 * Agenda
	 * ******
	 * 
	 * 1.What is a Java Bean class?
	 * Ans: java Bean class is an extended version of a POJO class
	 * 		It is also referred as a Serializable POJO CLASS
	 * 
	 * 2.RULE FOR A CLASS TO BE Called as a JavaBeanClass
	 * Ans: 1.It should implement Serializable interface 
	 * 		2.It should have a no-args constructor
	 * 		3.All the properties(instance variables) should be private
	 * 		4.It should have Getter's & Setter's (public)
	 * 			in-order to access the properties.
	 * 
	 * 
	 */
	
	/*
	 * 
	 * 
	 * 
	 *DIFFERENCE BETWEEN POJO & JAVABEAN 
	 *
	 *POJOCLASS
	 ***********
	 *Use it in normal scenario
	 * like; API, AutoMachine,
	 * 
	 * DON'T USE EXCEPT SENDING TO NETWORK
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 *JAVABEANCLASS
	 **************
	 *Use for example 
	 *serializable interface is implementing
	 *
	 *JAVA NETWORK
	 *     |
	 *InterLinking between 
	 *ApplicationLayer & DataBaseLayer
	 *     
	 *code or object --->Via stream--->Store it in the DB
	 *
	 *We have serialize & then it will be stored.
	 *
	 *When you want use deserialize and get back you code
	 *
	 *Enterprise application usage Time
	 *
	 *Use WHEN YOU WANT TO SEND TO NETWORK
	 *     
	 */
	
}
