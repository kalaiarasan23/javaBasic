package assignment4;

public abstract class BranchPlan extends HeadOffice{

	public static void main(String[] args) {
		System.out.println("main method ");
		BranchPlan branch = new Branch();
		branch.checkAccounts(1000);
		branch.payTax(2000);
		branch.doInterview();
		
	}

	  public void doInterview()
	  {
		  System.out.println("the Interview is going");
	  }
}

abstract class HeadOffice
{
	public void checkAccounts(int amount)
	{
		System.out.println("amount is "+amount);
	}
	public void payTax(int amount)
	{
		System.out.println("payTax amount "+amount);
	}
	
	abstract void receiveCustomers();
}

class  Branch extends BranchPlan
{
	void receiveCustomers()
	{
		System.out.println("abstact receieve customer");
	}
		
}
