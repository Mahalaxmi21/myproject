package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Vector;

public class Collectionoflist {

	public static void main(String[] args) {
		//creating array_list
		System.out.println("ArrayList");
		ArrayList<String> a = new ArrayList<String>();
		a.add("Bengalore");
		a.add("Delhi");
		a.add(2, "Hello");
		System.out.println(a);
		
		//creating vector
		System.out.println("\n");
		System.out.println("Vector");
		Vector<Integer> v = new Vector<>(); 
		v.addElement(15);
		v.add(5);
		v.add(0, 10);//0 is index values of 10
		v.add(3, 30);
		System.out.println(v);
		
		//creating linked list
		System.out.println("\n");
		System.out.println("Linked list");
		LinkedList<String> l = new LinkedList<>();
		l.add("Pooja");
		l.add(1, "Bengalore");
		l.addFirst("Hello");
		l.addLast("By");
		System.out.println(l);
		System.out.println("\n");
		l.pop();
		System.out.println(l);
		System.out.println("\n");
		l.push("Morning");
		System.out.println(l);
		System.out.println("\n");
		l.remove(0);
		System.out.println(l);
		System.out.println("\n");
		l.add(3, "wellcome");
		System.out.println(l);
		
		//Creating hash_set
		System.out.println("\n");
		HashSet<Integer> h =new HashSet<>();
		h.add(10);
		h.add(20);
		h.add(30);
		h.add(40);
		h.add(50);
		h.add(10);//Duplication value not allows
		System.out.println(h);
		
		//Creating Linkedhashlist
		System.out.println("\n");
		System.out.println("LinkedHasList");
		LinkedHashSet<Integer> Lh = new LinkedHashSet<>();
		Lh.add(10);
		Lh.add(20);
		Lh.add(30);
		Lh.add(40);
		System.out.println(Lh);
		
	}



}
