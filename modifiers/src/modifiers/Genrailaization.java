//$Id$
package modifiers;
class Father{
	void work(){
		System.out.println("Hard work");
	}
	void salry()
	{
		System.out.println("3000");
	}
}
class Son extends Father{
	void son(){
		System.out.println("Enjoy son");
	}
}
public class Genrailaization {

	public static void main(String[] args) {
	Father f=new Son();
	f.work();
	f.salry();
    Son s=(Son) f;
    s.work();
    
	}

}
