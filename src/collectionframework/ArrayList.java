package collectionframework;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList {

	public static void main(String[] args) {
		java.util.ArrayList al=new java.util.ArrayList();
//		al.add("Kunal");
//		al.add(7.45);
//		al.add(87);
//		al.add(true);
//		al.add('A');
//		
//		System.out.println(al);
//		System.out.println(al.size());
//		al.remove(2);
//		al.set(1, 8.50);
//		
//		System.out.println(al);
		al.add("Hi");
		al.add("Hello");
		al.add("Hey");
		System.out.println(al);
		//Collections.sort(al);
		Collections.reverse(al);
		System.out.println(al);
//		
//		java.util.ArrayList al2=new java.util.ArrayList();
//		al2.addAll(al);
//		System.out.println(al2);
//		
		Iterator l = al.iterator();
		while(l.hasNext())
		{
			System.out.println(l.next());
		}
		for(int i=0;i<=al.size()-1;i++)
		{
			System.out.println(al.get(i));
		}
		
		ListIterator ll = al.listIterator();
		while(ll.hasNext())
		{
			System.out.println(ll.next());
		}
		
		for(Object a:al)
		{
			System.out.println(a);
		}
		System.out.println("==============");
		
	}

}














