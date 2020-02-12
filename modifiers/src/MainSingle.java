//$Id$

public class MainSingle {

	public static void main(String args[])
	{
		Senthil singleton1=Senthil.getValue();
		Senthil singleton2=Senthil.getValue();
		singleton1.display();
		singleton2.display();
		
	}
}
