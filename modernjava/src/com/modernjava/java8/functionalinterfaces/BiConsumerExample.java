/**
 * 
 */
package com.modernjava.java8.functionalinterfaces;

import java.util.List;
import java.util.function.BiConsumer;

import com.modernjava.java8.data.Student;
import com.modernjava.java8.data.StudentDataBase;

/**
 * @author Thara
 *@creation date & time: 10 Dec 2020 6:26:57 pm
 */
public class BiConsumerExample {

	static BiConsumer<String, List<String>> biConsumerNameAndActivities = (name,activites) -> {
		System.out.println(name + " & " + activites);
	};
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		BiConsumer<String, String> biConsumer = (a,b) -> {
			System.out.println("a : " + a + " \nb : " + b);
		};
		biConsumer.accept("Thara", "M P");
		
		BiConsumer<Integer, Integer> multiply = (a,b) -> {
			System.out.println("multiplcation of two numbers : " + (a*b));
		};
		//multiply.accept(6, 5);
		
		BiConsumer<Integer, Integer> division = (a,b) -> {
			System.out.println("Division of two numbers : " + (a/b));
		};
		multiply.andThen(division).accept(10, 5);
		
		nameAndActivities();
	}
	
	/**
	 * using bi-consumer ,print all student name and activities
	 */
	public static void nameAndActivities() {
		System.out.println("\n student name and activities");
		List<Student> list = StudentDataBase.getAllStudents();
		list.forEach(student -> {
			biConsumerNameAndActivities.accept(student.getName(), student.getActivities());
		});
	}

}
