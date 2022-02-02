package com;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Animal {
	
	public static void main(String[] args) {
		
		ArrayList<Employee> a = new ArrayList<>();
		
		a.add(new Employee("suresh", 49.98));
		a.add(new Employee("mahesh", 34.45));
		a.add(new Employee("ramesh", 23.45));
		a.add(new Employee("rakesh", 67.32));
		
//		Predicate<Employee> p = e->e.salary>40;
//		for(Employee e1: a) {
//			if(p.test(e1)) {
//				System.out.println(e1.name+"...."+e1.salary);
//			}
//		}
		
		List<Employee> employee = a.stream().filter(e->e.salary>40).collect(Collectors.toList());
		
		for(Employee emp: employee) {
			System.out.println(emp.name+"..."+emp.salary);
		}
		
		
		
	}

}
