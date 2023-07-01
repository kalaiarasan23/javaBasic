package assignment3;

public class Kid extends Mother{
	String name = "Suman";
	
	
	public void work()
	{
		super.work();
		System.out.println("kid name "+name+" mother name "+super.name);
	}
	
	
	public void study()
	{
		System.out.println("kid study");
		work();
	}
	
	
	public static void main(String[] args) 
	{
		Kid kid = new Kid();
		kid.work();
	}
	
}

class Mother extends Grandma
{
	String name = "Stella Son";
	public void work()
	{
		System.out.println("mother name "+name+" grandga name "+super.name);
		super.work();
	}
}
