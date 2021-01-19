/**
 * 
 */
package com.modernjava.java8.methodrefrence;

import java.util.function.Function;

/**
 * @author Thara
 *@creation date & time: 11 Dec 2020 8:01:18 am
 */
public class FunctionMethodRefrenceExample {

	static Function<String, String> function = (s) -> s.toUpperCase();
	
	static Function<String, String> functionMR = String::toUpperCase;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//System.out.println("lamda function : " + function.apply("java8"));
		System.out.println("Method Refrence : " + function.apply("java8"));
	}

}
