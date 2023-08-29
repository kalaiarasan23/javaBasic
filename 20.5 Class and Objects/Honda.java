class Honda
{
static int dealer_id = 1234;  // global variable so we use static
static String owner_name = "Kumar";
int price; 
int cc; 
float discount; 

public static void main(String[] args)
{
    Honda shine     =  new Honda(); //new allocates memory
    Honda activa    =  new Honda(); 
    Honda unicorn   =  new Honda();
    shine.price = 65000;
    System.out.println("Price is "+shine.price);
    System.out.println(Honda.owner_name);
    System.out.println(unicorn.owner_name);
    System.out.println(owner_name);
}

}
