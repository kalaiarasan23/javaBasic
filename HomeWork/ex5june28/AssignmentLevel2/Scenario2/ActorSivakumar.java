package Scenario2;

class ActorSivakumar implements Actor{
	static String address = "Coimbatore";
	int carNo;
	String carName;
	
	
	public ActorSivakumar(int carNo, String carName) 
	{
		this.carName=carName;
		this.carNo=carNo;
	}
	
	public ActorSivakumar()
	{
		
	}

	public static void main(String[] args) {
		ActorSivakumar as = new ActorSivakumar(65,"Audi Car");
		as.act();
		as.dance();
		as.sing();
		as.speaking();
		System.out.println("actor address "+as.address);
		Actor ac = new ActorSivakumar();
		
		System.out.println("actor address "+ac.address);
	}
	

	@Override
	public void act() {
		System.out.println("Acting sivakumar");
	}

	@Override
	public void dance() {
		System.out.println("dance sivakumar");
	}

	@Override
	public void sing() {
		System.out.println("singing sivakumar");
	}
	
	void speaking()
	{
		System.out.println("speaking sivakumar");
	}

}
