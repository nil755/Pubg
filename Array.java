package Collection;

import java.util.ArrayList;
import java.util.Iterator;



public class Array {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		System.out.println(al.isEmpty());   // true
		
		System.out.println(al.size());      // 0
		
		al.add("java");		// string
		al.add(50);			//int
		al.add('a');		//char
		al.add("java");		//duplicate
		
		System.out.println(al.isEmpty());
		System.out.println(al.size());
		
		System.out.println("-----------other methods-----");
		
		System.out.println(al.get(1));   			// 50
		System.out.println(al.indexOf("a"));		//2
		System.out.println(al.indexOf("java"));		//0
		System.out.println(al.lastIndexOf("java")); //3
		
		System.out.println("--------------");
		
		System.out.println(al.contains('a'));
		
		al.add(3,"test");
		System.out.println(al);
		al.remove(3);
		System.out.println(al);
		
		System.out.println("--------use of cursor--------");
		
		Iterator iter = al.iterator();
		while(iter.hasNext());
		System.out.println(iter.next());
		
		
		
		
		
		
	}

}
