package learning.collection;

import java.util.HashSet;
import java.util.Set;

public class DuplicateCharinString {
	public static void main(String[] args) {
		String str="archana sinha";
		char[] charArray= str.toCharArray();//convert the string into sequence of character
		/*
		 * for(int i=0;i<str.length();i++) { for(int j=i+1;j<str.length();j++) {
		 * if(charArray[i] == charArray[j]) { System.out.println(charArray[j]+"");
		 * break; } } }
		 */
		Set<Character> setString= new HashSet<>();
		for (char c:charArray) {
			
		boolean added=setString.add(c);
		if(added) {
			System.out.println( "Added Character   "+c);
		}
		else {
			System.out.println("Duplicate Character  "+c);
		}
		}
		
	}

}
