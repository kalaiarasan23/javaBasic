package june5;

public class ex1 {
	public static void main(String[] args) {
		
		ex1 e1 = new ex1();
	//	System.out.println(Math.random());
		
		e1.findRound(34.9);
	//	learnMathFunctions();
	//	ex1.findCeil(35.0);
	//	ex1.findFloor(43.1);
	//	e1.findAbs(0);
	//	System.out.println(e1.findPower(-0));
	}
	
	
	
	private void findRound(double d) {
		double d1= d-(int)d;
		System.out.println(d1); 
		if(d1<.5)
			System.out.println((int)d);
		else
			System.out.println((int)d+1);
	}

	private double findSign(int no) {
	    // TODO Auto-generated method stub
	    if(no>0)
	      return 1.0;
	    else if(no<0)
	      return -1.0;
	    else
	      return 0.0;
	    
	  }

	private double findPower(int a, int b) {
	    int p = 1;
	    while(b>0)
	        {
	        p = p * a; 
	        b = b - 1; 
	        }
		return p;
	}



	private void findabs(int i) {
		if(i>0)
			System.out.println(i);
		else
			System.out.println(i*-1);
	}



	private void find_min(int no1, int no2) {
	    // TODO Auto-generated method stub
	    if(no1<no2)
	      System.out.println(no1);
	    else
	      System.out.println(no2);
	    
	  }

	  private void find_max(int no1, int no2) {
	    // TODO Auto-generated method stub
	    if(no1>no2)
	      System.out.println(no1);
	    else
	      System.out.println(no2);
	    
	  }

	private static void findFloor(double d) {
		int i = (int)d;
		System.out.println((double)i);
	}


	private static void findCeil(double d) {
		int i = (int)d;
		if(d==i)
			System.out.println((double)i);
		else
			System.out.println((double)i+1);
	}


	private int findSqrt(int i) {
		int a=2;
		while(i/2>=a) {
			if(a*a == i)
				break;
			a++;
		}
		return a;
	}

	private static void learnMathFunctions() {
		int no=125;
		System.out.println(Math.abs(no));
		double d = 1.2346454;
		System.out.println(Math.floor(d));
		System.out.println(Math.ceil(d));
		System.out.println((int)Math.pow(10, 3));
		System.out.println(Math.sqrt(49));
		
	}
}
