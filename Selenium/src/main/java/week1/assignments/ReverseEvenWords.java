package week1.assignments;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 String str = "I am a software tester";
	 String[] split1 = str.split(" ");
		int splitLen = split1.length;
		
		for(int i=0;i<splitLen;i++)
		{
			if(!(i %2 == 0))
		
			{
				for(int j = split1[i].length() -1 ;j>=0;j--)
				{
					System.out.print(split1[i].charAt(j));
				}
				System.out.print(" ");
				
			}
			
			else
			{
				System.out.print(split1[i]+" ");
			}
		}
		

	}

}
