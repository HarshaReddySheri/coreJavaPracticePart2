package comSno7.harsha.pojoclassANDjavabeanclass;

public class Program1 {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setID(101);
		e1.name = "Harshareddy";
		e1.salary = 555555.5;
		
		Employee e2 = new Employee();
		e2.setID(102);
		e2.name = "Gopalreddy";
		e2.salary = 444445.5;
		
		Employee e3 = new Employee();
		e3.setID(101);
		e3.name = "hariwarReddy";
		e3.salary = 333333.3;
		
		Employee [] employee = new Employee [] {e1,e2,e3};
		int i = 0;
		while(i<employee.length) {
			System.out.println(employee[i]);
			i++;
		}
	}

}
