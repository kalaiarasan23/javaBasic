package assignments1;

public class Trainer {
	String dept="Java",institude="Payilagam";
	private int salary = 10000;
	
	public int getSalary()
	{
		return salary;
	}
	
	public Trainer()
	{
		System.out.println("trainer parent class");
	}
	
	public Trainer(String dept, String institude)
	{
		this.dept=dept;
		this.institude=institude;
	}
	
	void training()
	{
		System.out.println("java trainer");
	}
	
	public static void main(String[] args) {
		//new Trainer();
		Trainer trainerKumar = new Trainer("CSE","payilagam");
	}
}


