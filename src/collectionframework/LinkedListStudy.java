package collectionframework;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListStudy {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add("Velocity");
		ll.add("Velocity");
		ll.add(12);
		ll.add(12);
		ll.add("pune");
		ll.add(null);
		System.out.println(ll);
	
		
		System.out.println(ll.peek());
		System.out.println(ll);
		
//		System.out.println(ll.get(2));
//		System.out.println(ll.remove());
//		System.out.println(ll);
		System.out.println(ll.poll());
		System.out.println(ll);
		System.out.println(ll.pop());
		System.out.println(ll);
		ll.push("Hi");
		System.out.println(ll);
	}

}
