package assignment3;

public abstract class SmartPhone {
	abstract int call(int secound);
	abstract void sendMessage();
	abstract void receiveCall();
	void browse()
	{
		System.out.println("SmartPhone ");
	}
	
	public SmartPhone() {
		System.out.println("Smartphone under development ");
	}
}

