package learning.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/***
 * 
 * @author arsinha2
 * Write a Java Program , to store list of n numbers in a ArrayList. 
 * The program should take input from user and add N numbers to ArrayList (1-N).
 *
 */
public class Day1Challenge {
	
	public static void main(String[] args) {
		System.out.println("Enter the n number of arrayList");
		Scanner sc=new Scanner(System.in);
		int num= sc.nextInt();
		List<Integer> l=new ArrayList<Integer>();
		for(int i=1;i<=num;i++) {
			l.add(i);
		}
		System.out.print("ArrayList:"+l);
	}
}
