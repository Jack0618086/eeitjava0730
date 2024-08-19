package tw.jack.tutor;

public class Jack36 {

	public static void main(String[] args) {
		Bird b1 = new Bird();
		try {
		b1.setLeg(7);
		}catch (Exception e) {
			System.out.println("Ooooop");
		}
	}

}

class Bird {
	private int leg; //0
	
	void setLeg(int leg) throws Exception {
		if(leg >= 0 && leg <= 2) {			
			this.leg = leg;
		}else {
			throw new Exception();
		}
	}
}