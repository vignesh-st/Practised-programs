package week1.day2;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n = 15;
		int count=0;
		
		for (int i =2;i<=n-1;i++)
		{
			if(n%i == 0)
			{
				count++;
			}
			
			
		}
		
		if(count==0)
			
		{
			
			System.out.println("Number is a prime number");
		}
		else
		{
			System.out.println("Number is not a prime number");
		}
		
		
		

	}

}
