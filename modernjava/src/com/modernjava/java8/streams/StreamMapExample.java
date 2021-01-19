/**
 * 
 */
package com.modernjava.java8.streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.modernjava.java8.data.Student;
import com.modernjava.java8.data.StudentDataBase;

/**
 * @author Thara
 * @creation date & time: 11 Dec 2020 2:30:03 pm
 */
public class StreamMapExample {

	//map() converts from one data type(ListStudent) to another(ListString)
	public static Set<String> nameList() {

		Set<String> list = StudentDataBase.getAllStudents().stream()
				.peek(student->System.out.println(student))
				// Student as an input -> Student name
				.map(Student::getName) // stream<String> //Data conversions
				.peek(student->System.out.println(student))
				.map(String::toUpperCase) //performing operations
				.peek(student->System.out.println(student))
//				.collect(Collectors.toList());// List<String>
				.collect(Collectors.toSet());// Set<String>
		return list;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(nameList());
	}

}
