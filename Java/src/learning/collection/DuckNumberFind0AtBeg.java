package learning.collection;

public class DuckNumberFind0AtBeg {
	
	public static void main(String[] args) {
		
		String num="0123";
		if(check_duck_num(num)) {
			System.out.println("It is a duck number");
		}
		else {
			System.out.println("It is not a duck number");
		}
	}

	private static boolean check_duck_num(String num) {
		
		int i=0, n=num.length();
		while (i<n && num.charAt(i)=='0') {
			i++;
		}
		while(i<n) {
			if(num.charAt(i)=='0')
				return true;
			i++;
		}
		return false;
	}

}
