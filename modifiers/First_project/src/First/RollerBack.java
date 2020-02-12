//$Id$
package First;

public class RollerBack {

	Queue qu=new Queue();
	Queue temp=new Queue();
	public int calculateEarnings(Queue qu,int R,int k)
	{
		int earnings=0;
		while(R-- > 0)
		{
			int headCount=0;
			while(!qu.empty() && k>=headCount+qu.peek())
			{
				headCount+=qu.peek();
				temp.push(qu.peek());
				qu.pop();
			}
			earnings=earnings+headCount;
            while(!temp.empty())
            {
        	   qu.push(temp.peek());
        	   temp.pop();
        	   
            }
		}
        return earnings;		
	}
}
