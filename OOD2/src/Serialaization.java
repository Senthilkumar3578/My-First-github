//$Id
class Emploey
{
	private int empid;
   public void setId(int id)
   {
	  this.empid=id;
   }
   public int getEmp(){
	   return empid;
   }
}
class Serialaization{
	public static void main(String args[])
	{
		Emploey e=new Emploey();
		e.setId(4);
		System.out.println(e.getEmp());
	}
}