package Assignment0;

public class Theatre {

	public static void main(String[] args) {
		Theatre raja = new Theatre();
		int balance = raja.bookTicket(200);
		System.out.println("After booking ticket "+balance);
	}

	private int bookTicket(int i) {
		int ticket_price = 120,balance;
		balance=i-ticket_price;
		return balance;
	}

}
