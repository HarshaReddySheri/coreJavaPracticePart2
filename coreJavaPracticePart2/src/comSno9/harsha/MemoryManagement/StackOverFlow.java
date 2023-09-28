package comSno9.harsha.MemoryManagement;

public class StackOverFlow {

	public static void main(String[] args) {

		new StackOverFlow().add(1);

	}
	public void add(int i) {
		System.out.println(i);
		i++;
		if (i<100000)
			add(i);

	}

}
