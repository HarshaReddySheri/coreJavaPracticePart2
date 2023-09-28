package comSnoA11.harsha.GarbageCollection;

public class GarbageCollectionNotes {
	/*
	 * we learned how to allocate memory & By whom can learn the deAllocation memory
	 * 
	 * DeAllocation
	 * 
	 * what is garbage collection ? collecting the garbage is known as garbage
	 * collection
	 * 
	 * forEx-1
	 * *******
	 *  RealWorld -->house -->thing -->Ex: Milk packet
	 * 
	 * milk packet ----->before milk pore into a bowl the packet is important
	 * ----->After poring of milk the PACKET not important HERE PACKET IS GARBAGE
	 *
	 * -----> If we can't throw packets out of house it occupies full of space in
	 * house
	 * 
	 * forEx-2
	 * ********
	 * Engineering first year, I brought a book, but garbage occupies full of space
	 * 
	 * I have to searching, an book spend lot of time 
	 * due to searching, performance is degrading
	 * 
	 *  so that clean the garbage & organize the useful content
	 * 
	 *
	 */
	
	
	/*  How does the garbage collection works?
	 * 
	 *  Between the process of collection 
	 * **********************************
	 * from throwing of garbage & to municipality collection
	 * 
	 * Before Municipality collection
	 * 
	 * -->for Example
	 * you living in an apartment or gatedCommunities
	 *  
	 * every day you can't give directly a garbage to municipality 
	 * you arrange a box in your apartment
	 * weekly once they collect the garbage
	 * 
	 * Same example apply for JAva
	 * ****************************
	 * 
	 * house lo					java lo (heap area) 
	 * -->thing's					--> Object's
	 * 
	 * unused thing's			unused object
	 * I have to delete		 	I have to delete 
	 * 
	 * house can't be 			Heap can't be 									
	 * Out of space so 			OutOfMemory so 
	 * that you to clean it		you have to clean it
	 * 
	 * 			deleting 
	 * 		ex unused Object's
	 * 			Unreferenced Object's
	 * 			Anonymous Object's
	 * in-order to free up the memory
	 * used at once after we clear it or clean it
	 * 	
	 * 
	 */
	
	/*
	 * Garbage
	 * 
	 * GarbageColection is process of deleting the unused objects, unreference objects, Anonymous object's, inOrder to free up the memory, 
	 * so that these memory is reused for later point of time
	 * 
	 * in-order to free up the memory
	 * --> It have to mark the object which are -unused, unreference, Anonymous object
	 * 
	 * forExample
	 * ***********
	 * Terrorist attack 
	 * target are mapped & you shout them (dul, dul, dul)
	 * 
	 * 
	 * 
	 */
	
	/*
	 * Does garbage collection happen automatically?
	 * 
	 * yes it does happen automatically that why these process is called automatic garbage collection
	 * 
	 * java provide a beautiful mechanism for automatic garbage collection
	 * automatic is happen only in java 
	 * c,c++ have manual
	 * 
	 * Main focus on Heap Area & MetaSpace for garbageCollection
	 * *********************************************************
	 * does'nt need for stack area
	 * 
	 * Heap Area
	 * ========
	 * Marking the unused object is entair complete process take a pass is called WORLDSTOPEVENT
	 * 
	 * Program execution stopped and pass(delete all the object) then it start the program execution
	 * 
	 * pass in every execution program from GrabageCollector
	 * it impact on performance
	 * so that java provide generation based memory's
	 * 
	 * Inside heap Area
	 * ****************
	 * 
	 *  Object creation is Their
	 *  java provide 2 type of generation
	 *  --> young generation
	 *  --> old generation
	 *  
	 *  HeapArea
	 *  ********
	 *  
	 *  young generation--> Eden space
	 *  				--> sevarial space s0 (from space)
	 *  				--> severial space s1 (To space)
	 *  
	 *  old generation
	 *  
	 *  garbage collector have a garbage collection process
	 *  
	 *  has 3 things shortly(msc - Master of science)
	 *  but here
	 *  mark		(select object)
	 *  sweep		(delete object)
	 *  compact		(remaining object are arrange & sent to empty space(s0 and s1))
	 *  
	 *  1st & 2nd iteration soOn 
	 *  every iteration 
	 *  Minor garbage collection
	 *  always choose empty space to store the used object
	 *  
	 *  every 15 time or 15 minor garbage collection operation, 
	 *  if we use object inside the program still remaining object are referenceing so these are moved to empty space(OldGeneration)
	 *  
	 *  that reference object are sent to old generation
	 *  Mark, sleep, compact --> Inside old generation & Metaspace is called Major garbage collection
	 *  
	 *  
	 *  
	 * 
	 */
}
