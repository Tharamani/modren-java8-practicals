/**
 * 
 */
package com.modernjava.java8.streams;

import java.util.List;
import java.util.stream.Collectors;

import com.modernjava.java8.data.Student;
import com.modernjava.java8.data.StudentDataBase;

/**
 * @author Thara
 *@creation date & time: 11 Dec 2020 3:27:24 pm
 */
public class StreamFilterExample {

	public static List<Student> filterStudents(){
		return StudentDataBase.getAllStudents().stream() //Stream<Student>
		.filter(student-> student.getGender().equals("female"))//Stream<Student>
		.filter(student-> student.getGpa()>=3.9)
		//Stream<Student> whoo's gender is only female
		.collect(Collectors.toList());
		 
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		filterStudents().forEach(System.out::println);

	}

}
