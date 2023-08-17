package assignment3;

public class FactoryDemo extends SmartPhone
{	
	boolean isOriginalPiece = false;
	static int price = 0;
	
	@Override
	int call(int secound) {
		return secound;
	}

	@Override
	void sendMessage() {
		System.out.println("FactoryDemo sendMessage ");
	}

	@Override
	void receiveCall() {
		System.out.println("FactoryDemo receiveCall ");
	}
	
	void browse()
	{
		System.out.println("Factory Demo browsing ");
	}
	
}
