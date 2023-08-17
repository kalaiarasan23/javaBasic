package scenario4;

public class TamilNadu extends SouthIndia
{
	static String captial = "Chennai";
	
	public static void main(String[] args) {
		System.out.println("captial of India "+India.captial);
		System.out.println("captial of TamilNadu "+TamilNadu.captial);
		SouthIndia si= new  TamilNadu();
		si.cultivate();
		si.livingStyle();
		si.eat();
	}
	
//	void cultivate()
//	{
//		System.out.println("Rice and sugarcane cultivation");
//	}
	
	void livingStyle()
	{
		System.out.println("Above Average development ");
	}

	@Override
	void speakLanguage() {
		System.out.println("speak language Tamil ");
	}

	@Override
	void eat() {
		System.out.println("eat dosa ");
	}

	@Override
	void dress() {
		System.out.println("dress code veste");
	}

}
