package june6;

public class ex1 {

	public static void main(String[] args) 
	{
		ex1 armstrong =new ex1();
		int Total1 =armstrong.num (153);
		int i=153;
		
		if (Total1==i) {	 
		 System.out.println( i + "is an Armstrong number");
		}
		  
		else {
		 System.out.println(i + " Is not an Armstrong number");
		}
		 
	}

	 private int num(int i) {
		int temp=i,sum=0;
		  while (i>0) {
		   int rem = i%10;
		   sum += (int) Math.pow(rem, 3);
		   i=i/10;
		  }
		  i=0;
		  if(temp==sum)
			  System.out.println("total "+temp);
		  
		  return temp;
		  
		 }
}
