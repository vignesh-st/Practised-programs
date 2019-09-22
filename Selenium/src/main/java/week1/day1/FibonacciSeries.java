package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=0,b=1,c;
	    for( int i=1; i<=20;i++ )
	    {
	    	c=a+b;	 
	    	a= b;
	    	b= c;  	
	    	System.out.println(a);
	    	
	    }


	}

}
