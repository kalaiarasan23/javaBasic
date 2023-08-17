package assignments1;

public class SQLTrainer extends Trainer {
	
	
	public SQLTrainer() {
		super();
		System.out.println("SQL Trainer");
	}
	
	
	public static void main(String[] args) {
		SQLTrainer ram = new SQLTrainer();
		System.out.println("salary "+ram.getSalary());
	}
	
}
