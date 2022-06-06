package com.skill.collectionframeworkk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class StudentTest {
	List <Student> arr = new ArrayList();
	public void learn() {
		Student s1= new Student("nagesh", 1622, 45000.00);
		Student s2= new Student("Vijay", 4532, 35000.00);
		Student s3= new Student("Ramesh", 6547, 52000.00);
		arr.add(s1);
		arr.add(s2);
		arr.add(s3);
		display();
		}
	private void display() {
		System.out.println("\n Using For Loop");
		for (int i=0; i<arr.size(); i++) {
			Student s=(Student)arr.get(i);
	System.out.println(s.getName()+"\t"+s.getRollNum()+"\t"+s.getFeez());
		}	
		System.out.println("\n Using for each method");
		arr.forEach(Student->System.out.println(Student.getName()+"\t"+Student.getRollNum()+"\t"+Student.getFeez()+"\t"));
		System.out.println("\n Using for each loop");
		for(Student y:arr)
			System.out.println(y.getName()+"\t"+y.getRollNum()+"\t"+y.getFeez());
		System.out.println("\n Using Iterator");
		Iterator z=arr.iterator();
		while (z.hasNext()) {
			Student ss=(Student)z.next();
		System.out.println(ss.getName()+"\t"+ss.getRollNum()+"\t"+ss.getFeez());
		}
		System.out.println("\n Using List Iterator");
		ListIterator li=arr.listIterator();
		while (li.hasNext()) {
			Student sss=(Student)li.next();
		System.out.println(sss.getName()+"\t"+sss.getRollNum()+"\t"+sss.getFeez());
		}
		System.out.println("------------------------------------------");
		while (li.hasPrevious()) {
			Student sss=(Student)li.previous();
		System.out.println(sss.getName()+"\t"+sss.getRollNum()+"\t"+sss.getFeez());
		}
		
	}


	public static void main(String[] args) {
		StudentTest st=new StudentTest ();
		st.learn();
		}

}
