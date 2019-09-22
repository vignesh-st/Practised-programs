package week1.day1;

public class ArithmaticProbs {

	static int a=10;
	static int b=5;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArithmaticProbs val = new ArithmaticProbs();
		int c = val.add(a, b);
		System.out.println(c);
		int d = val.sub(a, b);
		System.out.println(d);
		int e = val.mul(a, b);
		System.out.println(e);
		int f = val.div(a, b);
		System.out.println(f);
		
	}
	
	public int add(int x, int y)
	{
		int z = x+y;
		
		return z;
	}
	
	public int sub(int x, int y)
	{
		int z = x-y;
		
		return z;
	}
	
	public int mul(int x, int y)
	{
		int z = x*y;
		
		return z;
	}
	
	public int div(int x, int y)
	{
		int z = x/y;
		
		return z;
	}
	
	
	

}
