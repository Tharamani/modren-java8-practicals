/**
 * 
 */
package com.modernjava.java8.functionalinterfaces;

import java.util.function.Predicate;

/**
 * @author Thara
 * @creation date & time: 10 Dec 2020 6:53:37 pm
 */
public class PredicateExample {

	static Predicate<Integer> predicate = (i) -> {
		return (i % 2 == 0);
	};
	static Predicate<Integer> predicate1 = (i) -> (i % 2 == 0);
	static Predicate<Integer> predicate2 = (i) -> (i % 5 == 0);

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/**
		 * check given number is even number
		 */

		System.out.println("given number is even? : " + predicate.test(10));
		System.out.println();
		System.out.println("Alternative , given number is even? : " + predicate1.test(10));
		predicateAnd();
		predicateOr();
		predicateNegate();
	}

	public static void predicateAnd() {

		System.out.println("\npredicate and result : " + predicate1.and(predicate2).test(10));
		System.out.println("predicate and result : " + predicate1.and(predicate2).test(9));
	}

	public static void predicateOr() {

		System.out.println("\npredicate or result : " + predicate1.or(predicate2).test(10));
		System.out.println("predicate and result : " + predicate1.or(predicate2).test(9));
		System.out.println("predicate or result : " + predicate1.or(predicate2).test(8));
	}

	public static void predicateNegate() {

		System.out.println("\npredicate Negate result : " + predicate1.negate().test(10));
		
	}

}
