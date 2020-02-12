//$Id$
package First;
import First.Queue;
public class StackQueue {
	
	
	private	Queue q1=new Queue();
	private	Queue q2=new Queue();
		
	public void push(int value)
	{
		q2.push(value);
		while(!q1.empty())
		{
			q2.push(q1.peek());
			q1.pop();
		}
		swap();
	}
	public void swap()
	{
		Queue temp=q1;
		q1=q2;
		q2=temp;
	}
	
	public void pop()
	{
		q1.pop();
	}
	public void peek()
	{
		q1.peek();
	}
	public boolean isEmpty()
	{
		return q1.empty();
	}
	public void display()
	{
		q1.display();
	}
	

}
