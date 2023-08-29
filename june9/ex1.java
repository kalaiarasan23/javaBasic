package june9;

public class ex1 {
	public static void main(String[] args) {
		lcm(50,101);
	}

	private static void lcm(int no1, int no2) {
		int big= no1>no2 ? no1 : no2;
		int temp=big;
		System.out.println(big);
		while(true) {
			if(big%no1==0 && big%no2==0)
			{
				System.out.println(big);
				break;
			}
			System.out.println(big+" before ");
			big=big+temp;
			System.out.println(big+" after ");
		}
	}
}
