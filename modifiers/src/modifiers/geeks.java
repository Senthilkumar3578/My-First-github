//$Id$
package modifiers;

class Fathers { 
	public void work() 
	{ 
		System.out.println("Earning Father"); 
	} 
} 

class Sons extends Fathers { 
	public void play() 
	{ 
		System.out.println("Enjoying son"); 
	} 
} 

class geeks { 
	public static void main(String[] args) 
	{ 
		// son is a subclass reference 
		Fathers father; 

		// new operator returns a subclass reference 
		// which is stored in the father variable 
		// father stores a Father class reference 
		// because of implicit casting 
		father = new Sons(); 

		// father is narrowed 
		Sons son = (Sons)father; 

		son.work(); // works well 
		son.play(); // works well 
	} 
} 



