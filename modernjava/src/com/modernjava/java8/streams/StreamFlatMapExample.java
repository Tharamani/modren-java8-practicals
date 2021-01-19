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
 *@creation date & time: 11 Dec 2020 3:03:16 pm
 */
public class StreamFlatMapExample {

	public static List<String> printActivities(){
		List<String> activities = StudentDataBase.getAllStudents().stream()
		.map(Student::getActivities)
		.flatMap(List::stream)
		.distinct()
		.sorted()
		.collect(Collectors.toList());
		
		return activities;
	}
	
	public static Long printActivitiesCount(){
		Long activitiesCount = StudentDataBase.getAllStudents().stream()
		.map(Student::getActivities)
		.flatMap(List::stream)
		.distinct()
		.count();
		
		return activitiesCount;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(printActivities());
		System.out.println(printActivitiesCount());
	}

}
