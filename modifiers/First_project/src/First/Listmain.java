//$Id$
package First;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.LinkedList;
import First.List;
public class Listmain {
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		List l=new  List();
		while(true)
		{
			System.out.println("1  Insert first element \n2  Insert last element \n3  Remove first \n4  Remove last \n5  Contains \n6  Remove at index postion \n7  Set the element");
	        System.out.println("Enter your choice");	
			int choice =Integer.parseInt(br.readLine());
			switch(choice)
			{
			
			case 1:
			{
				System.out.println("Enter the first element");
				int value=Integer.parseInt(br.readLine());
				l.insertFirstElement(value);
				System.out.print("The add value is  ");
				l.display();
				break;
			}
			case 2:
			{
				System.out.println("Enter the last element");
				int v=Integer.parseInt(br.readLine());
				l.insertLastElement(v);
				System.out.print("The last adding value is  ");
				l.display();
				break;
				
			}
			case 3:
			{
				l.removeFirst();
				System.out.println("remove first value ");
				l.display();
			
				break;
			}
			case 4:
			{
				l.removeLast();
				 
				l.display();
				System.out.print("remove Last value");
				break;
			}
			case 5:
			{
				System.out.println("Enter the check value");
				int v=Integer.parseInt(br.readLine());
				if(l.contains(v))
					System.out.println("value is done");
				else
					System.out.println(" sorry your value is Not");
				break;
			}
			case 6:
			{
				System.out.println("Enter the index posion ");
				int v=Integer.parseInt(br.readLine());
				int Removedvalue = l.removeIndexPosition(v);
				
				System.out.println("the remove value is" +Removedvalue+"\nList:");
				l.display();
				break;
			}
			
		
			case 7:
			{
				System.out.println("enter the posiotn");
				int v=Integer.parseInt(br.readLine());
			
				System.out.println(" enter your veriable");
				int p=Integer.parseInt(br.readLine());
				l.setIndexPosition(v,p);
				l.display();
				break;
				
			}
			
			
			}
			
		}
	}

}
