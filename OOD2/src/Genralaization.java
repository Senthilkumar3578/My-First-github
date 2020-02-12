//$Id$

class Father{
	void work(){
		System.out.println("Hard work");
	}
}
class Son extends Father
{
	void enjoy(){
		System.out.println("enjoy the son");
	}
}
class Genralaization{
	public static void main(String args[])
	{
		Father f=new Son();
		f.work();
		
	}
}