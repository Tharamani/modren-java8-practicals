/**
 * 
 */
package com.modernjava.java8.numericstreams;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 * @author Thara
 *@creation date & time: 14 Dec 2020 9:20:06 pm
 */
public class NumericStreamAggregateExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) { 
		int sum = IntStream.rangeClosed(1,50).sum();
		System.out.println("Sum val : " + sum);
		
		//OptionalInt max = IntStream.rangeClosed(0,0).max();
		OptionalInt max = IntStream.rangeClosed(1,50).max();
		System.out.println(max.isPresent() ? max.getAsInt() : 0);
		//System.out.println("max val : " + max);

		OptionalLong min = LongStream.rangeClosed(1,50).min();
		System.out.println(min.isPresent() ? min.getAsLong() : 0);
		
		OptionalDouble avg = IntStream.rangeClosed(1,50).average();
		System.out.println(avg.isPresent() ? avg.getAsDouble() : 0);
	}

}
