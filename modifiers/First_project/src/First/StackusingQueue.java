//$Id$
package First;
import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

import First.StackQueue;
public class StackusingQueue {
	public static void main(String args[])throws IOException
	{
		StackQueue s=new StackQueue();
		
		 BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
	      while(true){
	      System.out.println("1  push");
	      System.out.println("2  pop");
	      System.out.println("3  peek");
	      System.out.println("4  empty");
	      System.out.println("5  display");
	      System.out.println("6  exit");
	      
	        int yours;
	        System.out.println("Enter your choice ");
	        yours=Integer.parseInt(b.readLine());
	      
	    	switch(yours)
	    	{
	    	case 1:
	    	{
	    		System.out.println("enter the values");
	    		int v=Integer.parseInt(b.readLine());
	    		s.push(v);
	    		System.out.println("the push values are");
	    		s.display();
	    		System.out.println();
	    		break;
	    	}
	    	case 2:
	    	{
	    		s.pop();
	    	    System.out.print("pop value is    ");
	    	    s.display();
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
	    		if(s.isEmpty())
	    		
	    			System.out.println("emprt");
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
	}


}
