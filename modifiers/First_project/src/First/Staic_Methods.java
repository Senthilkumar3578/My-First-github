//$Id$
package First;

public class Staic_Methods {
	
	static int a=m();
	static {
		System.out.println("First Static block");//First calling
	}
	static void main()                     //No object creation
	{
		System.out.println("Static method");  
	}
	
	static int m()
	{
		System.out.println("calling first m");
		return 20;
	}
	public static void main(String args[])
	{
		main();
		
	}

}
