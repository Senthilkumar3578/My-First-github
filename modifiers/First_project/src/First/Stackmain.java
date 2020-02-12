
package First;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import First.Stacks;
public class Stackmain {
	public static void main(String args[]) throws IOException
	{
           Stacks s=new Stacks();
           BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
           while(true){
           System.out.println("1  push");
           System.out.println("2  pop");
           System.out.println("3  peek");
           System.out.println("4  empty");
           System.out.println("5  display");
           System.out.println("6  exit");
      
          int choice;
          System.out.println("Enter your choice ");
          choice=Integer.parseInt(b.readLine());
      
    	  switch(choice)
    	  {
    	  case 1:
    	  {
    		System.out.println("Enter the values");
    		int value=Integer.parseInt(b.readLine());
    		s.push(value);
    		System.out.print("The push values are  ");
    		s.display();
    		System.out.println();
    		break;
    	   }
    	  
    	   case 2:
    	   {
    	    System.out.print("pop value is    " + s.pop());
    	    s.display();
    	    System.out.println();
    	    break;
        	}
    	   
    	   case 3:
    	   {
    		s.peek();
    		System.out.print("peek value is    ");
    		s.display();
    		break;
    	    }
    	   
        	case 4:
    	    {
    		if(s.empty())
    		
    			System.out.println("empty");
    		else
    			System.out.println("not empty");
    	     }
         	case 5:
    	    {
    		s.display();
    		break;
    	    }
    	    
    	    case 6:
    		return ;
    	    default:
    	    System.out.println("sorry your choice is invalid");
    	   	
    	}
	}
}}
