package comSnoA11.harsha.GarbageCollection;

public class CallManuallyGarbageCollectionExpicitly {
	
	/*
	 * can we call garbage collection explicitly (manually) ?
	 * 
	 * 2 ways manually calling
	 * 
	 * 1. system.gc();
	 * 2. Runtime.getRuntime().gc();
	 * 
	 * both are same for calling manually
	 */
	
	/*
	 * By using these we calling or invoke the garbage collector
	 * garbage removal time we have to do extra operation for example log's
	 * 
	 * extra operation are write inside the finalize method
	 * 
	 * when we call the system.gc();
	 * that will call internally finalize method
	 * and it will be executed.
	 * 
	 * Only when the garbage is removed from the program that time only finalize method called
	 * 
	 */
	public void finalize() {
		System.out.println("Finalize method is calling");
	}
	public static void main(String[] args) {
		
		
		
		//unused objects or unreferenced objects
		//anonymous objects
		
		CallManuallyGarbageCollectionExpicitly gcp1 = new CallManuallyGarbageCollectionExpicitly();
		CallManuallyGarbageCollectionExpicitly gcp2 = new CallManuallyGarbageCollectionExpicitly();
		CallManuallyGarbageCollectionExpicitly gcp3 = new CallManuallyGarbageCollectionExpicitly();
		
		
		
		/*how to convert unused or unReference object they are three ways
		 *  
		 * 1 way
		 * *****
		 * referenceVariable is connect to object
		 * now referenceVariable is point out to null
		 * 
		 * referanceVariable becomes null
		 * ex: gcp1 = null
		 */
		gcp1 = null;
		/*
		 * 2 way
		 * *****
		 * gcp2 = gcp3
		 * 
		 * so that automatically ureferance object for the gcp2
		 * why because it's assign to gcp3
		 * 
		 * for gcp2 no object init
		 * it assign to gcp3 & it's object
		 * 
		 */
		gcp2 = gcp3;
		
		
		/*
		 * 3way
		 * ****
		 * new Gcpractice();
		 * Anonymous object is also known as unreferencedObject
		 */
		new CallManuallyGarbageCollectionExpicitly();
		System.gc();
		
		
	}

}
