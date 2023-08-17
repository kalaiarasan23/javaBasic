package scenario4;

public abstract class India 
{	
	static String captial = "New-Delhi";
	
	abstract void speakLanguage();
	abstract  void eat();
	abstract void dress();
	
	public India() {
		
	}
	
	public India(String primeMinister)
	{
		System.out.println("our Prime Minister is "+primeMinister);
	}
}

abstract class SouthIndia extends India
{
	void cultivate()
	{
		System.out.println("Rice and Wheat cultivation");
	}
	
	void livingStyle()
	{
		System.out.println("Average development");
	}
}
