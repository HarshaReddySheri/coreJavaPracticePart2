package comSno9.harsha.MemoryManagement;

public class GarbageCollectionPractice {

	public void finalize() {
		System.out.println("Finalize method is calling");
	}
	
	public static void main(String[] args) {
		//Unused objects
		//un-referenced objects
		//anonymous objects
		
		
		GarbageCollectionPractice gcp1 = new GarbageCollectionPractice();
		GarbageCollectionPractice gcp2 = new GarbageCollectionPractice();
		GarbageCollectionPractice gcp3 = new GarbageCollectionPractice();
		
		new GarbageCollectionPractice();
		
		gcp1 = null;
		gcp2 = gcp3;
		
		System.gc();
	}

}
