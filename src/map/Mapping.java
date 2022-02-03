package map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.sun.org.apache.bcel.internal.generic.Select;


public class Mapping {

	public static void main(String[] args) {
		//HashMapping 
		HashMap<String,Integer> Hm = new HashMap<>();
		Hm.put("emp1",11);
		Hm.put("emp2",12);
		Hm.put("emp3",13);
		Hm.put("emp4",14);
		
		System.out.println(Hm);
		
		Set<String> keys = Hm.keySet();
		
		for (Iterator<String> iterator = keys.iterator(); iterator.hasNext();) {
			String keys1 = (String) iterator.next();
			System.out.println(keys1 + ":"+ Hm.get(keys1));
			
		}
		System.out.println("---------------------------------");
		
		//HashTabl
		Hashtable<String,Integer>  Ht = new Hashtable<>();
		Ht.put("emp1",11);
		Ht.put("emp2",12);
		Ht.put("emp3",13);
		Ht.put("emp4",14);
		
		System.out.println(Ht);
		
		Set<String> key = Ht.keySet();
		
		for (Iterator<String> iterator = key.iterator(); iterator.hasNext();) {
			String keys2 = (String) iterator.next();
			System.out.println(keys2 + ":"+ Hm.get(keys2));
			
		}
		
		System.out.println("---------------------------------");
		
		//TreeSet
		TreeSet<String> Ts = new TreeSet<>();
		Ts.add("Ravi");
		Ts.add("Tanu");
		Ts.add("Vidya");
		Ts.add("Laxmi");
		
		System.out.println(Ts);
		
		Set<String> key3 = Ts.descendingSet();
		
		for (Iterator<String> iterator = key3.iterator(); iterator.hasNext();) {
			String key31 = (String) iterator.next();
			System.out.println(key31);
		}
		
		boolean key4 = Ts.equals(key3);
		System.out.println(key4);
		
		Ts.add("Hello");
		
		System.out.println(Ts);
		
		Ts.comparator();//copied from sorted set
		System.out.println(Ts);
		
		System.out.println("Highest String: "+Ts.pollFirst()); 
		
		System.out.println("Lowest String: "+Ts.pollLast());  
		
		
	}

}
