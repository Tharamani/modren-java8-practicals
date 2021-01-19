/**
 * 
 */
package com.modernjava.java8.functionalinterfaces;

import java.util.function.Function;

/**
 * @author Thara
 *@creation date & time: 10 Dec 2020 9:13:07 pm
 */
public class FunctionExample {

	static Function<String, String> function = (name) -> {return name.toUpperCase();};
	
	static Function<String, String> f2 = (name) -> {return name.toUpperCase().concat("default");};
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Result : " + function.apply("Hello"));
		System.out.println("Result of andThen : " + function.andThen(f2).apply("java8"));
		System.out.println("Result of compose : " + function.compose(f2).apply("compose"));
	}

}
