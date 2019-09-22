package week3.day1;

public class BSAcycle extends Bicycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BSAcycle myCycle = new BSAcycle();
		myCycle.filAir();
		myCycle.filAir("FrontTyre");
		myCycle.getColor();
		myCycle.getColor(3345);
	}
	
	public void filAir() {
		System.out.println("Fill Nitrogen Air to both tyres");
	}

}
