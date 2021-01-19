/**
 * 
 */
package com.modernjava.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author Thara
 *@creation date & time: 14 Dec 2020 1:09:22 pm
 */
public class StreamLimitAndSkipExample {

	/**
	 * Limit
	 * @param integers
	 * @return
	 */
	public static Optional<Integer> limitNumbers(List<Integer> integers) {
		return integers.stream()//Stream<Integer> 6,7,8,9,10 
				//but will consider only 6,7 
				.limit(3)
				.reduce((x,y) -> (x+y));
	}
	
	/**
	 * skip
	 * @param integers
	 * @return
	 */
	public static Optional<Integer> skipNumbers(List<Integer> integers) {
		return integers.stream()//Stream<Integer> 6,7,8,9,10 
				//skip 6,7,8 and evaluate other numbers in list 
				.skip(3)
				.reduce((x,y) -> (x+y));
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(6,7,8,9,10);
		//List<Integer> integers = Arrays.asList();
		if(limitNumbers(integers).isPresent()) {
			System.out.println("Sum of integers using limit and reduce : " + limitNumbers(integers));
		}else {
			System.out.println("list empty : " + limitNumbers(integers));
		}
		
		if(skipNumbers(integers).isPresent()) {
			System.out.println("Sum of integers using skip and reduce : " + skipNumbers(integers));
		}else {
			System.out.println("list empty : " + skipNumbers(integers));
		}
			
	}

}
