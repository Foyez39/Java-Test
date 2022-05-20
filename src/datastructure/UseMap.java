package datastructure;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class UseMap {

	public static void main(String[] args) {

		HashMap<String,String>list1=new HashMap<String,String>();


		list1.put("USA", "New York");
		list1.put("India", "Delhi");
		list1.put("UK", "London");
		list1.put("France", "Paris");
		list1.put("Spain", "Madrid");

		//Iterator

		Iterator<Map.Entry<String, String>> it = list1.entrySet().iterator();

		while(it.hasNext()) {
			Map.Entry<String, String> entry = it.next();
			System.out.println("key = "+ entry.getKey()+ " and value = " + entry.getValue());
		}

		/*Map<String, List<String>> list = new HashMap<String, List<String>>();

		ArrayList<String> carList = new ArrayList<String>();

		carList.add("toyota");
		carList.add("bmw");
		carList.add("honda");

		map.put("car", carList);  */



		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

	}

}
