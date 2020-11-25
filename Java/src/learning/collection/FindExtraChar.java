package learning.collection;
/*Add the character codes of both the strings.
 *  Minus character codes of smaller string from larger string and convert the result integer into character.*/
 
public class FindExtraChar {
	public static void main(String[] args) {
		
		String str1="abcd";
		String str2="bcade";
		
		char extraChar = findExtraChar(str1,str2);
	        System.out.println("Extra character: " + extraChar); 

			
		}

	private static char findExtraChar(String str1, String str2) {
		
		String smallStr;
		String largeStr;
		
		if(str1.length() > str2.length()) {
			largeStr=str1;
			smallStr=str2;
		}
		else {
			largeStr=str2;
			smallStr=str1;
		}
		int smallStrCodeTotal = 0;
		int largeStrCodeTotal= 0;
		int i;
		
		for(i=0;i<smallStr.length();i++) {
			smallStrCodeTotal+=smallStr.charAt(i);
			largeStrCodeTotal+=largeStr.charAt(i);
			
		}
		largeStrCodeTotal+=largeStr.charAt(i);
		int intChar=largeStrCodeTotal-smallStrCodeTotal;
		return(char)intChar;
	}	

}
