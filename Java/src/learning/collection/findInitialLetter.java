package learning.collection;

public class findInitialLetter {

	public static void main(String[] args) {
		
		String name ="namish aryav verma";
		 printInitials(name);
		
	}

	private static void printInitials(String name) {
			if(name.length()==0)
				return;
			System.out.print(Character.toUpperCase(name.charAt(0)));
			
			
			for(int i=0;i<name.length();i++) {
				if(name.charAt(i)==' ') {
					System.out.print("  "+Character.toUpperCase(name.charAt(i + 1)));
				}
			}
	}
}
