package may31;

public class ex1 {
	public static void main(String[] args) {
		ex1 ex = new ex1();
		ex.countOfDivisor(28);
//		ex.isPrimenumber(count);
	//	ex.greatestDivisor(100);
	//	ex.smallestDivisor(15);
	//	ex.greatSmall(15);
	}

	private void greatSmall(int no) {
		// TODO Auto-generated method stub
	    int smallest =0;
	    int greatest=0;
	    boolean smallFound =false;
	    
	    int div=2;
	    while(div<=no/2)
	    {
	      if(no%div==0 && smallFound==false)
	      {
	        smallest=div;
	        smallFound=true;
	        //break;
	      }
	      
	       if(no%div==0)
	          {
	            greatest = div; 
	          }
	      div =div+1;
	    }
	    System.out.println("Smallest Divisor is "+ smallest);
	    System.out.println("Greatest Divisor is "+ greatest);
	}

	private void smallestDivisor(int no) {
		// TODO Auto-generated method stub
	    int div = 2; 
	    int smallest = -1; 
	    while(div<=no/2)
	    {
	      if(no%div==0)
	      {
	        smallest = div; 
	        break; 
	      }
	      div = div+1; 
	    }
	    System.out.println("Smallest divisor is "+ smallest);
	    
	}

	private void greatestDivisor(int no) {
	    int div = 2; 
	    int greatest = 0,smallest=0; 
	    while(div<=no/2)
	    {
	      if(no%div==0)
	      {
	    	  if(smallest == 0)
	    		  smallest=div;
			greatest = div;
	    	  }
	      div = div+1; 
	      }
	    System.out.println("Greatest Divisor is "+ greatest);
	    System.out.println("Smallest Divisor is "+ smallest);
	}

	private void isPrimenumber(int count) {
		// TODO Auto-generated method stub
		if(count==0)
			System.out.println("prime number ");
		else
			System.out.println("not prime number");
	}

	private int countOfDivisor(int no) {
		// TODO Auto-generated method stub
		int div =2,count=0;
		while(div<=no/2)
		{
			if(no%div==0)
			{
				System.out.println("div "+div);
				count =count +1;
			}
			div = div + 1;
		}
		System.out.println("count "+count);
		return count;
	}
	
	
}
