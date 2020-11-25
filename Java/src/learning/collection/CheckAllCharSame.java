package learning.collection;

import java.util.HashSet;
import java.util.Set;

public class CheckAllCharSame {

	public static void main(String[] args) {
		
		String str="aaab";
		
		if(allCharecterSame(str)) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}

	private static boolean allCharSame(String str) {
		
		int n= str.length();
		for (int i=0;i<n;i++) {
			if(str.charAt(i)!=str.charAt(0)) {
				return false;
			}
		}
		return true;
	}
	
	private static boolean allCharecterSame(String str) {
		int n= str.length();
		/*
		Set<Character> set= new HashSet<>();
		for(int i=0;i<n;i++) {
			set.add(str.charAt(i));
		}
		return set.size()==1;
	*/
		Set<Character> set= new HashSet<>();
		set.add(str.charAt(0));
		for(int i=1;i<n;i++) {
			boolean added= set.add(str.charAt(i));
			if(added)
				return false;
		}
		return true;
	}
}
