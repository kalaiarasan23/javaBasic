package ex2June4;

public class Ex2 {

	public static void main(String[] args) {
		int no=623009,i=1000,id=no/i;
//		switchCase(id);	
		ifElseCase(id);
		
		
		long number=9973556781L;
		int num=(int)(number/100000000L);
		System.out.println(num);
		numberCheck(num);
	}

	private static void numberCheck(int num) {
		if(num==91)
			System.out.println("Docomo");
		else if(num==94)
			System.out.println("BSNL");
		else if(num==96)
			System.out.println("Aircel");
		else if(num==99)
			System.out.println("Airtel");
		else if(num==63)
			System.out.println("JIO");
		else if(num==97)
			System.out.println("IDEA");
		else if(num==98)
			System.out.println("Vodafone");
		else 
			System.out.println("cannot found ");
	}

	private static void ifElseCase(int id) {
		if(id==600)
			System.out.println("Chennai");
		else if(id==604)
			System.out.println("Thiruvannamalai");
		else if(id==605)
			System.out.println("Cuddalore");
		else if(id==607)
			System.out.println("Trichi");
		else if(id==608)
			System.out.println("Ariyalur");
		else if(id==609)
			System.out.println("Nagapattinam");
		else if(id==613)
			System.out.println("Pudukkottai");
		else if(id==621)
			System.out.println("Sivagangai");
		else if(id==623)
			System.out.println("Ramanathapuram");
		else if(id==624)
			System.out.println("Dindigul");
		else if(id==625)
			System.out.println("Madurai");
		else if(id==626)
			System.out.println("Virudhunagar");
		else if(id==627)
			System.out.println("Tirunelveli");
		else if(id==628)
			System.out.println("Tuticorin");
		else if(id==642)
			System.out.println("Coimbatore");
		else if(id==635)
			System.out.println("Dharmapuri");
		else
			System.out.println("pincode is invalid");
		
	}

	private static void switchCase(int id) {
		switch(id)
		{
		case 600:
			System.out.println("Chennai ");
			break;
		case 604:
			System.out.println("Thiruvannamalai");
			break;
		case 605:
			System.out.println("Cuddalore ");
			break;
		case 607:
			System.out.println("Trichi");
			break;
		case 608:
			System.out.println("Ariyalur");
			break;
		case 609:
			System.out.println("Nagapattinam");
			break;
		case 613:
			System.out.println("Pudukkottai");
			break;
		case 621:
			System.out.println("Sivagangai");
			break;
		case 623:
			System.out.println("Ramanathapuram");
			break;
		case 624:
			System.out.println("Dindigul");
			break;
		case 625:
			System.out.println("Madurai");
			break;
		case 626:
			System.out.println("Virudhunagar");
			break;
		case 627:
			System.out.println("Tirunelveli");
			break;
		case 628:
			System.out.println("Tuticorin");
			break;
		case 642:
			System.out.println("Coimbatore");
			break;
		case 635:
			System.out.println("Dharmapuri");
			break;
		default:
			System.out.println("pincode is invalid");
			break;
		}
	}

}
