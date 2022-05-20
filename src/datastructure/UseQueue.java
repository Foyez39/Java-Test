package datastructure;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {

		Queue<String> pq = new PriorityQueue<String>();

		pq.add("Apple");
		pq.add("Mango");
		pq.add("Banana");
		System.out.println(pq);

		pq.remove("Apple");
		System.out.println(pq);

		String head = pq.peek();
		System.out.println(head);


		Iterator iterator = pq.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next() + " ");

		}


		for (String item:pq) {
			System.out.println(item);
		}



		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

	}

}
