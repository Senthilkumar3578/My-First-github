//$Id$
package modifiers;




class Encapsulation	
{
      private int a;
      int display()
      {
	     return a;
       }
      void setValue(int x)
      {
    	  a=x;
      }
}

public class Tostring {
public static void main(String args[])
{
	Encapsulation e=new Encapsulation();
	
	e.setValue(67);
	int s=e.display();
	System.out.println(s);
	
	
	

	
	
	
}
}
