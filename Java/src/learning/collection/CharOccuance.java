package learning.collection;

import java.util.HashMap;

public class CharOccuance {
	public static void main(String[] args) {
	String name="how to do java";
	HashMap<Character,Integer>occruanceMap=new HashMap<Character,Integer>();
	char[] strArray= name.toCharArray();
	for (char c:strArray) {
		/*
		 * if(occruanceMap.containsKey(c)) { occruanceMap.put(c, occruanceMap.get(c)+1);
		 * 
		 * } else { occruanceMap.put(c, 1);
		 * 
		 * }
		 */
		 occruanceMap.put(c, occruanceMap.getOrDefault(c, 0)+1);
	}
	System.out.println("name"+occruanceMap);
}
}
