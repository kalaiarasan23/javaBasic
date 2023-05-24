class Shopping
{
   public static void main(String arg[])
   {
        int amount[] = {1000,2000}, a=4;
        Shopping myself = new Shopping();
        System.out.println("pass by reference ");
        for(int i=0;i<2;i++)
            System.out.println(amount[i]);
        myself.purchase(amount);
        System.out.println("After function");
        for(int i=0;i<2;i++)
        System.out.println(amount[i]);

    System.out.println("\npass by value is "+a);
    myself.purchase(a);
    System.out.println("after function "+a);
   }

    int purchase(int a) 
    {
        a=20;
        //System.out.println("this methods "+this.a);
        System.out.println("local methods "+ a);
        return a;
    }

    void purchase(int[] cash)
    {
        cash[0]=10;
    }
}
