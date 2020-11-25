package learning.collection;

public class CountWordInString {

	private static final int OUT = 0;
    private static final int IN = 1; 

	public static void main(String[] args) {
		String str1="One two     three \n four\tfive";
		System.out.println("No. of words:"+countWords(str1));
	}

	private static int countWords(String str1) {
		
		int state = OUT;
		int wc=0;
		int i=0;
		
		// Scan all characters one by one
		while(i<str1.length()) {
			// If next character is a separator, set the  
            // state as OUT 
			
			if(str1.charAt(i)==' ' || str1.charAt(i)=='\n' || str1.charAt(i)=='\t')
				state=OUT;
			//If next character is not a word separator 
            // and state is OUT, then set the state as IN 
            // and increment word count 
			
			else if (state == OUT) {
				state = IN;
				++wc;
				
			}
            // Move to next character 
			++i;
		}
		
		return wc;
	}
	
}
