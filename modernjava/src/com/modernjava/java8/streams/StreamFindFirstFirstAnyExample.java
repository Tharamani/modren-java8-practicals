/**
 * 
 */
package com.modernjava.java8.streams;

import java.util.List;
import java.util.Optional;

import com.modernjava.java8.data.Student;
import com.modernjava.java8.data.StudentDataBase;

/**
 * @author Thara
 * @creation date & time: 14 Dec 2020 1:50:23 pm
 */
public class StreamFindFirstFirstAnyExample {

	/**
	 * Find Any
	 * @param students
	 * @return
	 */
	public static Optional<Student> findAny(List<Student> students) {

		return students.stream().filter(student -> student.getGpa() >= 3.9).findAny();
	}

	/**
	 * Find First
	 * @param students
	 * @return
	 */
	public static Optional<Student> findFirst(List<Student> students) {

		return students.stream().filter(student -> student.getGpa() >= 3.5).findFirst();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Optional<Student> optionalFindAny = findAny(StudentDataBase.getAllStudents());
		if (optionalFindAny.isPresent()) {
			System.out.println(" optionalFindAny find any: " + optionalFindAny.get());
		} else {
			System.out.println("optionalFindAny find any failed ");
		}

		Optional<Student> optionalFindFirst = findFirst(StudentDataBase.getAllStudents());
		if (optionalFindFirst.isPresent()) {
			System.out.println("\noptionalFindFirst find first: " + optionalFindFirst.get());
		} else {
			System.out.println("optionalFindFirst find first failed ");
		}
	}

}
