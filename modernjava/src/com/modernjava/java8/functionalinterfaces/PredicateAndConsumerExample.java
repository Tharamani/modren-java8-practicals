/**
 * 
 */
package com.modernjava.java8.functionalinterfaces;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.modernjava.java8.data.Student;
import com.modernjava.java8.data.StudentDataBase;

/**
 * @author Thara
 *@creation date & time: 10 Dec 2020 8:48:28 pm
 */
public class PredicateAndConsumerExample {

	static Predicate<Student> p1 = (s) -> s.getGradeLevel()>=3;
	static Predicate<Student> p2 = (s) -> s.getGpa()>=3.9;
	
	static BiPredicate<Integer, Double> p3 = (gradeLevel, gpa) -> gradeLevel>=3 && gpa>=3.9;
	
	static BiConsumer<String, List<String>> biConsumer = (name, activities) -> System.out.println(name + " : " + activities);
	
	static Consumer<Student> consumer = (student) -> {
		if(p3.test(student.getGradeLevel(), student.getGpa())) {
		//if(p1.and(p2).test(student)) {
			biConsumer.accept(student.getName(), student.getActivities());
		}
		
	};
	
	public static void prindNameAndActivities(List<Student> list) {
		list.forEach(consumer);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Student> list = StudentDataBase.getAllStudents();
		
		new PredicateAndConsumerExample().prindNameAndActivities(list);
	}

}
