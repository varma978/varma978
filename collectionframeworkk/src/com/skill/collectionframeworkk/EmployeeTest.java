package com.skill.collectionframeworkk;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class EmployeeTest {
	LinkedHashMap <Integer,Employee> hm= new LinkedHashMap<Integer,Employee>();
public void learn() {
	Employee e1= new Employee("Nagesh", 4755, 45000.00);
	Employee e2= new Employee("Vijay", 6555, 82000.00);
	Employee e3= new Employee("Varma", 8256, 78000.00);
	hm.put(1, e1);
	hm.put(3, e3);
	hm.put(2, e2);
	display();
	
}
	private void display() {
	System.out.println("Using for Each Loop");
	for(Map.Entry<Integer, Employee> er: hm.entrySet()) {
		System.out.println(er.getKey()+"\t"+er.getValue().getName()+"\t"+er.getValue().getId()+"\t"+er.getValue().getSalary());
	}
	System.out.println("\n Using Iterator");
	Iterator itr=hm.entrySet().iterator();
	while(itr.hasNext()) {
		Map.Entry<Integer, Employee> err=(Entry<Integer,Employee>)itr.next();
		System.out.println(err.getKey()+"\t"+err.getValue().getName()+"\t"+err.getValue().getId()+"\t"+err.getValue().getSalary());
	}
	
}
	
	public static void main(String[] args) {
		EmployeeTest et=new EmployeeTest();
		et.learn();

	}

}
