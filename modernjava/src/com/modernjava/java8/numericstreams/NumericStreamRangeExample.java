/**
 * 
 */
package com.modernjava.java8.numericstreams;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 * @author Thara
 *@creation date & time: 14 Dec 2020 9:07:45 pm
 */
public class NumericStreamRangeExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IntStream intStream = IntStream.range(1, 50);
		System.out.println(intStream.count());
		System.out.println("Int Stream Range and RangeClosed");
		IntStream.range(1, 50).forEach(value->System.out.print(value+","));
		System.out.println("\nIntStream range count : " + IntStream.range(1, 50).count());
		IntStream.rangeClosed(1, 50).forEach(value->System.out.print(value+","));
		System.out.println("\nIntStream rangeClosed count : " + IntStream.rangeClosed(1, 50).count());
		
		System.out.println();
		System.out.println("Long Stream Range and RangeClosed");
		LongStream.range(1, 50).forEach(value->System.out.print(value+","));
		System.out.println("\nLongStream range count : " + LongStream.range(1, 50).count());
		LongStream.rangeClosed(1, 50).forEach(value->System.out.print(value+","));
		System.out.println("\nLongStream rangeClosed count : " + LongStream.rangeClosed(1, 50).count());
		
		System.out.println();
		System.out.println("Double Stream Range and RangeClosed");
		IntStream.range(1, 50).asDoubleStream().forEach(value->System.out.print(value+","));
	}

}
