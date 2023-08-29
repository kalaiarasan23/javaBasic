

public class fibo{
	public static void main(String[] args) {
		fibo ex = new fibo();
		//ex.printFibo();

//increment and decrement 
        int no = 10; 
          System.out.println(no++); //10 
          System.out.println(no);   //11
          System.out.println(++no); //12
          System.out.println(no);   //12
//decrement 
  System.out.println(no--);         //12
  System.out.println(no);           //11
  System.out.println(--no);         //10
  System.out.println(no);           //10

    System.out.println(no++ +" "+no);   // 10 11

	}

	private void printFibo() {
    // TODO Auto-generated method stub
    int a = 0, b = 1; 
    int count = 0; 
    while(count<10)
    {
      System.out.print(a+" ");
      a = b-a; 
      b = a+b; 
      count=count+1; 
    }
  }
}
