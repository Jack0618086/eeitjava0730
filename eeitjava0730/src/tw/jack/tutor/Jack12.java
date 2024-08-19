package tw.jack.tutor;

import tw.jack.apis.Bike;

public class Jack12 {

	public static void main(String[] args) {
		Bike myBike = new Bike(); Bike urBike = new Bike();
		System.out.println(myBike.getSpeed());
		myBike.upSpeed();myBike.upSpeed();myBike.upSpeed();myBike.upSpeed();
		myBike.downSpeed();
		System.out.println(myBike.getSpeed());
		System.out.println("----");
		System.out.println(urBike.getSpeed());
		urBike.upSpeed();urBike.upSpeed();
		System.out.println(urBike.getSpeed());
		System.out.println("----");
	}

}
