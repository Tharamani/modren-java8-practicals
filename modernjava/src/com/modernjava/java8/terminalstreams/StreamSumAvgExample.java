/**
 * 
 */
package com.modernjava.java8.terminalstreams;

import java.util.stream.Collectors;

import com.modernjava.java8.data.Student;
import com.modernjava.java8.data.StudentDataBase;

/**
 * @author Thara
 * @creation date & time: 15 Dec 2020 9:02:41 am
 */
public class StreamSumAvgExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("sumInt : " + sumInt());
		System.out.println("avgInt : " + avgInt());

	}

	public static int sumInt() {
		return StudentDataBase.getAllStudents().stream().collect(Collectors.summingInt(Student::getNoteBooks));
	}
	
	public static Double avgInt() {
		return StudentDataBase.getAllStudents().stream().collect(Collectors.averagingInt(Student::getNoteBooks));
	}

}
