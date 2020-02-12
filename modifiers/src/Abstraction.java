//$Id$

abstract class Abs {
	abstract void add();  

}
class Answ extends Abs{

	void add()
	{
		System.out.println("add method called");
	}
}
class Abstraction{
	public static void main(String args[])
	{
		Abs a=new Answ();
		a.add();
	}
}

