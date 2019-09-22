package week3.assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Infosys Limited";
		String replaceAll = a.replaceAll("\\s", "");
		char[] charArray = replaceAll.toCharArray();
		
		Set<Character> objSet = new LinkedHashSet<Character> ();
		
		for (Character character : charArray) {
			boolean add1 = objSet.add(character);
			if (add1 == false)
			{
				System.out.print(character);
			}
		}
		//System.out.print(objSet);
		

	}

}
