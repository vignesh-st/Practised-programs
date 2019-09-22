package week1.day1;

public class PrintPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int numb = 112;
		int count = 0;
		
		for(int i=2; i<=numb; i++)
		{
			if(((numb%i) == 0))
			{
				count++;
				
			}
			
		}
		
		if(count>1)
		{System.out.println("number is the not prime number");}
		else
			
		{System.out.println(" prime number");
		}
			
		
	}

}
