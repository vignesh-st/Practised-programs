package week1.day2;


import java.util.Arrays;


public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] empId = {23,45,6,8,99,84,73,1,36};
		Arrays.sort(empId);
		
		for(int empNo:empId) {
			System.out.print(empNo+" ");
		} 
		System.out.println("");
		
		for (int i= (empId.length-1);i >=0;i--)
		{
			System.out.print(empId[i]+" ");
		}
				

	}

}
