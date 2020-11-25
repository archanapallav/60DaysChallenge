/*Approach: Count the number of 0s, 1s and 2s in the given array. Then store all the 0s in the beginning followed by all the 1s then all the 2s.
Algorithm:
Keep three counter c0 to count 0s, c1 to count 1s and c2 to count 2s
Traverse through the array and increase the count of c0 is the element is 0,increase the count of c1 is the element is 1 and increase the count of c2 is the element is 2
Now again traverse the array and replace first c0 elements with 0, next c1 elements with 1 and next c2 elements with 2.*/

package learning.collection;

public class SortAnArrayOfOs1s {

	public static void main(String[] args) {

		int arr[] = { 0, 1, 2, 0, 1, 2 };
		int n = arr.length;
		sortArray0sand1s(arr, n);

	}

	private static void sortArray0sand1s(int[] arr, int n) {

		int count0 = 0, count1 = 0, count2 = 0;

		/*
		 * for (i = 0; i < n; i++) { switch (arr[i]) { case 0: count0++; break;
		 * 
		 * case 1: count1++; break; case 2: count2++; break; } } i = 0;
		 * 
		 * while (count0 > 0) { arr[i++] = 0; count0--; } while (count1 > 0) { arr[i++]
		 * = 1; count1--; } while (count2 > 0) { arr[i++] = 2; count2--; }
		 */

		/*
		 * Count the number of 0’s, 1’s and 2’s. After Counting, put all 0’s first, then
		 * 1’s and lastly 2’s in the array. We traverse the array two times. Time
		 * complexity will be O(n).
		 */
		for (int i = 0; i < n; i++) {

			if (arr[i] == 0) {
				count0++;
			}
			if (arr[i] == 1) {
				count1++;

			}
			if (arr[i] == 2) {
				count2++;
			}
		}
		// Putting the 0's in the
		// array in starting.
		for (int i = 0; i < n; i++) {
			arr[i] = 0;
		}
		// Putting the 1's in the
		// array after the 0's.
		for (int i = count0; i < (count0 + count1); i++) {
			arr[i] = 1;

		}
		// Putting the 2's in the
		// array after the 1's
		for (int i = (count0 + count1); i < n; i++) {
			arr[i] = 2;
		}

		printArr(arr, n);

	}

	private static void printArr(int[] arr, int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i] + "");
		}
	}

}
