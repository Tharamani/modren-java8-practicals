/**
 * 
 */
package com.modernjava.java8.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.modernjava.java8.data.Student;
import com.modernjava.java8.data.StudentDataBase;

/**
 * @author Thara
 *@creation date & time: 11 Dec 2020 3:14:53 pm
 */
public class StreamComparatorExample {

	public static List<Student> sortStudentByName(){
		return StudentDataBase.getAllStudents()
		.stream()
		.sorted(Comparator.comparing(Student::getName))
		.collect(Collectors.toList());
		
	}
	
	public static List<Student> sortStudentByGPA(){
		return StudentDataBase.getAllStudents()
		.stream()
		.sorted(Comparator.comparing(Student::getGpa))
		.collect(Collectors.toList());
	}
	
	public static List<Student> sortStudentByGPADesc(){
		return StudentDataBase.getAllStudents()
		.stream()
		.sorted(Comparator.comparing(Student::getGpa).reversed())
		.collect(Collectors.toList());
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Students sorted by name");
		sortStudentByName().forEach(System.out::println);
		
		System.out.println();
		System.out.println("Students sorted by GPA");
		sortStudentByGPA().forEach(System.out::println);
		
		System.out.println();
		System.out.println("Students sorted by GPA DESC");
		sortStudentByGPADesc().forEach(System.out::println);

	}

}
