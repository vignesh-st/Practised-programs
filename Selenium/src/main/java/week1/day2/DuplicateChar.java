package week1.day2;

public class DuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "india";
		
	char[] s = input.toCharArray();
		
		for (int i=0; i <= s.length-1;i++)
		{
			for(int j = i+1; j<=s.length-1; j++)
			{
				if(s[i]==s[j])
				{
					System.out.println(s[i]);
				}
				
			}
			
			
			
		}

	}

}
