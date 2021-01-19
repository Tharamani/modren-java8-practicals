/**
 * 
 */
package com.modernjava.java8.functionalinterfaces;

import java.util.List;
import java.util.function.Consumer;

import com.modernjava.java8.data.Student;
import com.modernjava.java8.data.StudentDataBase;

/**
 * @author Thara
 * @creation date & time: 10 Dec 2020 5:27:01 pm
 */
public class ConsumerExample {

	static Consumer<Student> consumerStudent = (student) -> System.out.println(student);
	static Consumer<Student> consumerName = (student) -> System.out.println("Student Name: " + student.getName());
	static Consumer<Student> consumerActivites = (student) -> System.out.println("Student Activities: " + student.getActivities());
	static Consumer<Student> consumerGradeLevel = (student) -> System.out.println("Grade level: " + student.getGradeLevel());
	static Consumer<Student> consumerGPA = (student) -> System.out.println("Gpa: " + student.getGpa());

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/**
		 * Implement Functional interfaces using lamda expressions
		 */
		Consumer<String> consumer = s -> System.out.println(s.toUpperCase());
		consumer.accept("Hello consumer");
		printStudent();
		printNameAndActivities();
		printNameAndActivitiesUsingConditions();
		printNameAndActivitiesUsingGradeAndGPA();
	}

	/**
	 * get all students from database
	 */
	public static void printStudent() {
		System.out.println("\nprint all students from db");
		List<Student> listStudent = StudentDataBase.getAllStudents();
		listStudent.forEach(consumerStudent);
	}

	/**
	 * print student name and list of activities particular student performs
	 */
	public static void printNameAndActivities() {
		System.out.println("\nprint NameAndActivities");
		List<Student> listStudent = StudentDataBase.getAllStudents();
		listStudent.forEach(consumerName.andThen(consumerActivites));
	}

	/**
	 * print students who's grade level greater than 3 along with the activities
	 */
	public static void printNameAndActivitiesUsingConditions() {
		System.out.println("\nprintName And Activities Using Conditions or filters");
		List<Student> listStudent = StudentDataBase.getAllStudents();
		listStudent.forEach(student -> {
			if (student.getGradeLevel() >= 3) {
				consumerName.andThen(consumerGradeLevel).andThen(consumerActivites).accept(student);
			}
		});
	}

	/**
	 * print students who's grade level greater than 3 and gpa greater than 3.9
	 * along with the activities
	 */
	public static void printNameAndActivitiesUsingGradeAndGPA() {
		System.out.println("\nprint Name And Activities Using GradeAndGPA");
		List<Student> listStudent = StudentDataBase.getAllStudents();
		listStudent.forEach(student -> {
			if (student.getGradeLevel() >= 3 && student.getGpa() > 3.9) {
				consumerName.andThen(consumerGradeLevel).andThen(consumerGPA).andThen(consumerActivites)
						.accept(student);
			}
		});
	}

}
