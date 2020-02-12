//$Id$
package First;

public class Details {
	RollerBack r=new RollerBack();
	void getDetails(){
     Queue qu=new Queue();
     Getelement g=new Getelement();
     System.out.println("***---WELCOME TO THE ROLLERCOASTER---***");
     System.out.println();
     System.out.println("PLEASE ENTER YOUR DEATAILS");
     System.out.println();
	 System.out.println("Enter the rounds of roller coaster");
 	 int a=g.getValue();
 	 System.out.println("Enter the capacity of roller coaster");
 	 int k=g.getValue();
 	 System.out.println("Enter the capacity of persons");
 	 int p=g.getValue();
 	 System.out.println("Enter the members");
 	 for(int i=0;i<p;i++)
		 {
			int v=g.getValue();
			qu.push(v);
		 }
	
	
	int earnings=r.calculateEarnings(qu,a,k);
		System.out.println("The full earnings are   "+earnings);
	
	}
}
