package week3.assignments;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class UniqueCharactersInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "PayPal India";
		String replaceAll = a.replaceAll("\\s", "");
		System.out.println(replaceAll);
		
		char[] charArray = replaceAll.toCharArray();
		Map<Character, Integer> mapObj = new LinkedHashMap<Character, Integer> ();
		for (char c : charArray) {
			
			if(mapObj.containsKey(c))
			{
				mapObj.put(c, mapObj.get(c)+1);
			}
			else
				mapObj.put(c, 1);
		
			
		}
		//mapObj.remove(arg0, arg1)
		
		Set<Entry<Character, Integer>> entrySet = mapObj.entrySet();
		
		for (Entry<Character, Integer> entry : entrySet) {
			if(entry.getValue()==1)
				System.out.print(entry.getKey());
			
		}
		

	}

}
