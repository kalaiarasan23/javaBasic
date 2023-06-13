package june3;

public class Ex1 {
	int count,sum;
	public static void main(String[] args) {
		Ex1 ex1 = new Ex1();
		//printReverse(751239);
		//ex1.countOfDigits(123);
		ex1.printStraightOrder(1253);
		System.out.println(ex1.count);
//		System.out.println(ex1.sum);
	}

	private void printStraightOrder(int no) {
		// TODO Auto-generated method stub
	    int div = 1000;
	    while(div>=1)
	    {
	  System.out.println(no/div+ " ");  // ==> 1
	    no = no%div; //no = 234
	    div = div/10; 
	    }
	}

	private void countOfDigits(int no) {
	    //int count = 0; 
	    while(no>0)
	    {
	      int rem = no%10;
	      no = no/10; 
	      this.sum += rem;
	      this.count = this.count +1; 
	      System.out.println(rem);
	    }
	    //System.out.println(this.count);
	  }
}
