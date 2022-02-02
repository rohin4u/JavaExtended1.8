package consumer;

import java.util.function.Consumer;

public class ConsumerImpl {

	public static void main(String[] args) {
		
		Student student = new Student(101, "Mayur");
		
		Consumer<Student> s1 = s->{
			System.out.println("Student id : "+s.id);
			System.out.println("Student name : "+s.name);
		};
		s1.accept(student);

	}
}
