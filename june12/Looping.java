class Looping
{
    public static void main(String arg[])
    {

        //loop 1
        int no1 = 10, no2 = 20; 
        while(no1>=1 || no2>=1)
        {
          System.out.println(no1);
          no1--;
          no2--;
        }
        
        //loop 2

        for(int no1=10, no2=20; no1>=1 || no2>=2 ;no1--, no2--)
        {
          System.out.println(no1+" "+no2);
        }

        //loop 3
        int no;
        for( no=1; no<=5; no++)
        {
          System.out.println(no);
        }
        System.out.println(no);
        
        //loop 4
        for(int no=1; no<=5; no++)
        {
          System.out.println(no);
        }
        System.out.println(no);
                
       /* infinite loop
        for(;;)
        {
          System.out.println("Hi");
        }*/
    }


}
