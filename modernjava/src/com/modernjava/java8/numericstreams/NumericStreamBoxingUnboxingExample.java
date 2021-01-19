/**
 * 
 */
package com.modernjava.java8.numericstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author Thara
 *@creation date & time: 14 Dec 2020 9:32:17 pm
 */
public class NumericStreamBoxingUnboxingExample {

	/**
	 * int to wrapper
	 * @param list
	 * @return
	 */
	public static List<Integer> boxing() {
		return IntStream.rangeClosed(1, 10)
				//input is int to Integer wrapper class
				.boxed().collect(Collectors.toList());
	}
	
	/**
	 * wrapper to int
	 * @param list
	 * @return
	 */
	public static int unBoxing(List<Integer> list) {
		return list.stream()//wrapper to primitive
					.mapToInt(Integer::intValue)
					.sum();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("boxing : " + boxing());
		System.out.println("unBoxing : " + unBoxing(boxing()));
	}

}
