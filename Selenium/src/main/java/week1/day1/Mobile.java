package week1.day1;

public class Mobile {
	
	public int mCalculator(int a, int b)
	{
		int c = a+b;
		return c;
		
		
	}
	
	public String getMessage()
	{
		
		return "Hi";
	}
	
	
	public boolean  mSwitch()
	{
		
		return true;
	}

	
	
	public static void main(String[] args)
	
	{
		// TODO Auto-generated method stub
		Mobile mMoto = new Mobile();
		mMoto.mCalculator(2,3);
		int a = mMoto.mCalculator(2,3);
		System.out.println(a);
		String b = mMoto.getMessage();
		System.out.println(b);
		boolean c = mMoto.mSwitch();
		System.out.println(c);
	}
	
}
