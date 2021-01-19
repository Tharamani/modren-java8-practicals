/**
 * 
 */
package com.modernjava.java8.functionalinterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

/**
 * @author Thara
 *@creation date & time: 11 Dec 2020 7:40:15 am
 */
public class BinaryOperatorExample {

	static BinaryOperator<Integer> binaryOperator = (a,b) -> (a*b);
	
	static Comparator<Integer> comparator = (a,b) -> a.compareTo(b);
		
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(binaryOperator.apply(2, 6));
		System.out.println(" Result of maxBy : " + BinaryOperator.maxBy(comparator).apply(6, 9));
		
		System.out.println(" Result of minBy : " + BinaryOperator.minBy(comparator).apply(6, 9));
	}

}
