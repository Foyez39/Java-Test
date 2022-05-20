package datastructure;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> number = new ArrayList<Integer>();

		//adding elements
		number.add(10);
		number.add(20);
		number.add(30);
		number.add(40);
		number.add(50);
		number.add(60);


		//Removing elements

		number.remove(3);

	/*	for(int x : number) {
			System.out.print(" "+x);
		}

		*/

		Iterator itr = number.iterator();
		while(itr.hasNext()) {
			System.out.print(" "+itr.next());
		}



		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
	

	}

}
