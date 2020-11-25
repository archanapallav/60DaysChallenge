package learning.collection;

import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountWordPresentINString {
	
	public static void main(String[] args) {
		
		String word[]= {"Welcome", "to", "my", "house"};
		String str=" Come to my house we will party today";
		
		System.out.println(countOccurance(word,str));
	}

	private static int countOccurance(String[] word, String str) {
		
		int counter=0;
		
		//for extracting words
		Pattern p= Pattern.compile("[a-zA-Z]+");
		Matcher m= p.matcher(str);
		
		//HashSet for quick check whether a word in str present in word[] or not 
		
		HashSet<String> hs= new HashSet<>();
		
		for(String strg: word) {
			hs.add(strg);
		}
		
		while(m.find()) {
			if(hs.contains(m.group()))
				counter++;
			
		}
		return counter;
	}

}
