package comSno7.harsha.pojoclassANDjavabeanclass;

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
	public int getID() {
		return id;
	}
	
}