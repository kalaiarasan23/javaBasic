package ex1;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ex1(5);
//		ex2();
//		ex3(12,42);
//		ex4(5,80);
		new Ex1().ex5(100);
//		ex6(4);
//		ex7(3);
//		ex8(5);
//		new Ex1().ex9(1,100);
//		ex10(263546431);
//		new Ex1().print_eight();

	}
	
	private void print_eight() 
	  {
	    int no = 12534;
	      
	      boolean result = false;
	      
	      int predigit = no%10;
	      
	      no = no/10;
	      
	      while(no>0)
	      {
	        int curdigit = no%10;
	        
	        if(curdigit>predigit)
	        {
	          System.out.println("Not ascending");
	          result = false;
	          break;
	        }
	        else
	        {
	          predigit=curdigit;
	          no = no/10;
	          result = true;
	        }
	        
	      }
	      if(result == true)
	      {
	        System.out.println("It maintain ascending order");
	      }  
	  }
	
	private static void ex10(int n) {
		int a[]=arraySeparator(n);
//		System.out.println(n);
		sorting(a);
		n=concateArray(a);
		System.out.println(n);
	}
	
	
	private static int[] arraySeparator(int n) {
		int a[] = new int[9];
		int j=0;
		while(n>0)
		{
			a[j]= n%10;
			n/=10;
			j++;
		}
		return a;
	}
	private static int concateArray(int[] a) {
		int n=0,j=0;
		while(true)
		{
			n+=a[j++];
			if(a.length-1<j)
				break;
			n*=10;
		}
		return n;
	}
	private static int[] sorting(int[] a) {
		for(int i=0 ; i<a.length-1 ;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp= a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		return a;
	}
	private void ex9(int n,int total) {
		for(int i=n ; i<=total ; i+=10)
		{
			int c=1;
			while(i/10 == n)
			{
				if(i/10==n)
				c*=10;
//				sideCount
			}
			if(c==1)
				System.out.println(i);
		}
		
	}
	private static void ex8(int n) {
		for(int i=n ; i>=2 ;i--)
		{
			int pro=1;
			for(int j=1 ;j<i;j++)
			{
				pro*=i;
			}
			System.out.println(i+" power "+ (i-1) +" is "+pro);
		}
	}
	private static void ex7(int n) {
		int pro=1;
		for(int i=n; i>=1 ;i--)
		{
			pro*=i;
		}
		System.out.println(pro);
	}
	private static void ex6(int n) {
		for(int i=2;i<=n;i++)
		{	
//			System.out.println((int)Math.pow(2, i));
		
//		2nd method
			int temp =2*1;
			for(int j=2;j<=i;j++)
				temp*=2;
			System.out.println(temp);
		}
	}
	
	
	
	public boolean isPrime(int a)
	{
		for(int i=2; i<=a/2;i++)
		{
			if(a%i==0)
				return false;
		}
			
		return true;
	}
	private void ex5(int no) {
		 for(int i=2;i<=no/2 ;i++) {
			 
			 if(isPrime(i) && no%i==0)
				 System.out.println(i);
		 }
	}

	private static void ex4(int start, int end) {
		int a=0,b=1,count=0;
		while(count<end)
		{
			count=a+b;
			a=b;			
			b=count;
			if(start<count)
				System.out.println(count);
		}
	}

	private static void ex3(int a, int b) {
		int gcd=1,lcd=1;		
		for(int i=2;i<=(a>b?a:b)/2 ;i++)
		{
			if(a%i==0 && b%i==0)
			{
				if(lcd==1)
					lcd=i;
				gcd=i;
			}
		}
		System.out.println("greater common divisor "+gcd);
		System.out.println("Least common divisor "+lcd);
	}

	private static void ex2() {
		int i=1,n=5,t;
		t=n;
		while(i<=n)
		{
			System.out.print(i*t+ " ");
			if(t==n && i==n)
			{
				i=1;
				t=4;
				System.out.println();
				continue;
			};
			i++;
			
		}
	}

	private static void ex1(int a) {
		for(int i =1 ; i<=a;i++)
		{
			for(int j=1;j<=i;j++)
				System.out.print("1");
			System.out.print(" ");
		}
	}

}
