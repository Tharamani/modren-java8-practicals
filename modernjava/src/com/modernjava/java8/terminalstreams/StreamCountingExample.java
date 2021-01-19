/**
 * 
 */
package com.modernjava.java8.terminalstreams;

import java.util.stream.Collectors;

import com.modernjava.java8.data.StudentDataBase;

/**
 * @author Thara
 * @creation date & time: 15 Dec 2020 8:18:22 am
 */
public class StreamCountingExample {

	public static Long count() {
		return StudentDataBase.getAllStudents().stream()
				.filter(student->student.getGpa()>=3.9)
				.collect(Collectors.counting());
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("count " + count());

	}

}
