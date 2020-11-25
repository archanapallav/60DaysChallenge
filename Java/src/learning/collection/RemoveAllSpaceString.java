package learning.collection;

public class RemoveAllSpaceString {
	public static void main(String[] args) {
		
		String name ="Arc  hana      Sinha      ";
		name=name.replaceAll("\\s","" );
		System.out.println(name);//replaceAll("\\s", "");
		//where \\s is a single space in unicode
	}

}
