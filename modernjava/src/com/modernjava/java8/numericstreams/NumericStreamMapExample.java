/**
 * 
 */
package com.modernjava.java8.numericstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author Thara
 * @creation date & time: 15 Dec 2020 7:52:31 am
 */
public class NumericStreamMapExample {

	public static List<Integer> mapToObj() {
		return IntStream.rangeClosed(1, 5).mapToObj((i) -> {
			return new Integer(i);
		}).collect(Collectors.toList());
	}
	
	public static double mapToDouble() {
		return IntStream.rangeClosed(1, 5)//intstream
						.mapToDouble((i) -> i)
						.sum();
	}
	
	public static long mapToLong() {
		return IntStream.rangeClosed(1, 5)//intstream
						.mapToLong((i) -> i)//i is passed from intstream
						.sum();//convert intstream to Longstream
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("map to Obj : " + mapToObj());
		System.out.println("map to Long : " + mapToLong());
		System.out.println("map to Double : " + mapToDouble());
	}

}
