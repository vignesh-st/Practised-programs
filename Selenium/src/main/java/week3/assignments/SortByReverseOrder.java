package week3.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortByReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <String> companyNames = new ArrayList<String> ();
		companyNames.add("HCL");
		companyNames.add("CTS");
		companyNames.add("Aspire Systems");
		Collections.reverse(companyNames);
		System.out.println(companyNames);

	}

}
