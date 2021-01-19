/**
 * 
 */
package com.modernjava.java8.terminalstreams;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import com.modernjava.java8.data.Student;
import com.modernjava.java8.data.StudentDataBase;

/**
 * @author Thara
 * @creation date & time: 15 Dec 2020 9:09:41 am
 */
public class GroupingByExample {

	public static void groupStudentsByGender() {
		Map<String, List<Student>> genderMap = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getGender));
		System.out.println(genderMap);
	}

	public static void customizedGroupingBy() {
		Map<String, List<Student>> genderMap = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(student -> (student.getGpa() > 3.8 ? "OUTSTANDING" : "AVERAGE")));
		System.out.println(genderMap);
	}

	public static void twoLevelGroupingBy() {
		Map<Integer, Map<Object, List<Student>>> genderMap = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getGradeLevel,
						(Collectors.groupingBy(student -> (student.getGpa() > 3.8 ? "OUTSTANDING" : "AVERAGE")))));
		System.out.println(genderMap);
	}

	public static void twoParamGroupingByAndSumming() {
		Map<String, Integer> genderMap = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getName, Collectors.summingInt(Student::getNoteBooks)));
		System.out.println(genderMap);
	}
	
	public static void threeArguementGroupingBy() {
		Map<String, Set<Student>> genderMap = StudentDataBase.getAllStudents()
				.stream()
				.collect(Collectors.groupingBy(Student::getName, LinkedHashMap::new, Collectors.toSet()));
		System.out.println(genderMap);
	}
	
	public static void calculateTopGpa() {
		Map<Integer, Optional<Student>> genderMap = StudentDataBase.getAllStudents()
				.stream()
				.collect(Collectors.groupingBy(Student::getGradeLevel, Collectors.maxBy(Comparator.comparing(Student::getGpa))));
		System.out.println(genderMap);
	}
	
	public static void collectingAndThen() {
		Map<Integer, Student> genderMap = StudentDataBase.getAllStudents()
				.stream()
				.collect(Collectors.groupingBy(Student::getGradeLevel, 
						Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Student::getGpa)),Optional::get)));
		System.out.println(genderMap);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		groupStudentsByGender();
		System.out.println();
		customizedGroupingBy();
		System.out.println();
		twoLevelGroupingBy();
		System.out.println();
		twoParamGroupingByAndSumming();
		System.out.println();
		threeArguementGroupingBy();
		System.out.println();
		calculateTopGpa();
		System.out.println();
		collectingAndThen();
	}

}
