package com.skill.collectionframeworkk;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapUsingPrimitives {
	HashMap<Integer,String> hm = new HashMap<Integer,String>();
	public void learn() {
		
		hm.put(101, "Nagesh");
		hm.put(102, "Varma");
		hm.put(103, "Vijay");
		hm.remove(102, "Varma");
		
		
		
		display();	
	}
	private void display() {
	System.out.println("\n Using For Each Loop");
		for(Map.Entry<Integer,String> entry: hm.entrySet())
		System.out.println( entry.getKey()+"\t"+entry.getValue());
		
		
		System.out.println("\n Using Iterator");
		Iterator itr=hm.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry<Integer, String> err=(Entry<Integer, String>)itr.next();
			System.out.println(err.getKey()+" "+err.getValue());
			
	}
	}


	public static void main(String[] args) {
		HashMapUsingPrimitives hmu= new HashMapUsingPrimitives();
		hmu.learn();

	}

}
