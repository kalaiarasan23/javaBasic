package ex3June;

final class ReverseFactor {

	public void isArmstrongNo(int i) {
		if(i==armstrongNo(i))
			System.out.println(i+" is an armstrong number");
		else
			System.out.println(i+" not an armstrong number");
	}

	public void isNeonNo(int i) {
		
		if(neonNo(i)==i)
			System.out.println(i+" is a neon number");
		else
			System.out.println(i+" not a neon number");
	}

	public void isStrongNo(int i) {
		int sum=0,temp=i;
		while(temp!=0)
		{
			sum+=factor(temp%10);
			temp/=10;
		}
		if(sum==i)
			System.out.println(i +" is strong number");
		else
			System.out.println(i+" is not a strong number");
	}

	public void isPerfectNo(int a)
	{
		if(a==divisorNo(a))
			System.out.println(a+" is perfect number");
		else
			System.out.println(a+" is not perfect number");
	}
	
	
	private static int countDigits(int i)
	{
		int sum=0;
		while(i!=0)
		{
			sum=sum+1;
			i/=10;
		}
		return sum;
	}
	
	private final int armstrongNo(int i)
	{
		int res=0,count=countDigits(i);
		while(i!=0)
		{
			int rem=i%10;
			res+=Math.pow(rem, count);
			i/=10;
		}                                              
		return res;
	}
	
	private final int neonNo(int i)
	{
		int temp=i*i,sum=0;
		while(temp!=0)
		{
			sum+=temp%10;
			temp/=10;
		}
		return sum;
	}
	
	private final int factor(int i)
	{
		int mul=1,st=1;
		while(st<=i)
			mul*=st++;
		return mul;
	}
	
	private int divisorNo(int a)
	{
		int div=1,ans=0;
		while(div<=a/2)
		{
			if(a%div==0)
				ans+=div;
			div++;
		}
		return ans;
	}
}
