/**
 * 
 */
package com.modernjava.java8.functionalinterfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import com.modernjava.java8.data.Student;
import com.modernjava.java8.data.StudentDataBase;

/**
 * @author Thara
 *@creation date & time: 11 Dec 2020 6:15:35 am
 */
public class FunctionStudentExample {

	static Function<List<Student>, Map<String, Double>> function = (students) -> {
		
			Map<String, Double> studentMap = new HashMap<String, Double>();
		
		students.forEach(student -> {
			System.out.println("FunctionStudentExample");
			if(PredicateAndConsumerExample.p1.test(student)) {
			studentMap.put(student.getName(), student.getGpa());
			}
		});
		return studentMap;
	};
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(function.apply(StudentDataBase.getAllStudents()));
	}

}
