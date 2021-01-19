/**
 * 
 */
package com.modernjava.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.modernjava.java8.data.Student;
import com.modernjava.java8.data.StudentDataBase;

/**
 * @author Thara
 * @creation date & time: 11 Dec 2020 7:06:52 pm
 */
public class StreamReduceExample {

	public static int performMultiplication(List<Integer> integersList) {
		// a=1 //a=1,b=1(from stream)=>result 1 is returned(default value for identity
		// type)
		// a=3 -> //a=1,b=3(from stream)=>result 3 is returned
		// a=15 -> //a=3,b=5(from stream)=>result 15 is returned
		// a=105 -> //a=3,b=5(from stream)=>result 105 is returned
		return integersList.stream().reduce(1, (a, b) -> a * b);
	}

	public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> integersList) {

		return integersList.stream().reduce((a, b) -> a * b);
	}

	public static Optional<Student> getHighestGPAStudent() {

		return StudentDataBase.getAllStudents().stream().reduce((s1, s2) -> (s1.getGpa() > s2.getGpa() ? s1 : s2));/*{
			//reduce the code using ternary operator
			if (s1.getGpa() > s2.getGpa()) {
				return s1;
			} else {
				return s2;
			}
		});*/

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1, 3, 5, 7);

		List<Integer> integersEmptyList = Arrays.asList();

		System.out.println(performMultiplication(integers));

		Optional<Integer> optional = performMultiplicationWithoutIdentity(integers);
		System.out.println(optional.isPresent());
		System.out.println(optional.get());

		System.out.println();

		Optional<Integer> optional2 = performMultiplicationWithoutIdentity(integersEmptyList);
		System.out.println(optional2.isPresent());
		if (optional2.isPresent())
			System.out.println(optional2.get());

		Optional<Student> studentOptional = getHighestGPAStudent();
		if (getHighestGPAStudent().isPresent()) {
			System.out.println(studentOptional.get());
		}
	}
}
