/**
 * 
 */
package com.modernjava.java8.methodrefrence;

import java.util.function.Predicate;

import com.modernjava.java8.data.Student;
import com.modernjava.java8.data.StudentDataBase;

/**
 * @author Thara
 *@creation date & time: 11 Dec 2020 8:36:29 am
 */
public class RefactorMRExample {

	//static Predicate<Student> predicate = (student) -> student.getGradeLevel()>=3;
	
	static Predicate<Student> predicate = RefactorMRExample::greaterThanGradeLevel;
		
	public static boolean greaterThanGradeLevel(Student s) {
		return s.getGradeLevel()>=3;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(predicate.test(StudentDataBase.studentSupplier.get()));
		
	}

}
