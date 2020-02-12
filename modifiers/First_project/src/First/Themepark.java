//$Id$
package First;

import java.util.Scanner;

public class Themepark {
     public static void main(String args[])
     {
    	 Scanner s=new Scanner(System.in);
    	 Queue qu=new Queue(); 
    	 RollerBack r=new RollerBack();
    	 System.out.println("1  Childran");
    	 System.out.println("2  Adult");
    	 System.out.println("3  Senior");
    	 System.out.println("4  Super Senior");
  	     System.out.println("Please enter your choice");
    	 int Citizens=s.nextInt();
    	 if(Citizens==1){
    		 System.out.println("***-------Game Typs-------***");
             System.out.println("1  All water games");
        	 System.out.println("2  Jaint whell");
        	 System.out.println("3  Kolabus");
    	 }
    	 else if(Citizens==2){
    		 System.out.println("***-------Game Typs-------***");
             System.out.println("1  All water games");
        	 System.out.println("2  Jaint whell");
        	 System.out.println("3  Kolabus");
        	 System.out.println("4  Rollercpaster");
    	 }
        else if(Citizens==3){
        	 System.out.println("***-------Game Typs-------***");
             System.out.println("1  All water games");
             System.out.println("2  Jaint whell");
             System.out.println("3  Kolabus");
             System.out.println("4  Rollercpaster");
    	 }
        else{
        	 System.out.println("***-------Game Typs-------***");
        	 System.out.println("1  Park");
        	 System.out.println("2  All Cinmas");
        }
    	     System.out.println("Sorry all games are out of Service");
    	     System.out.println("So please enter the RollerCoaster option");
    	     System.out.println("Enter your choice" );
    	     int choice =s.nextInt();
    	     switch(choice)
    	     {
    	     case 4:
    	     {
    		 
       	     System.out.println("-----*Welcome to the Roller Coaster-----*");
       	     System.out.println("Enter the rounds of roller coaster");
 	    	 int a=s.nextInt();
 	    	 System.out.println("Enter the capacity of roller coaster");
 	    	 int k=s.nextInt();
 	    	 System.out.println("Enter the persons");
 	    	 int p=s.nextInt();
 	    	 System.out.println("Enter the members");
 	    	 for(int i=0;i<p;i++)
 			 {
 				int v=s.nextInt();
 				qu.push(v);
 			 }
 			
 			int earnings=r.calculateEarnings(qu,a,k);
 			System.out.println("The full earnings are   "+earnings);
 			s.close();
 		}	
    	 }
    	   }
    	   
    	 
    	 
     }

	

