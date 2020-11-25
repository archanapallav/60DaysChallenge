package learning.collection;

import java.util.Set;
import java.util.TreeSet;

/**
 * Create a value object of Fruit (Name , Color,Quantity) , Add 5 fruits to Set .
 *  Try adding same fruit multiple times and check if the Set has unique elements (duplicates not added) .
 * ( NB:  Implement hascode and equals Fruit value Object and learn its importance in Set)
 * @author arsinha2
 *
 */
public class Day4Challenge {
	
	public static void main(String args[]) {
		TreeSet<Fruits> fruitsSet= new TreeSet<Fruits>();

		Fruits fruit1= new Fruits();
		fruit1.setFruitName("Mango");
		Fruits fruit2= new Fruits();
		fruit2.setFruitName("Mango");
		Fruits fruit3= new Fruits();
		fruit3.setFruitName("Mango");
		Fruits fruit4= new Fruits();
		fruit4.setFruitName("Apple");
		Fruits fruit5= new Fruits();
		fruit5.setFruitName("Apple");
		fruitsSet.add(fruit1);
		fruitsSet.add(fruit2);
		fruitsSet.add(fruit3);
		fruitsSet.add(fruit4);



		
		System.out.println("fruitsSet");

	}

}
