//$Id$

public class Senthil {
	 private static Senthil singleton;
	 private Senthil()
	 {
		 System.out.println("Senthil");
	 }
	 public static Senthil getValue()
	 {
		 if(singleton==null)
		 {
			 singleton=new Senthil();
		 }
		 return singleton;
	 }
	 public void display()
	 {
		 System.out.println("called display");
	 }

}
