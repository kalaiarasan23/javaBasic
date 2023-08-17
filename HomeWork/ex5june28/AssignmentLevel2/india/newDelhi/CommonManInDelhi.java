package india.newDelhi;

public class CommonManInDelhi implements TrafficRulesDelhi {
	
	
	public static void main(String[] args) {
		CommonManInDelhi man = new CommonManInDelhi();
		man.dontGoByDisealVehicle();
		man.goByBicycle();
	}

	@Override
	public void dontGoByDisealVehicle() {
		System.out.println("Delhi Diseal Vehicle");
	}

	@Override
	public void goByBicycle() {
		System.out.println("Delhi Bicycle");
	}
}
