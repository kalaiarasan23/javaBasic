package execise;

public class GreaterOfThreeNumber {
	public static void main(String[] args) {
		int a=10 , b=55 , c=18 ;
		
		if(a > b)
			if(a > c)
				System.out.println(a+" is greater of three number");
			else
				System.out.println(c+" is greater of three number");
		else
			if(b > c)
				System.out.println(b+" is greater of three number");
			else
				System.out.println(c+" is greater of three number");
	}
}
