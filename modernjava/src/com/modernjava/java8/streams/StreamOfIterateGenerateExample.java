/**
 * 
 */
package com.modernjava.java8.streams;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * @author Thara
 *@creation date & time: 14 Dec 2020 2:09:48 pm
 */
public class StreamOfIterateGenerateExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Stream<String> stringStream = Stream.of("Adam","Dan","Julie");
		stringStream.forEach(System.out::println);
		
		Stream.iterate(1, x->x*2)
		.limit(100).forEach(System.out::println);
		System.out.println();
		Supplier<Integer> integerSupplier = new Random()::nextInt;
		Stream.generate(integerSupplier)
		.limit(10)
		.forEach(System.out::println);
	}

}
