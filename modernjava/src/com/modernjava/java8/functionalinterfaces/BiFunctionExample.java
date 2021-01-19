/**
 * 
 */
package com.modernjava.java8.functionalinterfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import com.modernjava.java8.data.Student;
import com.modernjava.java8.data.StudentDataBase;

/**
 * @author Thara
 *@creation date & time: 11 Dec 2020 6:48:18 am
 */
public class BiFunctionExample {

	static BiFunction<List<Student>, Predicate<Student>, Map<String,Double>> 
		biFunction = ((students, studentPredicate) -> {
				Map<String, Double> map = new HashMap<String,Double>();
			students.forEach(student -> {
				if(studentPredicate.test(student)) {
					map.put(student.getName(), student.getGpa());
				}
			});
			return map;
		});
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(biFunction
				.apply(StudentDataBase.getAllStudents(), PredicateStudentExample.predicate));

	}

}
