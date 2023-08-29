package june9;

public class swapEx2 {
	public static void main(String[] args) {
		swapEx2 swap = new swapEx2();
//		swap.swapNumber(6,10);
//		swap.swapWithout(4,20);
//		swap.fibonacciSeries(6);
//		swap.tempFibonacciSeries(8);
//		System.out.println();
//		swap.tempFibonacciSeries2(8);
		int a=0;
		while(a++<5)
			System.out.print(a+" ");
			
		a=1;
		while(a<5)
			System.out.println(++a);
		
		a=1;
		while(a<5)
			System.out.println(a++);
		
	for(int no=1;no<=5;no++)
	{
		
	}
	//	System.out.println(no);
				

		
	}

	private void tempFibonacciSeries2(int i) {
		int a=0,b=1,count=0;
		while(count<i)
		{
			System.out.print(a+" ");
			a=b-a;
			b=a+b;
			count++;
		}
	}

	private void tempFibonacciSeries(int i) {
		int a=0,b=1,j=1;
		System.out.print(a+" "+b+" ");
	while(i-1>j)
	{
		
		b=a+b;
		System.out.print(b+" ");
		a=b-a;
		j++;
	}
	}

	private void fibonacciSeries(int i) {
		int a=0,c,b=1,j=0;
			System.out.print(a+" "+b+" ");
		while(i-3>=j)
		{
			c=a+b;
			a=b;
			b=c;
			j++;
			System.out.print(c+" ");
		}
	}

	private void swapWithout(int i, int j) {
		i=i+j;
		j=i-j;
		i=i-j;
		
	}

	private void swapNumber(int i, int j) {
		int temp;
		System.out.println("before swapping i="+i+" and j="+j);
		temp=i;
		i=j;
		j=temp;
		System.out.println("before swapping i="+i+" and j="+j);
	}
}
