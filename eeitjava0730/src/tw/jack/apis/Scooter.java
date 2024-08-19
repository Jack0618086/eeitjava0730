package tw.jack.apis;

public class Scooter extends Bike{
	private int gear;
	private String color;

	public Scooter() {
		System.out.println("Scooter()");
		color = "Yellow";
	}

	public Scooter(String color) { //建構式
		// super();
		System.out.println("Scooter(String)");
		this.color = "color";
	}

	public void changeGear(int gear) {
		if (gear >=0 && gear <=4) {
			this.gear = gear; // 將private的gear參數改為物件
		}
	}

	public void upSpeed() {		
		if (gear > 0) {

			speed = speed < 1? 1:speed * 1.8 * gear;
		}
	}

	public String getColor() {
		return color;
	}
}