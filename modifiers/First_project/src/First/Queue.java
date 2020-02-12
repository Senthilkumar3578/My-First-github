package First;

public class Queue implements QueueInterface {
	private int length=0,count =1;
	private	int a[]=new int[count];
		public void push(int value)
		{
			if(length==count)
			{
				count*=2;
			int t[]=new int[count];
			for(int i=0;i<length;i++)
			{
				t[i]=a[i];
				
			}
			t[length]=value;
			
			a=t;
			}
			else
			    a[length]=value;
		    	length++;
		}
		
		public void pop()
		{
			int z=-1;
			if(length>0)
			{
			z=a[0];
			for(int i=0;i<length-1;i++)
			{
				a[i]=a[i+1];
				
			}
		     length--;
			}
		}
		public int peek()
		{
			if(length>0)
			{
				 return a[0];
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
				System.out.print(a[i]+" ");
			}
		}
		public int size()
		{
			return length;
		}
		
		
	}

