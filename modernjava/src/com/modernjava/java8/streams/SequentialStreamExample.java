/**
 * 
 */
package com.modernjava.java8.streams;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.modernjava.java8.data.Student;
import com.modernjava.java8.data.StudentDataBase;

/**
 * @author Thara
 *@creation date & time: 11 Dec 2020 11:52:58 am
 */
public class SequentialStreamExample {

	Predicate<Student> p = s -> s.getGradeLevel()>=3;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//student name and there activities in a map
		Map<String, List<String>> map = StudentDataBase.getAllStudents().stream()
										.peek(student->System.out.println(student))
										.filter(s -> s.getGradeLevel()>=3)
										.peek(student->System.out.println("filter GL : " + student))
										.filter(s -> s.getGpa() >= 3.9)
										.peek(student->System.out.println("filter GPA : " + student))
										.filter(s->s.getGender() == "female")
										.peek(student->System.out.println("filter Gender : " + student))
										.collect(Collectors.toMap(Student::getName, Student::getActivities));
		
		System.out.println(map);
		
	}

}
