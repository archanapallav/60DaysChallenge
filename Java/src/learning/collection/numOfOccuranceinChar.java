package learning.collection;

public class numOfOccuranceinChar {
	
	public static void main(String[] args) {
		
		String s1= "Today is Wednesday";// count number of a in this string
		int count=0;
		for(char s:s1.toCharArray()) {
			if(s=='a') {
				count++;
				
			}
			
		}
		System.out.println("Character a contains:"+count);

	}

}
