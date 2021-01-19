/**
 * 
 */
package com.modernjava.java8;

import java.util.stream.IntStream;

/**
 * @author Thara
 * @creation date & time: 10 Dec 2020 2:32:41 pm
 */
public class ImperativeVsDeclarativeExample1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Imperative - how style of programming
		 */
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			sum+= i;
		}
		System.out.println("Imperative approach : " + sum);

		/**
		 * Declarative style of programming - what style of programming
		 * 
		 */
		int sum1 = IntStream.rangeClosed(0, 100)
				.parallel().sum();
		System.out.println("Declarative approach : " + sum1);
	}

}
