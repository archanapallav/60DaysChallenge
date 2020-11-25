package learning.collection;

public class FirstIndexOf1InSortedArray {
	
	public static void main(String args[]) {
		
		int arr[]= {0,0,0,0,0,1,1,1,1};
		int n= arr.length;
		System.out.println(indexOfFirstOne(arr,n));
		
	}

	private static int indexOfFirstOne(int[] arr, int n) {
		for(int i=0;i<n;i++) {
			if(arr[i]==1) {
				return i;
			}
			
		}
		return n;
	}

}
