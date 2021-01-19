/**
 * 
 */
package com.modernjava.java8.numericstreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @author Thara
 *@creation date & time: 14 Dec 2020 2:34:04 pm
 */
public class NumericStreamExample {

	public static int sumOfNumbers(List<Integer> integers) {
		return integers.stream()
					   .reduce(0, (x,y)->x+y);//unboxing to convert Integer to int
		
	}
	
	public static int sumOfNNumbersIntStream() {
		return IntStream.rangeClosed(1, 6)//1,2,3,4,5,6
						.sum();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1,2,3,4,5,6);
		System.out.println("Sum of numbers : " + sumOfNumbers(integers));
		
		System.out.println("Sum of numbers using IntStream : " + sumOfNNumbersIntStream());
	}

}
