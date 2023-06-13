package june13Package2;

public class Parents {
	public int doorNo = 100;
	private int age = 20;
	
			protected void give_invitation()
			  {
			    System.out.println("harish marriage");
			  }
	
	public void hobby()
	{
		System.out.println("ARS Theatre");
	}
	
	public static void main(String[] args) {
		Parents hp = new Parents();
		 System.out.println(hp.doorNo);
		  hp.hobby();
		  hp.give_invitation();

	}

}
