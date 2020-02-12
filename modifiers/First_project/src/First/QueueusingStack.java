//$Id$
package First;
import First.Stacks;
public class QueueusingStack {
	private Stacks s1=new Stacks();
	private Stacks s2=new Stacks();
			
	public void push(int value) {
		while (!s1.empty())
			s2.push(s1.pop());
		s1.push(value);
		while (!s2.empty())
			s1.push(s2.pop());;
	     }
		
		public void pop()
		{
			s1.pop();
		}
		public void peek()
		{
			s1.peek();
		}
		public boolean empty()
		{
			return s1.empty();
		}
		public void display()
		{
			s1.display();
		}
	}

