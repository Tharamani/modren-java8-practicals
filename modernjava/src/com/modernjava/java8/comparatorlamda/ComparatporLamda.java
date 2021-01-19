/**
 * 
 */
package com.modernjava.java8.comparatorlamda;

import java.util.Comparator;

/**
 * @author Thara
 * @creation date & time: 10 Dec 2020 4:56:01 pm
 */
public class ComparatporLamda {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/**
		 * implement comparator using prior java 8
		 */
		
		Comparator<Integer> comparator = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		};
		System.out.println("comparator using prior java 8: "+ "\n" + comparator.compare(3, 2));
		
		/**
		 * comparator using lamda java 8
		 */
		Comparator<Integer> comparatorLamda = (o1,o2) -> o1.compareTo(o2);
		System.out.println("comparator using lamda java 8: "+ "\n" + comparatorLamda.compare(3, 2));
	}

}
