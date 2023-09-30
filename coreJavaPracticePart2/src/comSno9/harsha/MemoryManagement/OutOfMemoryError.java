package comSno9.harsha.MemoryManagement;

public class OutOfMemoryError {

	public static void main(String[] args) {
		int size =10;
		for(int i=0; i<Integer.MAX_VALUE;i++) {
			int[] arr = new int[size];
			size *=2;
			System.out.println(size);
		}
		/*
		 * OutPut Exception in thread "Main"
		 * java.lang.OutOfMemoryError: Java heap space
		 */
	}
	
	/*
	 * How to overCome OutOfMemory
	 * 
	 * By increasing Heap Area Memory
	 * 
	 * --> As same procedure of stackOverFlow passing an Argument
	 * 
	 * --> To say JVM TO INCREASE MEMORY AREA USING VM ARGUMENT
	 * 
	 * Passing argument
	 * 
	 * -Xmx500m
	 * Heap Memory
	 */
	

}
