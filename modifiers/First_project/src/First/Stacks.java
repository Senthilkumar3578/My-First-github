
package First;

public class Stacks implements StackInterface{
	private int length=0;
	private int array[];
	public void push(int value)
	{
		int temp[]=new int[++length];
		for(int i=0;i<length-1;i++)
		{
			temp[i]=array[i];
			
		}
		temp[length-1]=value;
		array=temp;
	}
	public int pop()
	{
		int t[]=new int[--length];
		for(int i=0;i<length-1;i++)
		{
			t[i]=array[i];
			
		}
	    int temp = array[length];
		array=t;
		return temp;
	}
	public int peek()
	{
		if(length>0)
		{
			 return array[length-1];
		}
		else{
			return -1;
		}
	
	}
	public boolean empty()
	{
		if(length==0)
			return true;
		else
			return false;
	}
	public void display()
	{
		for(int i=0;i<length;i++)
		{
			System.out.print(array[i]+" ");
		}
	}
	
	
}
	