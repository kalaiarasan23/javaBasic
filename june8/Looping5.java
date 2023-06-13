package june8;

public class Looping5 {
	public static void main(String[] args) {
		Looping5 l5 = new Looping5();
		l5.findCommonDivisor(100,120);
	}

	private void findCommonDivisor(int no1, int no2) {
		// TODO Auto-generated method stub
		 int div = 2,greater=0; 
		    while(div<=no1 && div<=no2)
		    {                  
		      if(no1%div==0 && no2%div==0)
		      {
		      //  System.out.println(div);
		        greater=div;
		      }
		      div = div + 1; 
		    }
		    System.out.println("");
	}
}
