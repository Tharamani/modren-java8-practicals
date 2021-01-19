/**
 * 
 */
package com.modernjava.java8.functionalinterfaces;

import java.util.List;
import java.util.function.Predicate;

import com.modernjava.java8.data.Student;
import com.modernjava.java8.data.StudentDataBase;

/**
 * @author Thara
 *@creation date & time: 10 Dec 2020 8:30:21 pm
 */
public class PredicateStudentExample {

	static Predicate<Student> predicate = 
			(student) -> {
				System.out.println("PredicateStudentExample");
				return student.getGradeLevel()>=3;
			};
	static Predicate<Student> predicate1 = (student) -> student.getGpa()>=3.9;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		filterStudentGradeLevel();
		filterStudentGPA();
		filterStudents();
	}
	
	public static void filterStudentGradeLevel() {
		System.out.println("filter Student GradeLevel");
		
		List<Student>  list = StudentDataBase.getAllStudents();
		list.forEach(student -> {
			if(predicate.test(student)) {
				System.out.println(student);
			}
		});
	}
	
	public static void filterStudentGPA() {
		System.out.println("filter Student GPA");
		
		List<Student>  list = StudentDataBase.getAllStudents();
		list.forEach(student -> {
			if(predicate1.test(student)) {
				System.out.println(student);
			}
		});
	}
	
	public static void filterStudents() {
		System.out.println("filter Students using AND");
		
		List<Student>  list = StudentDataBase.getAllStudents();
		list.forEach(student -> {
			if(predicate1.and(predicate1).test(student)) {
				System.out.println(student);
			}
		});
	}

}
