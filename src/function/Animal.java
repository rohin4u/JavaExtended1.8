package function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Animal {
	
	public static void main(String[] args) {
		
		ArrayList<Employee> a = new ArrayList<>();
		
		a.add(new Employee(101, "suresh", 49.98));
		a.add(new Employee(102, "mahesh", 34.45));
		a.add(new Employee(103, "ramesh", 23.45));
		a.add(new Employee(104, "rakesh", 67.32));
		
		Function<Employee, String> f = e->e.name.concat(" Aegis");
		
		for(Employee e1 : a) {
			
			System.out.println(f.apply(e1));
		}
		
		
	}

}
