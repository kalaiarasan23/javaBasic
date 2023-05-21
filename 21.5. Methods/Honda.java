class Honda
{
static int dealer_id = 1234;  
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
    System.out.println(Honda.owner_name);
    System.out.println(unicorn.owner_name);
    System.out.println(owner_name);
    shine.buy(12500);
    activa.buy(11100);

}

void buy(int val)
{
    System.out.println("you buy a Honda buy "+ val);
    offer(val);
}

static void offer(int amt)
{
    System.out.println("The orginal price is     "+ amt);
    System.out.println("Due to summer offer, we give 10% offer for our product");
    System.out.println("now the price is     "+(amt-(amt/10)));
}
}
