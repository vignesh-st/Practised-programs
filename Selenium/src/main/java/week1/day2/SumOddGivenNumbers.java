package week1.day2;

public class SumOddGivenNumbers {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			
			int input = 4567;
			int sum = 0;
			while(input>0)
			{
				int a = input%10;
				if (!(a%2 == 0))
						{
					sum = sum+ a;					
						}
				input= input/10;
			}
			
			System.out.println(sum);
	
	
		}
	
	}
