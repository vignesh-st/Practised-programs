package week1.assignments;

public class SummAllDigitsGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input = 123456789  ;
		int a,sum =0;
		
		while (input>0)
		{
			a = input%10;
			sum = sum+a;
			input = input/10;
			
		}
		
		System.out.println(sum);

	}

}
