package tamilnadu.chennai;

public class CommonManInChennai implements TrafficRules {

	public static void main(String[] args) {
		CommonManInChennai man = new CommonManInChennai();
		man.gobyBicycle();
		man.goByDieselVechine();
	}

	@Override
	public void goByDieselVechine() {
		System.out.println("Diseal vechine");
	}

	@Override
	public void gobyBicycle() {
		System.out.println("Bicycle");
	}

}
