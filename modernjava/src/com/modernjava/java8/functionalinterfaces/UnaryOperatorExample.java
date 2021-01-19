/**
 * 
 */
package com.modernjava.java8.functionalinterfaces;

import java.util.function.UnaryOperator;

/**
 * @author Thara
 *@creation date & time: 11 Dec 2020 7:35:39 am
 */
public class UnaryOperatorExample {

	static UnaryOperator<String> unaryOperator = (s) -> s.concat("default");
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(unaryOperator.apply("java8"));
	}

}
