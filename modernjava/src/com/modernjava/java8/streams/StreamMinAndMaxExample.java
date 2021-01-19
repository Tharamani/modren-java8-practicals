/**
 * 
 */
package com.modernjava.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author Thara
 * @creation date & time: 14 Dec 2020 11:40:58 am
 */
public class StreamMinAndMaxExample {

	/**
	 * with identity find max value
	 * @param integerList
	 * @return
	 */
	public static Integer findMaxValue(List<Integer> integerList) {
		// 6->y x=0,y=6 (0>6)=>x=6
		// 7->y x=6,y=7 (6>7)=>x=7
		// 8->y x=7,y=8 (7>8)=>x=8
		// 9->y x=8,y=9 (8>9)=>x=9
		// 10->y x=9,y=10 (9>10)=>x=10
		// 0->x
		// x will always store max value
		return integerList.stream().reduce(0, (x, y) -> x > y ? x : y);
	}
	
	/**
	 * without identity find max value
	 * @param integerList
	 * @return
	 */
	public static Optional<Integer> findMaxValueOptional(List<Integer> integerList) {
		// 6->y
		// 7->y
		// 8->y
		// 9->y
		// 10->y
		// x will always store max value
		// x=6,y=7 (0>6)=>x=7
		// x=7,y=8 (6>7)=>x=8
		// x=8,y=9 (7>8)=>x=9
		// x=9,y=10 (8>9)=>x=10
		//return integerList.stream().reduce(0, (x, y) -> x > y ? x : y);
		return integerList.stream().reduce((x, y) -> x > y ? x : y);

	}

	/**
	 * with identity find min value
	 * @param integerList
	 * @return
	 */
	public static Integer findMinValue(List<Integer> integerList) {
		// x=0
		// 6->y 0<6, x=0
		// 7->y 0<7, x=0
		// 8->y 0<8, x=0
		// 9->y 0<9, x=0
		// 10->y 0<10, x=0
		// x will always store 0 value.coz 0 will be compared with all the values in list and return 0 as min value rather than 6
		return integerList.stream().reduce(0,(x, y) -> x < y ? x : y);

	}
	
	/**
	 * without identity find min value
	 * @param integerList
	 * @return
	 */
	public static Optional<Integer> findMinValueOptional(List<Integer> integerList) {
		// 6->x 
		// 7->y x=6,y=7 (6<7)=>x=6
		// 8->y x=6,y=8 (6<8)=>x=6
		// 9->y x=6,y=9 (7>8)=>x=6
		// 10->y x=6,y=10 (8>9)=>x=6
		// x will always store min value i.e 6
		return integerList.stream().reduce((x, y) -> x < y ? x : y);

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(6, 7, 8, 9, 10);
		List<Integer> listEmpty = Arrays.asList();
		
		System.out.println("Max value : " + findMaxValue(list));
		System.out.println("Empty list : " + findMaxValue(listEmpty));
		
		System.out.println("\nfindMaxValueOptional max value : " + findMaxValueOptional(list).isPresent());
		System.out.println("findMaxValueOptional max value : " + findMaxValueOptional(list));
		
		System.out.println("\nfindMaxValueOptional Empty list : " + findMaxValueOptional(listEmpty).isPresent());
		
		System.out.println("****MIN-Value**********");
		System.out.println("Min value : " + findMinValue(list));
		System.out.println("Empty list : " + findMinValue(listEmpty));
		System.out.println("\nfindMinValueOptional Min value : " + findMinValueOptional(list).isPresent());
		System.out.println("findMinValueOptional Min value : " + findMinValueOptional(list));
		System.out.println("findMinValueOptional Empty list : " + findMaxValueOptional(listEmpty).isPresent());
	}

}
