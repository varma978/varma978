package com.skill.collectionframeworkk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListtUsingPrimitives {
	
public void arrayList() {
	List arr=new ArrayList();
	arr.add("Nagesh");
	arr.add("Vijay");
	arr.add("Ramesh");
	arr.add('$');
	arr.add('%');
	arr.add('&');
	arr.add(40000);
	arr.add(50000);
	arr.add(60000);
	System.out.println(arr);
	System.out.println("\n Using for loop");
	for(int i=0; i<arr.size(); i++)
		System.out.print(arr.get(i)+"\t");
	System.out.println("\n Using for each method");
	arr.forEach(Object->System.out.print(Object+"\t"));
	System.out.println("\n Using for each loop");
	for( Object x:arr)
		System.out.print(x+"\t");
	System.out.println("\n Using iterator");
	Iterator itr=arr.iterator();
	while (itr.hasNext())
	System.out.print(itr.next()+"\t");
	System.out.println("\n using list Iterator");
	ListIterator li= arr.listIterator();
	while (li.hasNext())
		System.out.print(li.next()+"\t");
		
	
}
	public static void main(String[] args) {
		ArrayListtUsingPrimitives abc = new ArrayListtUsingPrimitives();
		abc.arrayList();

	}

}
