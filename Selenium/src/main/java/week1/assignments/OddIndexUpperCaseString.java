package week1.assignments;

public class OddIndexUpperCaseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String input = "changeme";
	char inChar[] = input.toCharArray();
	
	for(int i = 0; i<inChar.length;i++)
	{
		if(!(i%2 == 0)) 
		{
		char a2 =  input.toUpperCase().charAt(i);
		System.out.print(a2);
		}
		else
		{
			System.out.print(input.charAt(i));
		}
		
	}
	

	}

}
