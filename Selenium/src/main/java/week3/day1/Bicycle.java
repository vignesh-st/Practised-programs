package week3.day1;

public  class Bicycle {

	public void getColor() {
		System.out.println("Black");

	}

	public void filAir() {
		System.out.println("Fill Ordinary Air to both tyres");
	}

	public void getColor(int regNo) {
		if (regNo == 3345)
			System.out.println("Red");
		else
			System.out.println("White");
	}

	public void filAir(String whichTyre) {
		if (whichTyre.equals("FrontTyre")) {
			System.out.println("fill Ordinary Air to Front Tyre ");
		} else {
			System.out.println("fill Nitrogen Air to Back Tyre");
		}
	}

}
