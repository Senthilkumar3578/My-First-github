//$Id$
package First;

interface QueueInterface {
	public void push(int value);
	public void pop();
	public int peek();
	public boolean empty();
	public void display();
	

}
class a
{
	private int add()
	{
		int i=100;
		return i;
	}
}
class b extends a
{
	public int add()
	{
		int i=0;
		return i;
	}
	public static void main(String args[])
	{
		b obj=(b)new a();
		System.out.println(obj.add());
	}
}
