/**
 * 
 */
package com.modernjava.java8.streams;

import com.modernjava.java8.data.StudentDataBase;

/**
 * @author Thara
 *@creation date & time: 14 Dec 2020 1:42:36 pm
 */
public class StreamMatchExample {

	public static boolean allMatch() {
		return StudentDataBase.getAllStudents().stream()
				.allMatch(student->student.getGpa()>=3.5);
	}
	
	public static boolean anyMatch() {
		return StudentDataBase.getAllStudents().stream()
				.anyMatch(student->student.getGpa()>=4.0);
	}
	
	public static boolean noneMatch() {
		return StudentDataBase.getAllStudents().stream()
				.noneMatch(student->student.getGpa()>=4.0);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("All MAtch : " + allMatch());
		System.out.println("Any MAtch : " + anyMatch());
		System.out.println("noneMatch  : " + noneMatch());
	}

}
