/**
 * 
 */
package com.modernjava.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Thara
 * @creation date & time: 10 Dec 2020 2:44:11 pm
 */
public class ImperativeVsDeclarativeExample2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1, 2, 3, 3, 4, 5, 5, 6, 7, 8, 8, 9, 10);

		// remove all duplicates and hav unique list

		/**
		 * Approach 1: using Imperative Approach
		 */
		List<Integer> uniqueList = new ArrayList<Integer>();
		for (Integer integer : integers) {
			if (!uniqueList.contains(integer)) {
				uniqueList.add(integer);
			}
		}
		System.out.println("Imperative style for uniquelist : " + uniqueList);

		/**
		 * Approach 2: using Declarative Approach
		 */
		List<Integer> uniqueList1 = integers.stream().distinct().collect(Collectors.toList());
		System.out.println("Declarative style for uniquelist1 : " + uniqueList1);
	}

}
