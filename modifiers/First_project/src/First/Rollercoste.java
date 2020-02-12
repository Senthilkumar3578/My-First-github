//$Id$
package First;
import java.util.Scanner;
public class Rollercoste {
	public static void main(String args[])
	{
		Queue qu=new Queue();
		RollerBack rb = new RollerBack();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the rounds of roller coaster");
		int r=s.nextInt();
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
		
		int earnings=rb.calculateEarnings(qu,r,k);
		System.out.println("The full earnings are   "+earnings);
		s.close();
	}	
}