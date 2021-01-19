/**
 * 
 */
package com.modernjava.java8.terminalstreams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.modernjava.java8.data.Student;
import com.modernjava.java8.data.StudentDataBase;

/**
 * @author Thara
 *@creation date & time: 15 Dec 2020 8:49:14 am
 */
public class StreamsMappingExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String>  nameList = StudentDataBase.getAllStudents().stream()
										.collect(Collectors.mapping(Student::getName, Collectors.toList()));
		System.out.println("nameList : " + nameList);
		
		Set<String>  nameSet = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.mapping(Student::getName, Collectors.toSet()));
		System.out.println("nameSet : " + nameSet);
		
	}

}
