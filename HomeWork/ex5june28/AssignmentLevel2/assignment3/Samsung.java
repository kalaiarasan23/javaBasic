package assignment3;

public class Samsung extends FactoryDemo
{
	boolean isOriginalPiece =false;
	static int price = 5000;
	
	public static void main(String[] args) 
	{
		Samsung sam = new Samsung();
		sam.browse();
		System.out.println("price variable "+sam.price);
		
		//factorydemo browsing is called
	}
	
	 void verifyFingerPrint() 
	 {
		 System.out.println("Samsung VerifyFingerPrint");
	 }
	 
	 void providePattern()
	 {
		 System.out.println("Samsung provide pattern");
	 }
	 
	 void browse()
	 {
		System.out.println("Factory Demo browsing"); 
	 }
	 
}
