package learning.collection;

public class FindStringOrInt {
	
	public static void main(String[] args) {
		
		String str1="1234B";
		String str="1234";

		if(isNumber(str)) {
			System.out.println("Integer");
		}
		else {
			System.out.println("String");
		}
		
	}

	private static boolean isNumber(String str) {
		
		for(int i=0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))==false)
				return false;

		}
		
		return true;
	}

}
