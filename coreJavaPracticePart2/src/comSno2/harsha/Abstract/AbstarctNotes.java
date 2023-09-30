package comSno2.harsha.Abstract;

public class AbstarctNotes {
    /*
     * Abstract class
     * **************
     * 
     * 1.What is an abstract class?
     * Ans: An abstract class is a class which can contain the abstract methods 
     * 		and is defined with the keyword abstract.
     * unimplemented --> abstarctMethod
     * implemented ----> non-abstractMethod
     * 
     * 10-> InterfaceMethod
     * 6 method (I can implement to you)
     * here I means abstract class (third party member)
     * 4 method you can 
     * 
     * Abstract class
     * **************
     * not providing complete interface implementation.
     * 
     * doing partially implementation and remaining all abstract method
     * 
     * It has abstract & non abstract method
     * 
     * class
     * *******
     * 
     * providing complete interface implementation (100%)
     * 
     * it has only non-abstract method
     * 
     * 
     *       interface             --->          Abstract class                      --->             class
     * (complete abstract code)          (partially code) both in Interface & class        (fully implemented method)
     * 
     * 
     */
	
	/*
	 *2.When to use? 
	 *Ans:partially implementation (common implementation)
	 *
	 *2.How to use / create on abstract class?
	 *Ans:Adding abstract KW to class
	 *		At the time of class creation only you have click the check box on abstract
	 *
	 *3.can we create an instance of abstract class?
	 *Ans: No, it contain ab & non-ab method
	 *
	 *4.Can we have non-abstract methods inside abstract class?
	 *Ans:yes
	 *
	 *5.Can we extend multiple abstract classes into a single class?
	 *Ans:class level No, but interface level Yes
	 *
	 *java doesn't support multiple inheritance in class level
	 *
	 *6.an we implement the abstract class like an interface?
	 *Ans: No, only extends KW
	 */
}
