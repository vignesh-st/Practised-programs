package week3.day2;

import java.util.Map;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Testleaeeefyutre";
		
			char[] obj = name.toCharArray();
			Map<Character,Integer> objMap = new TreeMap<Character,Integer> ();
			
			for (char newobj : obj) {
				
				if(objMap.containsKey(newobj)	)
						{
					objMap.put(newobj,objMap.get(newobj)+1);
						}
				else
					{objMap.put(newobj, 1);
					}
			}
			System.err.println(objMap);
			
			
			
			
			
			  
			
			
			
			
			
			
			
//			for (char newCharArray : obj) {
//				
//				if(objMap.containsKey(newCharArray))
//				{
//				count++;
//				objMap.put(newCharArray, count);
//				}
//				else
//				{
//					
//					objMap.put(newCharArray, 1);
//				}
//			}
//			System.out.println(objMap);
//			
			//System.out.println();
			
			
			
	}

}
