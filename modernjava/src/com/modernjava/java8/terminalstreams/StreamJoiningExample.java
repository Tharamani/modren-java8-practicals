/**
 * 
 */
package com.modernjava.java8.terminalstreams;

import java.util.stream.Collectors;

import com.modernjava.java8.data.Student;
import com.modernjava.java8.data.StudentDataBase;

/**
 * @author Thara
 * @creation date & time: 15 Dec 2020 8:18:22 am
 */
public class StreamJoiningExample {

	public static String joining_1() {
		return StudentDataBase.getAllStudents().stream().map(Student::getName).collect(Collectors.joining());
	}

	public static String joining_2() {
		return StudentDataBase.getAllStudents().stream().map(Student::getName).collect(Collectors.joining("-"));
	}

	public static String joining_3() {
		return StudentDataBase.getAllStudents().stream().map(Student::getName)
				.collect(Collectors.joining("-", "(", ")"));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("joining_1 " + joining_1());
		System.out.println("joining_2 " + joining_2());
		System.out.println("joining_3 " + joining_3());

	}

}
