package collectionframework;

import java.util.Enumeration;
import java.util.Vector;

public class Vectorstudy {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add("Hi");
		v.add("Hello");
		v.add(12);
		v.add(12);
		
		System.out.println(v.get(3));
		v.add(null);
		System.out.println(v);
	
		v.set(2, "Hey");
		System.out.println(v);
		Enumeration en = v.elements();
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}
	}

}
