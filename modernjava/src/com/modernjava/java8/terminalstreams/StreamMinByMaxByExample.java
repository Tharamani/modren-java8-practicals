/**
 * 
 */
package com.modernjava.java8.terminalstreams;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

import com.modernjava.java8.data.Student;
import com.modernjava.java8.data.StudentDataBase;

/**
 * @author Thara
 * @creation date & time: 15 Dec 2020 8:57:17 am
 */
public class StreamMinByMaxByExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("minBy : " + minBy());
		System.out.println("maxBy : " + maxBy());

	}

	public static Optional<Student> minBy() {
		return StudentDataBase.getAllStudents().stream()
				.collect(Collectors.minBy(Comparator.comparing(Student::getGpa)));

	}
	
	public static Optional<Student> maxBy() {
		return StudentDataBase.getAllStudents().stream()
				.collect(Collectors.maxBy(Comparator.comparing(Student::getGpa)));

	}

}
